package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

    public static void main(String[] args) {

        MarcoOyentes miMarcoOyentes = new MarcoOyentes();

        miMarcoOyentes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarcoOyentes.setVisible(true);

    }

}

class MarcoOyentes extends JFrame {

    public MarcoOyentes() {
        setTitle("Varios oyentes");
        setBounds(50, 50, 400, 300);
        setLocationRelativeTo(null);

        LaminaOyentes miLaminaOyentes = new LaminaOyentes();
        add(miLaminaOyentes);

    }

}

class LaminaOyentes extends JPanel {

    public LaminaOyentes() {

        JButton nuevo = new JButton("Nuevo");
        cerrarTodo = new JButton("Cerrar Todo");

        add(nuevo);
        add(cerrarTodo);
        
        
        oyenteNuevo miOyente = new oyenteNuevo();
        nuevo.addActionListener(miOyente);

    }
    
    private class oyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(cerrarTodo);
            marco.setVisible(true);
        }
        
    }

    JButton cerrarTodo;

}

class MarcoEmergente extends JFrame {

    public MarcoEmergente(JButton botonDePrincipal) {

        contador++;
        setTitle("Ventana" + contador);

        setBounds(40 * contador, 40 * contador, 300, 150);
        
        CierraTodos oyenteCerrar = new CierraTodos();
        
        botonDePrincipal.addActionListener(oyenteCerrar);

    }
    
    private class CierraTodos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            dispose();
            contador = 0;
            
        }
        
        
        
    }

    private static int contador = 0;

}

