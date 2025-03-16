package gestionPedidos;

enum Talla {
	
	PEQUENIO("S"), MEDIANO("M"), GRANDE("L"), EXTRA_GRANDE("XL");
	
	
	private String abreviatura;
	
	private Talla(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	public String dameAbreviatura() {
		return abreviatura;
	}
	
	
	
}
