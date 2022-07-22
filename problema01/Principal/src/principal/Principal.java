
package principal;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.Locale;
/**
 *
 * @author SALA I
 */
public class Principal {

    
    public static void main(String[] args) {
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);
        String continuar;
        sc.useLocale(Locale.US);
        do {
            
            System.out.print("Ingrese la cedula del "
                    + "trabajador que desea ingresar: ");
            String cedulaT = sc.nextLine();
            System.out.print("Ingrese los nombres del trabajador"
                    + " que desea ingresar: ");
            String nombresT = sc.nextLine();
            System.out.print("Ingrese el correo del "
                    + "trabajador que desea ingresar: ");
            String correoT = sc.nextLine();
            System.out.print("Ingrese el sueldo del trabajador"
                    + " que desea ingresar: ");
            double sueldoT = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese el mes del sueldo del "
                    + "trabajador que desea ingresar: ");
            String mesSueldoT = sc.nextLine();
            
            
            
            Trabajador trabajador = new Trabajador(cedulaT, nombresT, correoT, 
                    sueldoT, mesSueldoT);
            c.insertarTrabajador(trabajador);
            sc.nextLine();
            System.out.print("Desea ingresar otra ciudad?: ");
            continuar = sc.nextLine();
        } while (continuar.equals("Si"));
    }
    
}
