package gestionPedidos;

abstract class Prenda {

	protected String nombre;
	protected double precio;
	protected Talla talla;
	protected String color;

	public Prenda(String nombre, double precio, Talla talla, String color) {
		this.nombre = nombre;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
	}
	
	public abstract void mostrarDetalles();
	
	public double getPrecio() {
		return this.precio;
	}
	
}
