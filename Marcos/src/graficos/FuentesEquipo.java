package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class FuentesEquipo {

    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean estaLaFuente = false;

        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombreDeLaFuente : nombresDeFuentes) {

            if (nombreDeLaFuente.equals(fuente)) {
                estaLaFuente = true;
            }

        }

        if (estaLaFuente) {
            System.out.println("Fuente instalada");
        } else {
            System.out.println("Fuente no esta instalada");
        }
    }

}
