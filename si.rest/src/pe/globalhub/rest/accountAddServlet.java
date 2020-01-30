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
@WebServlet("/accountAddServlet")
public class accountAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String tipo=request.getParameter("salida");
        
        String customer=request.getParameter("customer");
        
        String iban=request.getParameter("iban");
        String overallballance=request.getParameter("overallballance");
        String producttype=request.getParameter("producttype");
        String currency=request.getParameter("currency");
        
        //first store the account and after that you can add the customacc considering the new account id
        String defaultHolderType="H";
        
        
        
        
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
        Sql.ejecuta("INSERT INTO `account` (`accointid`, `iban`, `overallbalance`, `producttype`, `currency`) VALUES (NULL, '"+iban+"', '"+overallballance+"', '"+producttype+"', '"+currency+"');");
        String newAcc=Sql.getCampo("select max(accointid) from `grantia`.`account`");
        Sql.ejecuta("INSERT INTO `customacc` (`id`, `UUIDCustomer`, `accointid`, `holdertype`) VALUES (NULL, '"+customer+"', '"+newAcc+"', '"+defaultHolderType+"');");
        
        
        List<String> reporte=new ArrayList<String>();
        reporte.add("Result");
        reporte.add("OK");
		
        
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
