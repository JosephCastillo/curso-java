package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
	public static void main(String[] args) {

		Persona[] lasPersonas = new Persona[2];

		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biológicas");

		for (Persona p : lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
	}
}

abstract class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String dameNombre() {
		return this.nombre;
	}

	public abstract String dameDescripcion();

}

class Empleado2 extends Persona {

	public Empleado2(String nombre, double suel, int anio, int mes, int dia) {

		super(nombre);
		sueldo = suel;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	public String dameDescripcion() {
		return "Este empleado tiene un id: " + this.id + " Con un sueldo: " + this.sueldo;
	}

	public double dameSueldo() {// getter
		return sueldo;
	}

	public Date dameAltaContrato() {// getter
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {// setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
}

class Alumno extends Persona {

	private String carrera;

	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}

	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera  de " + this.carrera;
	}
}
