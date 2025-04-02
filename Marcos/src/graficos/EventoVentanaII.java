package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class EventoVentanaII {

    public static void main(String[] args) {

        MarcoVentana2 ventana1 = new MarcoVentana2();
        MarcoVentana2 ventana2 = new MarcoVentana2();
        
        ventana1.setTitle("Ventana1");
        ventana1.setBounds(0, 0, 500, 400);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setTitle("Ventana2");
        ventana2.setBounds(550, 0, 500, 400);
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}

class MarcoVentana2 extends JFrame {

    public MarcoVentana2() {
        setVisible(true);

        MVentana2 oyenteV2 = new MVentana2();

        addWindowListener(oyenteV2);
    }

}

class MVentana2 extends WindowAdapter {

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

}
