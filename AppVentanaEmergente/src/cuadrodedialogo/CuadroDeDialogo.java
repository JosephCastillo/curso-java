package cuadrodedialogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CuadroDeDialogo {
	public static void main(String[] Args) {
		MarcoPrincipal miMarcoPrincipal = new MarcoPrincipal();
		miMarcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarcoPrincipal.setVisible(true);
	}
}

class MarcoPrincipal extends JFrame {
	public MarcoPrincipal() {
		setTitle("Cuadros de dialogo");
		setBounds(200, 200, 400, 300);

		LaminaPrincipal miLaminaPrincipal = new LaminaPrincipal();
		add(miLaminaPrincipal);
	}
}

class LaminaPrincipal extends JPanel {

	JButton boton1, boton2, boton3, boton4;

	public LaminaPrincipal() {

		boton1 = new JButton("Cuadro de dialogo 1");
		boton2 = new JButton("Cuadro de dialogo 2");
		boton3 = new JButton("Cuadro de dialogo 3");
		boton4 = new JButton("Cuadro de dialogo 4");

		boton1.addActionListener(new AccionesBotones());
		boton2.addActionListener(new AccionesBotones());
		boton3.addActionListener(new AccionesBotones());
		boton4.addActionListener(new AccionesBotones());

		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);

	}

	private class AccionesBotones implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == boton1) {

				JOptionPane.showMessageDialog(boton1, "Mesaje de prueba", "Advertencia", 0);

			} else if (e.getSource() == boton2) {

				String nombre = JOptionPane.showInputDialog(boton1, "mensaje prueba 2", "Advertencia 2", 2);
				System.out.println(nombre);
				
			} else if (e.getSource() == boton3) {
				
				int respuesta = JOptionPane.showConfirmDialog(boton3, "Elegi opción", "V confirmar", 1);
				System.out.println(respuesta);
			} else {
				
				JOptionPane.showOptionDialog(boton1, "Elige: ", "V de opciones", 1, 1, null, null, null);
				
			}

		}

	}
}
