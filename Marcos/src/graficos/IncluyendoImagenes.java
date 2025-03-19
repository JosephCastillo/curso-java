package graficos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class IncluyendoImagenes {

    public static void main(String[] args) {

        MarconConImagenes miMarco = new MarconConImagenes();

        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarconConImagenes extends JFrame {

    public MarconConImagenes() {
        setTitle("Dibjando imagenes");
        setSize(800, 800);

        LaminaConImagen miLamina = new LaminaConImagen();

        add(miLamina);

    }
}

class LaminaConImagen extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File miImagen = new File("src/graficos/dot.png");

        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }
        
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        
        g.drawImage(imagen, 0, 0, null);

        for (int i = 0; i < 800; i++) {
            for (int j = 0; j < 800; j++) {

                g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                
            }
        }
    }

    private Image imagen;

}
