package constantes;

public class Constantes {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Carlos");
        Empleados empleado2 = new Empleados("Angie");
        Empleados empleado3 = new Empleados("Antonio");
        Empleados empleado4 = new Empleados("Maria");

        empleado1.cambiaSeccion("RRHH");

        System.out.println(empleado1.devuelveDatos());
        System.out.println(empleado2.devuelveDatos());
        System.out.println(empleado3.devuelveDatos());
        System.out.println(empleado4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());


    }

}

class Empleados {
    // final para constantes.
    private final String nombre;
    private String seccion;

    private int id;
    private static int idSiguiente = 1;

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administrativo";
        id = 1;
        id = idSiguiente;
        idSiguiente++;

    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la seccion es: " + seccion + " El id :" + id;
    }


    public static String dameIdSiguiente(){
        return "El id siguiente es: " + idSiguiente;
    }
}
