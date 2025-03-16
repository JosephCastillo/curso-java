package gestionPedidos;

public class Main {
	public static void main(String[] args) {
		// Crear prendas.

		Camiseta camiseta1 = new Camiseta("Camiseta Deportiva", 19.99, Talla.MEDIANO, "Azul", "Manga Corta");
		Pantalon pantalon1 = new Pantalon("Jeans Skinny", 49.99, Talla.GRANDE, "Negro", "Slim Fit");
		
		// Crear pedido
		Pedido pedido = new Pedido();
		pedido.agregarPrenda(camiseta1);
		pedido.agregarPrenda(pantalon1);
		
		// Mostrar Pedido
		
		pedido.motrarPedido();
		
	}
}
