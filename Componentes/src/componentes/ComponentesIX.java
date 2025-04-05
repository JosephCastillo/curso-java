package componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentesIX {
    
    public static void main(String[] args) {
        
        MarcoIX mimMarcoIX = new MarcoIX();
        mimMarcoIX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimMarcoIX.setVisible(true);
        
    }
    
}

class MarcoIX extends JFrame {
    
    public MarcoIX() {
        
        setTitle("Combo box");
        setBounds(50, 50, 900, 400);
        
        LaminaIX miLaminaIX = new LaminaIX();
        add(miLaminaIX);
    }
    
}

class LaminaIX extends JPanel {
    
    public LaminaIX() {
        
        setLayout(new BorderLayout());
        texto = new JLabel("En lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        
        JPanel laminaNorte = new JPanel();
        
        miCombo = new JComboBox();
        miCombo.setEditable(true);
        miCombo.addItem("Serif");
        miCombo.addItem("Sans Serif");
        miCombo.addItem("Monospaced");
        miCombo.addItem("Dialog");
        
        laminaNorte.add(miCombo);
        
        EventoCombo miEvento = new EventoCombo();
        miCombo.addActionListener(miEvento);
        
        add(laminaNorte, BorderLayout.NORTH);
        
    }
    
    private class EventoCombo implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, 18));
        }
        
    }
    
    private JLabel texto;
    private JComboBox miCombo;
    
}
