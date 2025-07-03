package checkboxradiobutton;

import javax.swing.JFrame;

public class AppCheckBoxRadioButton {
	public static void main(String[] args){
		VentanaCheckBoxRadioButton ventanaCheckBoxRadioButton = new VentanaCheckBoxRadioButton();
		ventanaCheckBoxRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaCheckBoxRadioButton extends JFrame{
	public VentanaCheckBoxRadioButton() {
		setBounds(500,300,550,400);
		
	}
}
