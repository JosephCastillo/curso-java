package graficos;

import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

public class EventoDeFocoII extends JFrame implements WindowFocusListener{


    public static void main(String[] args) {

        EventoDeFocoII miv = new EventoDeFocoII();
        
        miv.iniciar();

    }
    
    
    public void iniciar(){
        
        marco1 = new EventoDeFocoII();
        marco2 = new EventoDeFocoII();
        
        marco1.setVisible(true);
        marco2.setVisible(true);
        
        
        marco1.setBounds(300, 100, 600, 350);
        marco2.setBounds(1200, 100, 600, 350);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
        
        
        
    }
    

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if(e.getSource()== marco1){
            marco1.setTitle("Tengo el foco!");
        }else{
            marco2.setTitle("Tengo el foco!");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if(e.getSource()== marco1){
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }
    }
    
    
    EventoDeFocoII marco1;
    EventoDeFocoII marco2;
    
}
