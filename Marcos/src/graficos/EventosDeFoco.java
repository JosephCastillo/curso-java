package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosDeFoco {

    public static void main(String[] args) {

        MarcoFoco miMarcoFoco = new MarcoFoco();

        miMarcoFoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoFoco extends JFrame {

    public MarcoFoco() {

        setTitle("Mi evento foco");
        setBounds(300, 200, 800, 600);
        setVisible(true);

        add(new LaminaFoco());

    }

}

class LaminaFoco extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);

        add(cuadro1);
        add(cuadro2);

        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);

    }

    private class LanzaFocos implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

            String email = cuadro1.getText();
            boolean comprobacion = false;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobacion = true;
                }
            }

            if (comprobacion) {
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }

        }

    }

    JTextField cuadro1;
    JTextField cuadro2;

}
