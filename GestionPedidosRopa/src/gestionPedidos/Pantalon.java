package gestionPedidos;

class Pantalon extends Prenda {
	private String tipoCorte;
	public Pantalon(String nombre, double precio, Talla talla, String color, String tipoCorte) {
		super(nombre, precio, talla, color);
		this.tipoCorte = tipoCorte;
	}
	
	public void mostrarDetalles() {
		System.out.println("Pantalon: " + nombre + ", Precio: " + precio + ", Talla: " 
							+ talla + ", Color: " + color + ", Tipo Corte: " + tipoCorte);
	};
	
	
}
