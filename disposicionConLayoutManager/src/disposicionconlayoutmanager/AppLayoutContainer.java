package disposicionconlayoutmanager;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class AppLayoutContainer {
	public static void main(String[] Args) {

		MarcoLayoutContainer miMarcoLayoutContainer = new MarcoLayoutContainer();
		miMarcoLayoutContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarcoLayoutContainer.setVisible(true);
	}
}

class MarcoLayoutContainer extends JFrame {

	public MarcoLayoutContainer() {

		setLayout(new EnColumnas());

		setTitle("Disposicion Layout Container");
		setBounds(150, 150, 800, 600);

		JLabel lblNombre = new JLabel("Nombre: ");
		JLabel lblApellido = new JLabel("Apellido: ");
		JTextField txtNombre = new JTextField(10);
		JTextField txtApellido = new JTextField(10);

//		lblNombre.setBounds(20, 20, 80, 10);
//		txtNombre.setBounds(100, 17, 100, 20);
//		lblApellido.setBounds(20, 60, 80, 15);
//		txtApellido.setBounds(100, 55, 100, 20);

		add(lblNombre);
		add(txtNombre);
		add(lblApellido);
		add(txtApellido);

	}

}

class EnColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container miContenedor) {

		int contador = 0;
		int n = miContenedor.getComponentCount();

		for (int i = 0; i < n; i++) {
			contador++;
			Component c = miContenedor.getComponent(i);
			c.setBounds(x, y, 100, 20);
			x += 100;
			if (contador % 2 == 0) {
				x = 20;
				y += 40;
			}
		}

	}

	private int x = 20;
	private int y = 20;
}
