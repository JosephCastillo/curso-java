package disposicionbox;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * Clase principal de la aplicación
 * <p>
 * Inicia la interfaz gráfica y configura el cierre de la ventana.
 */

public class AppDisposicionBox {

	/**
	 * Método principal de la aplicación
	 * 
	 * @param Args Argumentos de la línea de comandos (no se usan en esta parte del
	 *             programa)
	 */
	public static void main(String[] Args) {

		// Crea e inicializa la ventana principal
		MarcoCaja miMarcoCaja = new MarcoCaja();

		// Configura el comportamiento de cierre
		miMarcoCaja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Hace visible la ventana principal
		miMarcoCaja.setVisible(true);

	}
}

/**
 * Ventana principal de la aplicación Herea de JFrame y define el título y
 * tamaño de la ventana
 */

class MarcoCaja extends JFrame {
	/**
	 * Constructor de MarcoCaja. Configura el título, tamaño de la ventana y
	 * organiza los componentes (etiquetas, campos de texto y botones) en cajas
	 * horizontales y verticales usando BoxLayout.
	 * 
	 * La disposición incluye:
	 * <ul>
	 * <li>Una fila para el campo de nombre.</li>
	 * <li>Una fila para el campo de contraseña.</li>
	 * <li>Una fila para los botones OK y Cancelar.</li>
	 * </ul>
	 */
	public MarcoCaja() {
		// Establece el título de la ventana
		setTitle("Disposiciones de JSWING");

		// Define la posición y tamaño de la ventana
		setBounds(600, 350, 200, 200);

		// --- Caja para el nombre ---
		JLabel rotulo1 = new JLabel("Nombre");
		JTextField texto1 = new JTextField(10);
		texto1.setMaximumSize(texto1.getPreferredSize());

		Box cajaH1 = Box.createHorizontalBox();
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10)); // Espaciador entre componentes
		cajaH1.add(texto1);

		// --- Caja para la contraseña ---
		JLabel rotulo2 = new JLabel("Contraseña");
		JTextField texto2 = new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());

		Box cajaH2 = Box.createHorizontalBox();
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);

		// --- Caja para los botones ---
		JButton boton1 = new JButton("OK");
		JButton boton2 = new JButton("Cancelar");

		Box cajaH3 = Box.createHorizontalBox();
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue()); // Separa los botones al máximo espacio posible
		cajaH3.add(boton2);

		// --- Caja vertical principal que agrupa las anteriores ---
		Box cajaVertical = Box.createVerticalBox();
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);

		// Añade la caja vertical al centro del BorderLayout
		add(cajaVertical, BorderLayout.CENTER);
	}
}
