package componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComponentesIV {

    public static void main(String[] args) {

        MarcoIV miMarcoIV = new MarcoIV();
        miMarcoIV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoIV.setVisible(true);

    }

}

class MarcoIV extends JFrame {

    public MarcoIV() {

        setTitle("Areas de texto");
        setBounds(50, 50, 400, 300);

        LaminaIV miLaminaIV = new LaminaIV();

        add(miLaminaIV);

    }

}

class LaminaIV extends JPanel {

    public LaminaIV() {

        miArea = new JTextArea(8, 20);
        JScrollPane miAreaScroll = new JScrollPane(miArea);

        miArea.setLineWrap(true);

        JButton miBoton = new JButton("Dale");

        miBoton.addActionListener(new GestionaArea());

        add(miAreaScroll);
        add(miBoton);
    }

    private class GestionaArea implements ActionListener {

        public GestionaArea() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(miArea.getText());
        }
    }

    private JTextArea miArea;

}
