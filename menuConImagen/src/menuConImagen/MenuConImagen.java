package menuConImagen;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MenuConImagen {
	public static void main(String[] args){
		
		Marco menuConImagen = new Marco();
		menuConImagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuConImagen.setVisible(true);
		
	}
}

class Marco extends JFrame{
	public Marco() {
		setTitle("Menu con imagen");
		setBounds(180,90,400,400);
		
		//Panel principal del menú.
		Lamina miLaminaMenuConImagen = new Lamina();
		
		//Asignar barra de menú a la ventana.
		setJMenuBar(miLaminaMenuConImagen.getBarraMenu());
		
	}
}

class Lamina extends JPanel{
	public Lamina() {
		
		//Diseño tipo BorderLayout
		setLayout(new BorderLayout());
		
		//Crea la barra de menú
		menuConImagen = new JMenuBar();
		
		//Crea menu desplegables
		archivo = new JMenu("Archivo");
		edicion = new JMenu("Edición");
		herramientas = new JMenu("Herramientas");
		
		//Añadir menús a la barra de menú
		menuConImagen.add(archivo);
		menuConImagen.add(edicion);
		menuConImagen.add(herramientas);
		
	}
	
	
	//Devuelve la barra de menú para que el marco la use.
	public JMenuBar getBarraMenu(){
		return menuConImagen;
	}
	
	//ATRIBUTOS
	private JMenuBar menuConImagen; //Barra de menú.
	private JMenu archivo, edicion, herramientas;// Menus desplegables.
}
