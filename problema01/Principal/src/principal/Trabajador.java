package principal;

//cédula, nombres, correo, sueldo, mes del sueldo

public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String ce, String n, String co, double s, String ms) {
        cedula = ce;
        nombres = n;
        correo = co;
        sueldo = s;
        mesSueldo = ms;
    }
    
    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerCorreo(String n) {
        correo = n;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerMesSueldo(String n) {
        mesSueldo = n;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }
    
     @Override
    public String toString(){
        String data = String.format("Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del Sueldo: %s\n",
                obtenerCedula(),
                obtenerNombres(), obtenerCorreo(),
                obtenerSueldo(),obtenerMesSueldo());
        return data;
    }

    
}
