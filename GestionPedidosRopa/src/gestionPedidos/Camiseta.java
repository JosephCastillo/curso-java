package gestionPedidos;

class Camiseta extends Prenda {

	private String tipoManga;

	public Camiseta(String nombre, double precio, Talla talla, String color, String tipoManga) {
		super(nombre, precio, talla, color);
		this.tipoManga = tipoManga;
	}
	
	@Override
	public void mostrarDetalles() {
        System.out.println("Camiseta: " + nombre + ", Precio: $" + precio +
                ", Talla: " + talla.dameAbreviatura() + ", Color: " + color +
                ", Tipo de Manga: " + tipoManga);
    }
}
