package Encapsulacion;

public class Furgoneta extends Coche {

    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadCarga) {
        super(); // Llamar al constructor de la clase padre.
        this.plazasExtra = plazasExtra;
        this.capacidadCarga = capacidadCarga;
    }

    public String dimeDatosFurgoneta(){
        return "La capacidad de carga " + capacidadCarga + " Y las plazas son: " + plazasExtra;
    }
}
