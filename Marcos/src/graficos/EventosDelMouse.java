package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class EventosDelMouse {


    public static void main(String[] args) {

        MarcoEventoMouse miMarcoEventoMouse = new MarcoEventoMouse();
        
        miMarcoEventoMouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    
}


class MarcoEventoMouse extends JFrame{

    public MarcoEventoMouse(){
        setTitle("Eventos del raton");
        setBounds(400,300,800,600);
        setVisible(true);
        
        
        EventosRaton eventoRaton = new EventosRaton();
        addMouseListener(eventoRaton);
    }
    
}


class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("Haz hecho clic");
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acaba de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acaba de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
    
} 
