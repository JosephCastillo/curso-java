package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

    public static void main(String[] args) {
        MarcoConFuentes miMarcoF = new MarcoConFuentes();
        
        miMarcoF.setVisible(true);
        miMarcoF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }
    
}

class MarcoConFuentes extends JFrame{
    
    public MarcoConFuentes(){
        
        setTitle("Prueba de Fuentes");
        setSize(400,400);
        
        LaminaConFuentes miLamina = new LaminaConFuentes();
        add(miLamina);
        
    }
    
}

class LaminaConFuentes extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        Font miFuente = new Font("Courier", Font.BOLD, 26);
        g2.setFont(miFuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Mi texto", 200, 200);
        
    }
}
