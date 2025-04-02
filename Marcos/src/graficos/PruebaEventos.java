package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {

    public static void main(String[] args) {

        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoBotones extends JFrame {

    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);

    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAmarillo = new JButton("Amarillo");

    public LaminaBotones() {
        add(botonAzul);
        add(botonRojo);
        add(botonAmarillo);
        
        
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object botonPulsado = e.getSource();
        
        if (botonPulsado == botonAzul) {
            setBackground(Color.blue);
        }
        if (botonPulsado == botonAmarillo) {
            setBackground(Color.yellow);
        }
        if (botonPulsado == botonRojo) {
            setBackground(Color.red);
        }
    }

}
