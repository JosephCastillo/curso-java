package checkboxradiobutton;

import javax.swing.*;

public class AppCheckBoxRadioButton {
	public static void main(String[] args){
		VentanaCheckBoxRadioButton ventanaCheckBoxRadioButton = new VentanaCheckBoxRadioButton();
		ventanaCheckBoxRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaCheckBoxRadioButton.setVisible(true);
	}
}

class VentanaCheckBoxRadioButton extends JFrame{
	public VentanaCheckBoxRadioButton() {
		setBounds(500,300,550,400);
		
		//Panel principal del menú
		LaminaCheckBoxRadioButton miLaminaCheckBoxRadioButton = new LaminaCheckBoxRadioButton();
		
		//Asignar barra de menú a la ventana
		setJMenuBar(miLaminaCheckBoxRadioButton.ObtenerBarraMenu());
		setTitle("Uso de Checkbox y Radiobutton");
	}
}

class LaminaCheckBoxRadioButton extends JPanel{
	
	public LaminaCheckBoxRadioButton() {
		
		//Creamos al barra de menú
		menuCheckBoxRadioButtonBar = new JMenuBar();
		
		//Creamos menus desplegables
		archivo = new JMenu("Archivo");
		edicion = new JMenu("Edición");
		herramientas = new JMenu("Herramientas");
		
		//Añadir menus a la barra de menús
		menuCheckBoxRadioButtonBar.add(archivo);
		menuCheckBoxRadioButtonBar.add(edicion);
		menuCheckBoxRadioButtonBar.add(herramientas);
		
		//Crear items menú edición
		negrita = new JCheckBoxMenuItem("Negrita");
		cursiva = new JCheckBoxMenuItem("Cursiva");
		
		
		//Crear grupo para menú herramientas
		tamanioLetra = new ButtonGroup();
		
		
		//Crear items menú herramientas
		doce = new JRadioButtonMenuItem("12");
		diesciseis = new JRadioButtonMenuItem("16");
		veinte = new JRadioButtonMenuItem("20");
		veinticuatro = new JRadioButtonMenuItem("24");
		
		
		//Añadir items menú edición 
		edicion.add(negrita);
		edicion.add(cursiva);
		
		//Añadir items grupo para menú herramientas
		tamanioLetra.add(doce);
		tamanioLetra.add(diesciseis);
		tamanioLetra.add(veinte);
		tamanioLetra.add(veinticuatro);
		
		//Añadir items menú herramientas
		herramientas.add(doce);
		herramientas.add(diesciseis);
		herramientas.add(veinte);
		herramientas.add(veinticuatro);
		
		
	}
	
	//METODO: Retorna la barra de menú
	public JMenuBar ObtenerBarraMenu() {
		return menuCheckBoxRadioButtonBar;
	}
	
	
	//ATRIBUTOS
	private JMenuBar menuCheckBoxRadioButtonBar; // Barra de menú.
	private JMenu archivo, edicion, herramientas; // Menú desplegables
	private JCheckBoxMenuItem negrita, cursiva;
	private ButtonGroup  tamanioLetra;
	private JRadioButtonMenuItem doce, diesciseis, veinte, veinticuatro;
}
