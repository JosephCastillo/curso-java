package componentes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ComponentesVIII {

    public static void main(String[] arg) {

        MarcoVIII miMarcoVIII = new MarcoVIII();
        
        miMarcoVIII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoVIII.setVisible(true);
        
    }

}


class MarcoVIII extends JFrame{
    
    public MarcoVIII(){
        
        setTitle("Radio button");
        setBounds(50, 50, 400, 300);
        
        
        LaminaVIII miLaminaVIII = new LaminaVIII();
        
        add(miLaminaVIII);
        
    }
    
}


class LaminaVIII extends JPanel{
    
    public LaminaVIII(){
        
        setLayout(new BorderLayout());
        
        text = new JLabel("En un lugar de la mancha de cuyo nombre...");
        
        add(text, BorderLayout.CENTER);
        
        ButtonGroup miGrupo = new ButtonGroup();
        
        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy Grande", false);
        
        
        JPanel laminaRadio = new JPanel();
        
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);
        miGrupo.add(boton4);
        
        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);
        
        
        add(laminaRadio, BorderLayout.SOUTH);
        
        
        eventoRadio miEvento = new eventoRadio();
        boton1.addActionListener(miEvento);
        boton2.addActionListener(miEvento);
        boton3.addActionListener(miEvento);
        boton4.addActionListener(miEvento);
    }
    
    private class eventoRadio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                text.setFont(new Font("Serif", Font.PLAIN, 10));
            }
            else if(e.getSource() == boton2){
                text.setFont(new Font("Serif", Font.PLAIN,12 ));
                
            }
            else if(e.getSource() == boton3){
                text.setFont(new Font("Serif", Font.PLAIN,18 ));
                
            }
            else if(e.getSource() == boton4){
                text.setFont(new Font("Serif", Font.PLAIN, 24));
                
            }
        }
        
        
        
    }
    
    private JRadioButton boton1, boton2, boton3, boton4;
    private JLabel text;
    
}
