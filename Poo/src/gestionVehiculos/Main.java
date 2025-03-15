package gestionVehiculos;

public class Main {
	public static void main(String[] args) {
		Vehiculo miVehiculo = new Coche("Rojo", "AVC234", "2023", "Toyota", 180, 4, 4);

		if (miVehiculo instanceof Coche) {
			Coche miCoche = (Coche) miVehiculo;
			System.out.println(
					"El vehículo es un coche con " + miCoche.obtenerMaxVelocidad() + " km/h de velocidad máxima.");
		}

		try {
			Moto miMoto = (Moto) miVehiculo; // ❌ ERROR: No se puede convertir un Coche en una Moto
		} catch (ClassCastException e) {
			System.out.println("Error: No se puede convertir un Coche en una Moto.");
		}
	}
}