package componentes;

import javax.swing.*;

public class ComponentesVII {

    public static void main(String[] Arg) {

        MarcoVII miMarcoVII = new MarcoVII();
        
        miMarcoVII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoVII.setVisible(true);
        
    }

}

class MarcoVII extends JFrame{
    public MarcoVII(){
        setTitle("Radio button");
        setBounds(50, 50, 500, 400);
        
        LaminaVII miLaminaVII = new LaminaVII();
        
        add(miLaminaVII);
        
    }
}

class LaminaVII extends JPanel{
    
    public LaminaVII(){
        
        ButtonGroup miGrupo1 = new ButtonGroup();
        ButtonGroup miGrupo2 = new ButtonGroup();
        
        JRadioButton boton1 = new JRadioButton("Azul", false);
        JRadioButton boton2 = new JRadioButton("Rojo", true);
        JRadioButton boton3 = new JRadioButton("Verde", false);
        
        JRadioButton boton4 = new JRadioButton("Masculino", false);
        JRadioButton boton5 = new JRadioButton("Femenino", false);
        
        
        
        miGrupo1.add(boton1);
        miGrupo1.add(boton2);
        miGrupo1.add(boton3);
        
        miGrupo2.add(boton4);
        miGrupo2.add(boton5);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
        add(boton4);
        add(boton5);
        
    }
    
}

