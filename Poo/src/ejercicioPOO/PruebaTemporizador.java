
package ejercicioPOO;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;


public class PruebaTemporizador {

    public static void main(String[] args) {
        
        int delay = 5000; // Milisegundos
        
        DimeLaHora  oyente = new DimeLaHora();
        
        Timer miTemporizador = new Timer(delay, oyente);
        
        
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener ");
        
        System.exit(0);
    }
    
}

class DimeLaHora implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
            Date ahora = new Date();
            System.out.println("La hora actual cada 5 segundos: " + ahora);

    }
}