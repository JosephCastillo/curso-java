package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos2 {

    public static void main(String[] args) {

        MarcoBotones2 miMarco2 = new MarcoBotones2();
        miMarco2.setVisible(true);
        miMarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoBotones2 extends JFrame {

    public MarcoBotones2() {
        setTitle("Segunda forma de eventos");
        setBounds(700, 300, 800, 600);
        LaminaBotones2 miLaminaBotones2 = new LaminaBotones2();
        add(miLaminaBotones2);

    }

}

class LaminaBotones2 extends JPanel {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones2() {

        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
        
        
        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo rojo = new ColorFondo(Color.RED);
        
        botonAzul.addActionListener(azul);
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);
        

    }

    private class ColorFondo implements ActionListener {

        public ColorFondo(Color c) {

            colorDeFondo = c;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }

        private final Color colorDeFondo ;

    }

}
