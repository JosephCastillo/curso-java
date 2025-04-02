package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class EventosTeclado {

    public static void main(String[] args) {

       MarcoConTeclas miMarcoConTeclas = new MarcoConTeclas();
       miMarcoConTeclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    
}

class MarcoConTeclas extends JFrame {
    
    public MarcoConTeclas (){
        setTitle("Mis eventos de teclado");
        setVisible(true);
        setBounds(300, 200, 800, 600);
        
        EventoDeTeclado miTecla = new EventoDeTeclado();
        addKeyListener(miTecla);
        
    }
    
}

class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println("Letra: " + letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        System.out.println(tecla);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
    
    
}


