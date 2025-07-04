package disposicionmuelle;

import javax.swing.*;

public class AppDisposicionMuelle {

	public static void main(String[] Args) {
		MarcoMuelle miMarcoMuelle = new MarcoMuelle();
		miMarcoMuelle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarcoMuelle.setVisible(true);
	}
}

class MarcoMuelle extends JFrame{
	public MarcoMuelle(){
		setTitle("Disposición Muelle");
		setBounds(300,400,1000,350);
		LaminaMuelle miLaminaMuelle = new LaminaMuelle();
		add(miLaminaMuelle);
	}
}

class LaminaMuelle extends JPanel{
	public LaminaMuelle() {
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 1");
		JButton boton3 = new JButton("Boton 1");
		
		SpringLayout miLayout = new SpringLayout();
		
		setLayout(miLayout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring miMuelle = Spring.constant(0,10,100);
		miLayout.putConstraint(SpringLayout.WEST, boton1, miMuelle, SpringLayout.WEST, this);
		miLayout.putConstraint(SpringLayout.WEST, boton2, miMuelle, SpringLayout.EAST, boton1);
		miLayout.putConstraint(SpringLayout.WEST, boton3, miMuelle, SpringLayout.EAST, boton2);
		miLayout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, boton3);
		
	}
}
