package componentes;

import java.awt.*;
import javax.swing.*;

public class ComponentesXI {

    public static void main(String[] args) {

        MarcoXI miMarcoXI = new MarcoXI();
        miMarcoXI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoXI.setVisible(true);

    }

}

class MarcoXI extends JFrame {

    public MarcoXI() {

        setTitle("Spinner");
        setBounds(80, 80, 800, 600);

        LaminaXI miLaminaX = new LaminaXI();

        add(miLaminaX);
    }

}

class LaminaXI extends JPanel {

    public LaminaXI() {

        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
        
            @Override
            public Object getNextValue() {
                return super.getPreviousValue();
            }

            @Override
            public Object getPreviousValue() {
                return super.getNextValue();
            }
            
            
        });

        Dimension d = new Dimension(200, 20);
        
        control.setPreferredSize(d);

        add(control);
    }
    
//    private class MiModeloJspinner extends SpinnerNumberModel{
//        
//        public MiModeloJspinner(){
//            
//            super(5, 0, 10, 1);
//            
//        }
//        
//        @Override
//        public Object getNextValue(){
//            return super.getPreviousValue();
//        }
//        
//        @Override
//        public Object getPreviousValue(){
//            return super.getNextValue();
//        }
//        
//    }

}
