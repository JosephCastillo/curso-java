package appatajosteclado;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;



public class AppAtajosTeclado {
	public static void main(String[] args) {

		// Crea e inicializa la ventana principal de la aplicación
		MarcoPrincipal appMarcoPrincipal = new MarcoPrincipal();

		// Configura el cierre de la aplicación al cerrar la ventana
		appMarcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Hace visible la ventana principal
		appMarcoPrincipal.setVisible(true);

	}
}

/**
 * Ventana principal del procesador de texto con atajos de teclado.
 */

class MarcoPrincipal extends JFrame {
	public MarcoPrincipal() {
		// Establece el título de la ventana
		setTitle("Atajos teclado");
		// Define el tamaño y la posición inicial de la ventana
		setBounds(190, 180, 400, 400);

		// Crea e incorpora la lámina principal al marco
		LamninaTexto laminaTexto = new LamninaTexto();
		add(laminaTexto);

	}
}

/**
 * Lámina principal que contiene el área de edición de texto.
 */

class LamninaTexto extends JPanel {
	public LamninaTexto() {
		// Configura el layout del panel: BorderLayout
		setLayout(new BorderLayout());
		// Crea el área de edición de texto
		panelDeTexto = new JTextPane();
		// Crea un InputMap para que escuche las tecla cuando tengan el foco
		InputMap inputMap = panelDeTexto.getInputMap(JComponent.WHEN_FOCUSED);
		// Mapea cuando se pulse Ctrl + b, ejecuta la acción con nombre "Negrita"
		inputMap.put(KeyStroke.getKeyStroke("control B"), "negrita");
		// Mapea cuando se pulse Ctrl + i, ejecuta la acción con nombre "Cursiva"
		inputMap.put(KeyStroke.getKeyStroke("control I"), "cursiva");
		// Ejecuta la acción estándar de Swing para poner el texto en negrita
		panelDeTexto.getActionMap().put("negrita", new StyledEditorKit.BoldAction());
		// Ejecuta la acción estándar de Swing para poner el texto en cursiva
		panelDeTexto.getActionMap().put("cursiva", new StyledEditorKit.ItalicAction());
		// Asocia un scroll al área de texto para permitir el desplazamiento
		JScrollPane scrollPanel = new JScrollPane(panelDeTexto);
		// Añade el scroll al área central del BorderLayout
		add(scrollPanel, BorderLayout.CENTER);
	}

	// Área de texto de la lámina
	JTextPane panelDeTexto;
}
