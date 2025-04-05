package componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComponentesX {

    public static void main(String[] args) {

        MarcoX miMarcoX = new MarcoX();

        miMarcoX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoX.setVisible(true);

    }

}

class MarcoX extends JFrame {

    public MarcoX() {

        setTitle("Slider");
        setBounds(50, 50, 1200, 200);

        LaminaSlider miLaminaSlider = new LaminaSlider();

        add(miLaminaSlider);

    }

}

class LaminaSlider extends JPanel {

    public LaminaSlider() {
        
        setLayout(new BorderLayout() );
        
        rotulo = new JLabel("En un lugar de la mancha cuyo nombre...");
        add(rotulo, BorderLayout.CENTER);
        
        
        
        control = new JSlider(8, 50, 12);

        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setSnapToTicks(true);

        control.setFont(new Font("Serif", Font.ITALIC, 12));
        
        
        JPanel laminaSlider = new JPanel();
        
        laminaSlider.add(control);
        
        control.addChangeListener(new EventoSlider());
        
        
        
        add(laminaSlider, BorderLayout.NORTH);
        
        

    }
    
    
    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        }
        
        
    }
    
    
    private JLabel rotulo;
    private JSlider control;

}
