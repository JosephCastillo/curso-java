
package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Empleado [] misEmpleados = new Empleado[5];
        
        Jefatura jefeRRHH = new Jefatura("Andrea", 20000, 2023, 4, 2);
        jefeRRHH.estableceIncentivo(2000);

        misEmpleados[0] = new Empleado("Joseph Castillo", 1700000, 2019, 6, 15);
        misEmpleados[1] = new Empleado("Andres Castillo", 1800000, 2020, 8, 29);
        misEmpleados[2] = new Empleado("Camila Prieto", 1600000, 2024, 3, 31);
        misEmpleados[3] = new Empleado("Angie");
        misEmpleados[4] = jefeRRHH; //Polimorfismo en acción, Principio de sustitución.
        
        
        
        
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
        ++idSiguiente;
        id = idSiguiente;
    }

    public Empleado(String nom){
        this(nom, 3000, 2000, 01, 01);
    }


    public String dameNombre(){//getter
        return nombre + " Id: " + id;
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
    private static int idSiguiente;
    private int id;
}

class Jefatura extends Empleado {
	
	public Jefatura(String nom, double suel, int anio, int mes, int dia) {
		
		super(nom, suel, anio, mes, dia);
		
	}
	
	
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	
	private double incentivo;
	
	
	
	
}








































