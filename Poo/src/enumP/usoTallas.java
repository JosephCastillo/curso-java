package enumP;
import java.util.*;


public class usoTallas {

	// enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String dameAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	};

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entradaDatos = entrada.nextLine().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla: " + laTalla);
		System.out.println("Abreviatura: " + laTalla.abreviatura);
		
		entrada.close();

	}
}
