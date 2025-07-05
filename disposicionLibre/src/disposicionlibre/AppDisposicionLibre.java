package disposicionlibre;

import javax.swing.*;

public class AppDisposicionLibre {

	public static void main(String[] Args) {

		MarcoLibre miMarcoLibre = new MarcoLibre();
		miMarcoLibre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarcoLibre.setVisible(true);

	}

}

class MarcoLibre extends JFrame {
	public MarcoLibre() {
		setTitle("Disposición Libre");
		setBounds(450, 350, 600, 400);
		LaminaLibre miLaminaLibre = new LaminaLibre();
		add(miLaminaLibre);
	}
}

class LaminaLibre extends JPanel {

	public LaminaLibre() {
		setLayout(null);
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		
		boton1.setBounds(50,50,150,50);
		boton2.setBounds(200,50,150,50);
		add(boton1);
		add(boton2);
	}
}