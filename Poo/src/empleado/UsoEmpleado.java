
package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        // Empleado empleado1 = new Empleado("Joseph Castillo", 1700000, 2019, 6, 15);
        // Empleado empleado2 = new Empleado("Andres Castillo", 1800000, 2020, 8, 29);
        // Empleado empleado3 = new Empleado("Camila Prieto", 1600000, 2024, 3, 31);
        
        // empleado1.subeSueldo(5);
        // empleado2.subeSueldo(5);
        // empleado3.subeSueldo(5);

        // System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameAltaContrato());
        // System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameAltaContrato());
        // System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de alta: " + empleado3.dameAltaContrato());

        Empleado [] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Joseph Castillo", 1700000, 2019, 6, 15);
        misEmpleados[1] = new Empleado("Andres Castillo", 1800000, 2020, 8, 29);
        misEmpleados[2] = new Empleado("Camila Prieto", 1600000, 2024, 3, 31);

        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].subeSueldo(5);
        }

        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: " + empleado.dameNombre() + " Sueldo: " + empleado.dameSueldo() + " Alta: " + empleado.dameAltaContrato());
        }
    }

}

class Empleado {

    public Empleado(String nom, double suel, int anio, int mes, int dia) {
        nombre = nom;
        sueldo = suel;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    public String dameNombre(){//getter
        return nombre;
    }

    public double dameSueldo(){//getter
        return sueldo;
    }

    public Date dameAltaContrato(){//getter
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){//setter 
        double aumento = sueldo * porcentaje / 100;
        sueldo+=aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
