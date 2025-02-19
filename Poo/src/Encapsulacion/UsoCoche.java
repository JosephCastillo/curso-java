
package Encapsulacion;
import javax.swing.*;

public class UsoCoche {

    
    public static void main(String[] args) {
        
        Coche Renault = new Coche ();
        
        Renault.estableceColor(JOptionPane.showInputDialog("Indica el color")); 
        
        System.out.println(Renault.dimeDatosGenerales());
        System.out.println(Renault.dimeColor());
        Renault.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        System.out.println(Renault.dimeAsientos());
        Renault.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(Renault.dimeClimatizador());
        System.out.println(Renault.dimePesoCoche());
        System.out.println("El precion del carro es: " + Renault.precioCoche());
        
        
        
        
    }
    
}
