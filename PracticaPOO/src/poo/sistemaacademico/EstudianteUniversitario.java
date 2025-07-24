package poo.sistemaacademico;

public class EstudianteUniversitario extends Persona{

    public EstudianteUniversitario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String describirRol() {
        return "Soy un estudiante de la universidad ECCI con promedio 4.0";
    }


}
