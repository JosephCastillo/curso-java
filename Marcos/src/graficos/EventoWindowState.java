package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class EventoWindowState {

    public static void main(String[] args) {

        MarcoEstado marcoE = new MarcoEstado();
        
        marcoE.setTitle("Estado de la ventana");
        marcoE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}

class MarcoEstado extends JFrame{
    
    public MarcoEstado(){
        setBounds(400, 300, 400, 600);
        setVisible(true);
        CambiaEstado nuevoEstado = new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
}


class CambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        
        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
            System.out.println("Patalla completa");
        }
        
        if (e.getNewState() == Frame.ICONIFIED){
            System.out.println("Ventana minimizada");
            
        }
        if (e.getNewState() == Frame.NORMAL) {
            System.out.println("La ventana volvió a su estado normal");
        }
//        System.out.println(e.getOldState());
//        System.out.println(e.getNewState());
    }
    
    
    
}