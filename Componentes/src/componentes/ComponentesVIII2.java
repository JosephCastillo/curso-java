package componentes;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ComponentesVIII2 {

    public static void main(String[] args) {
        
        MarcoVIII2 miMarcoVIII2 = new MarcoVIII2();
        miMarcoVIII2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoVIII2.setVisible(true);
        

    }

}

class MarcoVIII2 extends JFrame {

    public MarcoVIII2() {

        setTitle("Version corta radio button");
        setBounds(50, 50, 900, 500);
        
        LaminaRadio2 miLaminaRadio2 = new LaminaRadio2();
        
        add(miLaminaRadio2);

    }

}

final class LaminaRadio2 extends JPanel{
    
    public LaminaRadio2(){
        
        
        miLaminaBotones = new JPanel();
        miGrupo = new ButtonGroup();
        
        setLayout(new BorderLayout());
        
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        
        add(texto,BorderLayout.CENTER);
        
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy Grande", false, 24);
        
        add(miLaminaBotones, BorderLayout.SOUTH);
        
    }
    
    public void colocarBotones(String nombre, boolean seleccionado, final int tamano){
        
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        
        
        miGrupo.add(boton);
        miLaminaBotones.add(boton);
        
        ActionListener miEvento = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                texto.setFont(new Font("Serif", Font.PLAIN, tamano));
            }
            
            
        };
        boton.addActionListener(miEvento);
    }
    
    private final JLabel texto;
    private final ButtonGroup miGrupo;
    private final JPanel miLaminaBotones;
}
