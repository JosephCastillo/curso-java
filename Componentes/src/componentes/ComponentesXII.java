
package componentes;
import javax.swing.*;


public class ComponentesXII {

    
    public static void main(String[] args) {
        
        MarcoXII miMarcoXII = new MarcoXII();
        miMarcoXII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoXII.setVisible(true);
        
    
    }
    
}

class MarcoXII extends JFrame{
    
    public MarcoXII(){
        
        setTitle("JMenuBar, JMenu y JMenuItem");
        setBounds(80, 40, 800,600);
        
        LaminaXII miLaminaXII = new LaminaXII();
        
        add(miLaminaXII);
        
    }
    
}


class LaminaXII extends JPanel{
    
    public LaminaXII(){
        
        JMenuBar miBarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        
        
        archivo.add(guardar);
        archivo.add(guardarComo);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        
        edicion.addSeparator();
        
        edicion.add(opciones);
        
        opciones.add(opcion1);
        opciones.add(opcion2);
        
        herramientas.add(generales);
        
        
        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);
        
        add(miBarra);
        
        
    }
    
    
}


