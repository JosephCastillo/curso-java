package appmenuemergente;

import javax.swing.*;

public class AppMenuEmergente {

	public static void main(String[] Args) {

		MarcoPrincipal marcoPrincipal = new MarcoPrincipal();
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoPrincipal.setVisible(true);

	}
}

class MarcoPrincipal extends JFrame {
	public MarcoPrincipal() {
		// Titulo de la ventana principal
		setTitle("Menú emergente");
		// Dimensiones ventana principal
		setBounds(180, 90, 400, 400);

		LaminaPrincipal emergenteLamina = new LaminaPrincipal();
		add(emergenteLamina);
	}
}

class LaminaPrincipal extends JPanel {
	public LaminaPrincipal() {
		// Creamos menú emergente
		menuEmergente = new JPopupMenu();
		// Creamos opción menú emergente
		opcion1 = new JMenuItem("Opción 1");
		opcion2 = new JMenuItem("Opción 2");
		opcion3 = new JMenuItem("Opción 3");

		// Agregamos ítem menú emergente
		menuEmergente.add(opcion1);
		menuEmergente.add(opcion2);
		menuEmergente.add(opcion3);

		// Asignamos menú emergente a la lámina principal
		setComponentPopupMenu(menuEmergente);

	}

	// ATRIBUTOS
	JPopupMenu menuEmergente;
	JMenuItem opcion1, opcion2, opcion3;
}
