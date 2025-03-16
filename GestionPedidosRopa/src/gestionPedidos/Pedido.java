package gestionPedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<Prenda> prendas;
	
	public Pedido() {
		prendas = new ArrayList<>();
	}
	
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
	}
	
	public void motrarPedido() {
		System.out.println("\n Pedido Detallado: ");
		for(Prenda p : prendas) {
			p.mostrarDetalles();
		}
		System.out.println("Total a pagar: $ " + calcularTotal());
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Prenda p: prendas) {
			total += p.getPrecio();
		}
		return total;
	}

}
