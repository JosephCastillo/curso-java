package layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutsIII {

    public static void main(String[] args) {

        MarcoLayoutIIII miMarcoLayoutIIII = new MarcoLayoutIIII();

        miMarcoLayoutIIII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoLayoutIIII.setVisible(true);

    }

}

class MarcoLayoutIIII extends JFrame {

    public MarcoLayoutIIII() {

        setTitle("Layout Grid");
        setBounds(140, 140, 300, 400);

        LaminaArriba miLaminaArriba = new LaminaArriba();

        add(miLaminaArriba);
        //pack();

    }

}

class LaminaArriba extends JPanel {

    public LaminaArriba() {

        setLayout(new BorderLayout());

        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        miLaminaCentral = new JPanel();

        miLaminaCentral.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();

        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", orden);

        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", orden);

        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", orden);

        ponerBoton("0", insertar);
        ponerBoton(".", insertar);
        ponerBoton("=", orden);
        ponerBoton("+", orden);

        add(miLaminaCentral, BorderLayout.CENTER);

    }

    private void ponerBoton(String rotulo, ActionListener oyente) {

        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        miLaminaCentral.add(boton);

    }

    private class InsertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();

            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }

    }

    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            principio = true;

        }

        public void calcular(double x) {

            if (ultimaOperacion.equals("+")) {
                resultado = resultado + x;
            } else if (ultimaOperacion.equals("-")) {
                resultado = resultado - x;
            } else if (ultimaOperacion.equals("*")) {
                resultado = resultado * x;
            } else if (ultimaOperacion.equals("/")) {
                resultado = resultado / x;
            }else if (ultimaOperacion.equals("=")) {
                resultado = x;
            } else if (ultimaOperacion.equals("default")) {
                resultado = x;
            }
            pantalla.setText("" + resultado);
        }

    }

    private final JPanel miLaminaCentral;
    private final JButton pantalla;
    private boolean principio = true;
    private double resultado;
    private String ultimaOperacion = "default";

}
