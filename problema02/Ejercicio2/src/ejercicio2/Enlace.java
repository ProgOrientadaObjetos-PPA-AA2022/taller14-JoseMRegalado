/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class Enlace {
    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarEstudiante(Estudiante estudiante) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,apellido, calificacion1,calificacion2,calificacion3) values ('%s', '%s', %f, %f, %f)",
                    estudiante.obtenerNombre(),estudiante.obtenerApellido(),estudiante.obtenerNota1(),estudiante.obtenerNota2(),estudiante.obtenerNota3());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    public ArrayList<Estudiante> obtenerDataEstudiante() {  
        ArrayList<Estudiante> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Estudiante es = new Estudiante();
                es.establecerNombre(rs.getString("nombre"));
                es.establecerApellido(rs.getString("apellido"));
                es.establecerNota1(rs.getDouble("calificacion1"));
                es.establecerNota2(rs.getDouble("calificacion2"));
                es.establecerNota3(rs.getDouble("calificacion3"));
                es.establecerPromedio();
                lista.add(es);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarEstudiante");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
}
