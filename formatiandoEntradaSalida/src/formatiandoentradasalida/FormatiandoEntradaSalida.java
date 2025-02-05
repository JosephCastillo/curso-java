
package formatiandoentradasalida;

import javax.swing.*;

/**
 *
 * @author Joseph
 */
public class FormatiandoEntradaSalida {

    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Introduce un numero");
        
        double num2 = Double.parseDouble(num1);
        
        System.out.print("La raiz de " + num2 + "es ");
        System.out.printf("%1.3f", Math.sqrt(num2));
    }
    
}
