package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutsII {

    public static void main(String[] args) {

        MarcoLayoutsII miMarcoLayoutII = new MarcoLayoutsII();

        miMarcoLayoutII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoLayoutII.setVisible(true);

    }

}

class MarcoLayoutsII extends JFrame {

    public MarcoLayoutsII() {
        setTitle("Border Layout");
        setBounds(40, 40, 800, 600);

        LaminaLayoutII miLaminaLayoutII = new LaminaLayoutII();
        LaminaLayoutIII miLaminaLayoutIII = new LaminaLayoutIII();

        add(miLaminaLayoutII, BorderLayout.NORTH);
        
        add(miLaminaLayoutIII, BorderLayout.SOUTH);
    }

}

class LaminaLayoutII extends JPanel {

    public LaminaLayoutII() {

        setLayout(new FlowLayout());

        add(new JButton("Amarillo"));
        add(new JButton("Azul"));

    }

}

class LaminaLayoutIII extends JPanel {

    public LaminaLayoutIII() {

        setLayout(new BorderLayout());
        
        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);

    }

}
