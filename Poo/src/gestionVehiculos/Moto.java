package gestionVehiculos;

 public final class Moto extends Vehiculo{
	
	private boolean tieneBaul;
	
	public Moto(String color, String placa, String modelo, String marca, int maxVelocidad, int cantidadLlantas, boolean tieneBaul) {
		super(color, placa, modelo, marca, maxVelocidad, cantidadLlantas);
		this.tieneBaul = tieneBaul;
	}
	
	

	@Override
	public String dameDatosVehiculo() {
		return super.dameDatosVehiculo() + " Tiene baúl: " + (this.tieneBaul ? "Si" : "No");
	}
	
	
}
