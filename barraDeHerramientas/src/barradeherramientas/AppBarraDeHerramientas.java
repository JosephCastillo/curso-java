package barradeherramientas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class AppBarraDeHerramientas {

	public static void main(String[] Args) {
		
		MarcoPrincipal marcoPrincipal = new MarcoPrincipal();
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoPrincipal.setVisible(true);
	}
	
}

class MarcoPrincipal extends JFrame{
	public MarcoPrincipal() {
		setTitle("Barra de herramientas");
		setBounds(200, 200, 600,400);
		JMenu color = new JMenu("Color");
		JMenuItem rojo = new JMenuItem("Rojo");
		JMenuItem azul = new JMenuItem("Azul");
		JMenuItem amarillo = new JMenuItem("Amarillo");
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/barradeherramientas/close.png")){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		};
		color.add(rojo);
		color.add(azul);
		color.add(amarillo);
		JMenuBar barraMenuColor = new JMenuBar();
		barraMenuColor.add(color);
		setJMenuBar(barraMenuColor);
		
		JToolBar barra = new JToolBar();
		barra.add(rojo);
		barra.add(azul);
		barra.add(amarillo);
		barra.addSeparator();
		barra.add(accionSalir);
		add(barra, BorderLayout.NORTH);
	}
}

