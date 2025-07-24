package poo.sistemaacademico;

public class Profesor extends Persona{

    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String describirRol(){
        return "Soy un profesor de la materia de I+D+I";
    }

}
