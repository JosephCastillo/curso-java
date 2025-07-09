package disposicionconlayoutmanager;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

/**
 * Clase principal de la aplicación. Contiene el método main que lanza la interfaz.
 */
public class AppLayoutContainer {

    /**
     * Método principal que inicia la aplicación.
     * @param Args argumentos de la línea de comandos (no utilizados en esta aplicación)
     */
    public static void main(String[] Args) {
        MarcoLayoutContainer miMarcoLayoutContainer = new MarcoLayoutContainer();
        miMarcoLayoutContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoLayoutContainer.setVisible(true);
    }
}

/**
 * Ventana principal de la aplicación. Configura los componentes y el layout personalizado.
 */
class MarcoLayoutContainer extends JFrame {

    /**
     * Constructor que inicializa el marco, asigna el layout y agrega los componentes.
     */
    public MarcoLayoutContainer() {
        setLayout(new EnColumnas());
        setTitle("Disposicion Layout Container");
        setBounds(150, 150, 800, 600);

        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblApellido = new JLabel("Apellido: ");
        JTextField txtNombre = new JTextField(10);
        JTextField txtApellido = new JTextField(10);

        add(lblNombre);
        add(txtNombre);
        add(lblApellido);
        add(txtApellido);
    }
}

/**
 * Clase que implementa un layout personalizado para organizar componentes en columnas.
 */
class EnColumnas implements LayoutManager {

    /**
     * No implementado: No se requiere añadir componentes de forma específica.
     * @param name nombre del componente
     * @param comp componente agregado
     */
    @Override
    public void addLayoutComponent(String name, Component comp) {
        // No se requiere implementación
    }

    /**
     * No implementado: No se requiere lógica específica al remover componentes.
     * @param comp componente removido
     */
    @Override
    public void removeLayoutComponent(Component comp) {
        // No se requiere implementación
    }

    /**
     * Devuelve el tamaño preferido del contenedor.
     * @param parent el contenedor al que pertenece el layout
     * @return tamaño preferido (null en este caso porque no se usa)
     */
    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    /**
     * Devuelve el tamaño mínimo del contenedor.
     * @param parent el contenedor al que pertenece el layout
     * @return tamaño mínimo (null en este caso porque no se usa)
     */
    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    /**
     * Organiza los componentes dentro del contenedor en dos columnas.
     * @param miContenedor el contenedor cuyos componentes serán organizados
     */
    @Override
    public void layoutContainer(Container miContenedor) {
        int contador = 0;
        int n = miContenedor.getComponentCount();

        for (int i = 0; i < n; i++) {
            contador++;
            Component c = miContenedor.getComponent(i);
            c.setBounds(x, y, 100, 20);
            x += 100;
            if (contador % 2 == 0) {
                x = 20;
                y += 40;
            }
        }
    }

    // Posiciones iniciales para colocar los componentes
    private int x = 20;
    private int y = 20;
}
