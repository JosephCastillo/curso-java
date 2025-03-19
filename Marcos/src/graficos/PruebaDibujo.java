package graficos;
import java.awt.*;
import javax.swing.*;
        
        

public class PruebaDibujo {

    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoConDibujos extends JFrame{
    
    public MarcoConDibujos(){
        
        setTitle("Prueba dibujo");
        setSize(400,400);
        LaminaConFiguras miLamina = new LaminaConFiguras();
        miLamina.setBackground(Color.DARK_GRAY);
        add(miLamina);
    }
    
    
}

class LaminaConFiguras extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
        g.drawLine(400, 400, 100,100);
        
    }
    
}
