/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Paulina
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s\n",c.obtenerDataEstudiante().get(i));
        }
    }
    
}
