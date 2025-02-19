package Encapsulacion;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

//    setter color
    public void estableceColor(String colorCarro) {
        color = colorCarro;
    }
    
//    setter asientosCuero
    public void configuraAsientos(String asientosCuero){
        if(asientosCuero == "si"){
            this.asientosCuero = true;
        }
        else{
            this.asientosCuero = false;
        }
    }
    
    public void configuraClimatizador(String climatizador){
        if(climatizador.equals("si")){
            this.climatizador = true;
        }
        else{
            this.climatizador = false;
        }
    }
    
    public String dimeClimatizador(){
        if (climatizador == true) {
            return "El carro tiene climatizador";            
        }
        else{
            return "El carro no tiene climatizador";
        }
    }
    //practica de setter y getter a la vez  -  no recomendado
    public String dimePesoCoche(){
        int pesoCarroceria = 500;
        pesoTotal = pesoPlataforma + pesoCarroceria;
        
        if(asientosCuero == true){;
            pesoTotal = pesoTotal + 50;
        }
        if(climatizador == true){
            pesoTotal = pesoTotal + 20;
        }
        
        return "El peso del coche es:  " + pesoTotal;
    }
    
    
    public int precioCoche(){
        int precioFinal = 100000;
        
        if(asientosCuero == true){
            precioFinal+= 2000;
        }
        if (climatizador == true) {
            precioFinal+= 1500;
        }
        
        return precioFinal;
    }
//    getter

    public String dimeColor() {
        return "El color del carro es: " + color;
    }
//    getter
    public void establecePeso() {
        pesoTotal = 200;
    }
//    getter

    public String dimeDatosGenerales() {
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + " Mide " + largo / 1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + "kg";
    }

    public String dimeAsientos(){
        if(asientosCuero == true){
            return "El carro tiene asientos de cuero";
        }
        else{
            return "El carro no tiene asientos de cuero";
        }
    }
}
