package modificadores2;

import modificadores.Clase3;

public class Clase2 {
	
	public static void main(String[] args) {
		
		Clase1 miObj = new Clase1();
		Clase3 miObj2 = new Clase3();
		
		
		miObj2.miVar = 4; // SE PUEDE ACCEDER GRACIAS AL MODIFICADOR DE ACCESO PROTECTED DE LA CASE 1
	}
	
}
