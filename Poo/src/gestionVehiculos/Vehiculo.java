package gestionVehiculos;

public  class Vehiculo {

	private String color;
	private String placa;
	private String modelo;
	private String marca;
	private int maxVelocidad = 80;
	private int cantidadLlantas;
	private static int idCarro;
	private int id;
	
	
	public Vehiculo(String color, String placa, String modelo, String marca, int maxVelocidad, int cantidadLlantas) {
		this.color = color;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.maxVelocidad = maxVelocidad;
		this.cantidadLlantas = cantidadLlantas;
		++idCarro;
		id = idCarro;
	}
	
	public  String dameDatosVehiculo() {
		return 	"ID Carro: " + this.id + " "
				+"Color: " + this.color + " " 
				+ "Placa: " + this.placa + " " 
				+ "Modelo: " + this.modelo + " "
				+ "Marca: " + this.marca + " "
				+ "Maxima velocidad:" + this.maxVelocidad + " " 
				+ "Cantidad llantas: " + this.cantidadLlantas + " ";	
	}
	
	
	public final String obtenerIdVehiculo () {
		return "ID del vehiculo: " + this.id;
	}
	
	protected int obtenerMaxVelocidad() {
		return this.maxVelocidad;
	}
}


