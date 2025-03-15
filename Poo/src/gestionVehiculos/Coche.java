package gestionVehiculos;

public class Coche extends Vehiculo{
	
	private int cantidadPuertas;
	
	public Coche(String color, String placa, String modelo, String marca, int maxVelocidad, int cantidadLlantas, int cantidadPuertas) {
		super(color, placa, modelo, marca, maxVelocidad, cantidadLlantas);
		this.cantidadPuertas = cantidadPuertas;
	}
	
	@Override
	public String dameDatosVehiculo() {
		return super.dameDatosVehiculo() + " Cantidad Puertas: " + this.cantidadPuertas;
	}
	
	public final int obtenerMaxVelocidad() {
		return super.obtenerMaxVelocidad(); 
	}

}
