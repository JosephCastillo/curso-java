package poo.sistemaacademico;

public abstract class Persona {

    String nombre;
    int edad;

    public abstract String describirRol();

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Rol: " + describirRol();
    }

}
