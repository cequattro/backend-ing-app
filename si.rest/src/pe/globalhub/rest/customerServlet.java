package pe.globalhub.rest;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.globalhub.rest.db.*;

/**
 * Servlet implementation class restServlet
 */
@WebServlet("/customerServlet")
public class customerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String tipo=request.getParameter("salida");
        boolean encapsularJS=false;
        if(tipo!=null)
        {
            if("application/json".equalsIgnoreCase(tipo))
            {
                encapsularJS=false;
            }
            else if("application/javascript".equalsIgnoreCase(tipo))
            {
                encapsularJS=true;
            }
        }
        else
        {//por defecto la salida es application/json
            tipo="application/json";
            encapsularJS=false;
        }
        
        response.setContentType(tipo+";charset=UTF-8");      
        //enable CORS in java servlet
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, PUT, POST, OPTIONS, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "86400");
        //end enable CORS in java servlet
        try {
            /* TODO output your page here. You may use following sample code. */
        	PrintWriter out = response.getWriter();
            
        objeto obj = new objeto();
        
        //
        List<customer> reporte=new ArrayList<customer>();
        Vector alumnos = Sql.consulta("SELECT UUIDCustomer, name, surname, address, email FROM `grantia`.`customer` ");//Con DB2
		for(int fils=1; fils<alumnos.size(); ++fils)
		{
		String[] unaFila= (String[]) alumnos.get(fils);
		System.out.println("fila:"+fils+" "+unaFila[0].toString()+" --- "+unaFila[1].toString()+" --- "+unaFila[2].toString()+" --- "+unaFila[3].toString()+" --- "+unaFila[4].toString());
		reporte.add(new customer(Integer.parseInt(unaFila[0].toString()), unaFila[1].toString(), unaFila[2].toString(), unaFila[3].toString(), unaFila[4].toString()));
		}//(int uUIDCustomer, String name, String surname,String address, String email)
		
        
	Gson gson = new Gson();
        //String json = gson.toJson(reporte);
	String json = gson.toJson(reporte);//obj
        if(encapsularJS)
        {
            out.println("callback("+json+");");             
        }
        else
        {
            out.println(json);
        }                   
        }
        catch(Exception e)
        {
        	System.out.println("Excepcion detectada "+e.getMessage());
        	e.printStackTrace();
        }
        finally
        {
        	System.out.println("Termino de pintar :p");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
