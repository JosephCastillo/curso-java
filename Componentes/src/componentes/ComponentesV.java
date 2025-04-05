package componentes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComponentesV {

    public static void main(String[] args) {

        MarcoV miMarcoV = new MarcoV();
        miMarcoV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoV.setVisible(true);

    }

}

class MarcoV extends JFrame {

    public MarcoV() {

        setTitle("Area de texto 2");
        setBounds(50, 50, 400, 300);

        setLayout(new BorderLayout());

        laminaBotones = new JPanel();
        btnInsertar = new JButton("Insertar");
        btnSaltoLinea = new JButton("Salto Linea");
        txtAreaTexto = new JTextArea(8, 20);
        txtAreaScroll = new JScrollPane(txtAreaTexto);

        btnInsertar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                txtAreaTexto.append("SML");

            }

        });

        btnSaltoLinea.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                boolean saltar = !txtAreaTexto.getLineWrap();

                txtAreaTexto.setLineWrap(saltar);

                if (saltar) {
                    btnSaltoLinea.setText("Quitar salto");
                } else {
                    btnSaltoLinea.setText("Salto Linea");
                }
            }

        });

        laminaBotones.add(btnInsertar);
        laminaBotones.add(btnSaltoLinea);

        add(laminaBotones, BorderLayout.SOUTH);
        add(txtAreaScroll, BorderLayout.CENTER);

    }

    private final JPanel laminaBotones;
    private final JButton btnInsertar, btnSaltoLinea;
    private JTextArea txtAreaTexto;
    private JScrollPane txtAreaScroll;

}
