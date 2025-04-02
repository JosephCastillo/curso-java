package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

    public static void main(String[] args) {

        MarcoAcciones MAciones = new MarcoAcciones();

        MAciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoAcciones extends JFrame {

    public MarcoAcciones() {

        setTitle("Marco Acciones");
        setBounds(100, 100, 900, 800);

        PanelAccion lamina = new PanelAccion();

        add(lamina);

        setVisible(true);
    }

}

class PanelAccion extends JPanel {

    public PanelAccion() {

        ActionColor accionAmarillo = new ActionColor("Amarillo", new ImageIcon("src/graficos/dotYellow.png"), Color.YELLOW);
        ActionColor accionAzul = new ActionColor("Azul", new ImageIcon("src/graficos/dotBlue.png"), Color.BLUE);
        ActionColor accionRojo = new ActionColor("Rojo", new ImageIcon("src/graficos/dotRed.png"), Color.RED);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        
        //        JButton botonAmarillo = new JButton(accionAmarillo);
        //        JButton botonAmarillo = new JButton("Amarillo");
        //        JButton botonAzul = new JButton("Azul");
        //        JButton botonRojo = new JButton("Rojo");
        //        
        //        add(botonAmarillo);
        //        add(botonAzul);
        //        add(botonRojo);

        InputMap mapaDeEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        
        mapaDeEntrada.put(teclaAmarillo, "fondoAmarillo");
        mapaDeEntrada.put(teclaRojo, "fondoRojo");
        mapaDeEntrada.put(teclaAzul, "fondoAzul");
       
        ActionMap mapaAccion = getActionMap();
        
        mapaAccion.put("fondoAmarillo", accionAmarillo);      
        mapaAccion.put("fondoRojo", accionRojo);
        mapaAccion.put("fondoAzul", accionAzul);


    }

    private class ActionColor extends AbstractAction {

        public ActionColor(String nombre, Icon icono, Color colorBoton) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
            putValue("ColorDeFondo", colorBoton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("ColorDeFondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + " Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
        }

    }

}
