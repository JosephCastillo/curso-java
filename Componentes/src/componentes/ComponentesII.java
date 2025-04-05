package componentes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class ComponentesII {

    public static void main(String[] args) {

        MarcoII miMarcoII = new MarcoII();
        miMarcoII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarcoII.setVisible(true);

    }

}

class MarcoII extends JFrame {

    public MarcoII() {

        setTitle("Cambios en un JTextField");
        setBounds(80, 80, 500, 400);

        LaminaII miLaminaII = new LaminaII();

        add(miLaminaII);

    }
}

class LaminaII extends JPanel {

    public LaminaII() {

        JTextField miCampo = new JTextField(20);

        Document miDocumento = miCampo.getDocument();

        EscuchaTexto elEvento = new EscuchaTexto();

        miDocumento.addDocumentListener(elEvento);

        add(miCampo);

    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Haz insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Haz borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

    }

}
