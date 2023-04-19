/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author damt108
 */
public class ConexionBBDD {
    
    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // esto por lo que entiendo utiliza el driver que bajamos (el jar)
    static final String USER = "root"; 
    static final String PASS = "1234";
    static final String BD = "nba"; // nombre de la base de datos
    //la direccion para conectar a la bbdd se le pasa como parametro "BD"
    static final String DB_URL = "jdbc:mysql://localhost:3306/"+BD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
       
    
    /**
     * Metodo para crear una conexion a la BBDD
     * @return 
     */
    public Connection conectar (){
        
        // ESTO NO ESTA BIEN LO DEJO COMO REFERENCIA.
        try {

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            if (con != null) {
                System.out.println("coneccion realizada");
            }
            
            

        } catch (SQLException ex) {
            System.err.println("problemas de coneccion\n" + ex.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
        
        return con;
        
    }

    /**
     * Metodo para desconectar la BBDD
     */
    public void desconectar(){
        
        try {
            
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }
    
}
