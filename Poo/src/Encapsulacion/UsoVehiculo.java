
package Encapsulacion;
// import javax.swing.*;

public class UsoVehiculo {

    public static void main(String[] args) {

        // Coche Renault = new Coche ();

        // Renault.estableceColor(JOptionPane.showInputDialog("Indica el color"));

        // System.out.println(Renault.dimeDatosGenerales());
        // System.out.println(Renault.dimeColor());
        // Renault.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de
        // cuero?"));
        // System.out.println(Renault.dimeAsientos());
        // Renault.configuraClimatizador(JOptionPane.showInputDialog("Tiene
        // climatizador?"));
        // System.out.println(Renault.dimeClimatizador());
        // System.out.println(Renault.dimePesoCoche());
        // System.out.println("El precion del carro es: " + Renault.precioCoche());

        Coche miCoche1 = new Coche();

        miCoche1.estableceColor("Rojo");

        Furgoneta miFurgoneta1 = new Furgoneta(7 , 580);

        miFurgoneta1.estableceColor("Azul");
        miFurgoneta1.configuraAsientos("si");
        miFurgoneta1.configuraClimatizador("si");

        System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());
        System.out.println(miFurgoneta1.dimeDatosGenerales() + miFurgoneta1.dimeDatosFurgoneta());



    }

}
