package gestionVehiculos;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		Vehiculo[] vehiculos = new Vehiculo[3];
		
		vehiculos[0] = new Coche("Verde", "HJC-123", "1993", "Chevilot", 80, 4, 4);
		vehiculos[1] = new Moto("Amarilla", "JFS-42", "2025", "Auteco", 120, 2, false);
		vehiculos[2] = new Coche("Rojo", "JJJ-234", "2000", "Renulti", 120, 4, 5);
		
		
		for(Vehiculo e: vehiculos) {
			mostrarDatosVehiculo(e);
		
		}
		
		//Llamamos al nuevo método que usa polimorfismo.
		
		
	}
	//Método que recibe cualquier tipo de vehiculo y aplica polimorfismo.
	
	
	public static void mostrarDatosVehiculo(Vehiculo v) {
		System.out.println(v.dameDatosVehiculo());
	}

	
}
