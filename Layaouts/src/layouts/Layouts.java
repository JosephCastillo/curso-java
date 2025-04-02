package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

    public static void main(String[] args) {
        
        MarcoLayout miMarcoLayout = new MarcoLayout();

        miMarcoLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarcoLayout.setVisible(true);
        
    }

}

class MarcoLayout extends JFrame {

    public MarcoLayout(){
        
        setTitle("Layaout I");
        setBounds(80, 80, 800,600);
        
        PanelLayout miPanelLayout = new PanelLayout();
        
        
        add(miPanelLayout);
        
    }
    
}

class PanelLayout extends JPanel{
    
    public PanelLayout(){
        
        
        FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 100, 200);
        
        setLayout(disposicion);
        
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
        
        
        
        
        
    }
    
    
    
}
