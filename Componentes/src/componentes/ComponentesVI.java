package componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentesVI {

    public static void main(String[] args) {

        MarcoVI miMarcoVI = new MarcoVI();
        miMarcoVI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoVI.setVisible(true);

    }

}

class MarcoVI extends JFrame {

    public MarcoVI() {

        setTitle("ChecBox");
        setBounds(50, 50, 800, 500);

        LaminaVI miLaminaVI = new LaminaVI();
        add(miLaminaVI);

    }

}

class LaminaVI extends JPanel {

    public LaminaVI() {

        setLayout(new BorderLayout());

        Font miLetra = new Font("Serif", Font.PLAIN, 24);

        lblTexto1 = new JLabel("En un lugar de la Mancha de cuyo nombre...");

        lblTexto1.setFont(miLetra);

        JPanel laminaTexto = new JPanel();

        laminaTexto.add(lblTexto1);

        add(laminaTexto, BorderLayout.CENTER);

        checkBox1 = new JCheckBox("Negrita");
        checkBox2 = new JCheckBox("Cursiva");

        checkBox1.addActionListener(new ManejaChecks());
        checkBox2.addActionListener(new ManejaChecks());

        JPanel laminaChecks = new JPanel();
        laminaChecks.add(checkBox1);
        laminaChecks.add(checkBox2);

        add(laminaChecks, BorderLayout.SOUTH);

    }

    private class ManejaChecks implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int tipo = 0;

            if (checkBox1.isSelected()) {
                tipo += Font.BOLD;
            }
            if (checkBox2.isSelected()) {
                tipo += Font.ITALIC;
            }

            lblTexto1.setFont(new Font("Serif", tipo, 24));
        }

    }

    private final JLabel lblTexto1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
}
