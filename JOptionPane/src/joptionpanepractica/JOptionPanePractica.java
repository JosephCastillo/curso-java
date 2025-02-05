
package joptionpanepractica;

import javax.swing.*;

/**
 *
 * @author Joseph
 */
public class JOptionPanePractica {

    public static void main(String[] args) {
        
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");
        
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        
        int edadUsuario = Integer.parseInt(edad);
        
        edadUsuario++;
        
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Edad: " + edadUsuario);
        
    }
    
}
