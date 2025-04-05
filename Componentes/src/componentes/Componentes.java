package componentes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Componentes {

    public static void main(String[] args) {

        MarcoComponente miMarco = new MarcoComponente();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

    }

}

class MarcoComponente extends JFrame {

    public MarcoComponente() {
        setTitle("Mis componentes");
        setBounds(50, 50, 600, 400);

        Lamina miLamina = new Lamina();

        add(miLamina);
    }

}

class Lamina extends JPanel {

    public Lamina() {

        setLayout(new BorderLayout());

        JPanel miLamina2 = new JPanel();

        miLamina2.setLayout(new FlowLayout());

        resultado = new JLabel("", JLabel.CENTER);
        miLamina2.add(new JLabel("Email: "));
        miLamina2.add(texto = new JTextField(20));
        add(resultado, BorderLayout.CENTER);
        miLamina2.add(boton = new JButton("Comprobar"));

        DameTexto miEvento = new DameTexto();

        boton.addActionListener(miEvento);

        add(miLamina2, BorderLayout.NORTH);

    }

    private class DameTexto implements ActionListener {

        public DameTexto() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;

            String email = texto.getText().trim();

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }

            }

            if (correcto != 1) {
                resultado.setText("Email incorrecto!");
                System.out.println("¡Email incorrecto!");
            } else {
                resultado.setText("Email Correcto!");
                System.out.println("¡Email correcto!");
            }

        }
    }
    JLabel resultado;
    JTextField texto;
    JButton boton;

}
