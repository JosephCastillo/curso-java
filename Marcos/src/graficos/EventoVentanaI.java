package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventoVentanaI {

    public static void main(String[] args) {

        MarcoVentana miVentana = new MarcoVentana();
        MarcoVentana miVentana2 = new MarcoVentana();

        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        miVentana.setTitle("Ventana 1");
        miVentana2.setTitle("Ventana 2");
        
        miVentana.setBounds(0, 0, 500, 500);
        miVentana2.setBounds(550, 0, 500, 500);
    }

}

class MarcoVentana extends JFrame {

    public MarcoVentana() {
        //setTitle("Evento ventana");
        //setBounds(400, 200, 800, 600);
        setVisible(true);

        MVentana oyenteVentana = new MVentana();

        addWindowListener(oyenteVentana);
    }

}

class MVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventaba abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana se esta cerrando");
        //System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana Cerrada");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana maximizada");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana ha sido activada");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana ha sido desactivada");
      
    }

}
