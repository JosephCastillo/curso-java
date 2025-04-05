package componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ComponentesIII {

    public static void main(String[] args) {

        MarcoIII miMarcoIII = new MarcoIII();

        miMarcoIII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoIII.setVisible(true);

    }

}

class MarcoIII extends JFrame {

    public MarcoIII() {

        setTitle("Eventos en cuadros de texto");
        setBounds(50, 50, 600, 500);

        LaminaIII miLaminaIII = new LaminaIII();

        add(miLaminaIII);

    }

}

class LaminaIII extends JPanel {

    public LaminaIII() {

        setLayout(new BorderLayout());

        JPanel laminaSuperior = new JPanel();

        laminaSuperior.setLayout(new GridLayout(2, 2));
        compruebaPass miEvento = new compruebaPass();

        add(laminaSuperior, BorderLayout.NORTH);

        JLabel etiqueta1 = new JLabel("Usuario");
        etiqueta2 = new JLabel("Contraseña");

        JTextField txtUsuario = new JTextField(15);
        txtContrasena = new JPasswordField(15);

        txtContrasena.getDocument().addDocumentListener(miEvento);

        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(txtUsuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(txtContrasena);

        JButton enviar = new JButton("Enviar");

        add(enviar, BorderLayout.SOUTH);

    }

    private class compruebaPass implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {

            char[] contrasena;

            contrasena = txtContrasena.getPassword();

            if (contrasena.length < 8 || contrasena.length > 12) {
                txtContrasena.setBackground(Color.RED);
            } else {
                txtContrasena.setBackground(Color.WHITE);
            }

        }

        @Override
        public void removeUpdate(DocumentEvent e) {

            char[] contrasena;

            contrasena = txtContrasena.getPassword();

            if (contrasena.length < 8 || contrasena.length > 12) {
                txtContrasena.setBackground(Color.RED);
            } else {
                txtContrasena.setBackground(Color.WHITE);
            }

        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

    }

    JLabel etiqueta2;
    JPasswordField txtContrasena;

}
