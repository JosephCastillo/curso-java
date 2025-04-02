
package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class EventosDelMouseII {


    public static void main(String[] args) {

        MarcoEventosMouseII marcoMouse = new MarcoEventosMouseII();
        marcoMouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    
}


class MarcoEventosMouseII extends JFrame{
    
    public MarcoEventosMouseII(){
        
        setTitle("Mi marco eventos mouse II");
        setBounds(200,300,800,600);
        setVisible(true);
        
        
        EventosMouseII mouseEvento = new EventosMouseII();
        
        addMouseListener(mouseEvento);
        addMouseMotionListener(mouseEvento);
        
    }
    
}


class EventosMouseII extends MouseAdapter implements MouseMotionListener{
    
    @Override
    public void mouseClicked(MouseEvent e){
        
        System.out.println("Cordenada x: " + e.getX() + " " + " Cordenada y: " + e.getY());
        
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        System.out.println(e.getModifiersEx());
    }
    
    @Override
    public void mouseDragged(MouseEvent e){
        System.out.println("Estas arrastando el raton");
    }
    
    @Override
    public void mouseMoved(MouseEvent e){
        System.out.println("Estas moviendo el raton");
    }
    
    
}