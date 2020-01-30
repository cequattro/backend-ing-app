/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.globalhub.rest.db;

import java.util.Vector;
/**
 *
 * @author Willy
 */
public class Clasesilla {

    public Clasesilla()
    {
        //Clase de Test de conexion a la BD
    }

    public static void main(String args[])
    {        
        System.out.println("Test iniciado... Espere...");
        Vector alumnos = Sql.consulta("SELECT date(main.datereg) as fecha, (select valuereg from `grantia`.`dayregister` i1 where date(i1.datereg)=date(main.datereg) order by datereg asc limit 1) as apertura, (select valuereg from `grantia`.`dayregister` i1 where date(i1.datereg)=date(main.datereg) order by datereg desc limit 1) as cierre,"+
        						"max(main.valuereg) as maximo, min(main.valuereg) as minimo FROM `grantia`.`dayregister` main group by date(main.datereg) ");//Con DB2
            for(int fils=1; fils<alumnos.size(); ++fils)
            {
            String[] unaFila= (String[]) alumnos.get(fils);
            System.out.println("fila:"+fils+" "+unaFila[0].toString()+" --- "+unaFila[1].toString()+" --- "+unaFila[2].toString()+" --- "+unaFila[3].toString()+" --- "+unaFila[4].toString());
            }
        System.out.println("Test finalizado satisfactoriamente...");
    }

}
