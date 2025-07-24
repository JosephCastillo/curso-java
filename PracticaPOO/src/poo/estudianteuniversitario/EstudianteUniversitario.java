package poo.estudianteuniversitario;

public class EstudianteUniversitario extends Persona{

    double promedio;
    String universidad;

    public EstudianteUniversitario(double promedio, String universidad, String nombre, int edad){

        super(nombre, edad);
        this.promedio = promedio;
        this.universidad = universidad;

    }

    public double getPromedio(){
        return promedio;
    }

    public String getUniversidad(){
        return universidad;
    }

    @Override
    public String toString(){
        return super.toString() + ", Promedio: " + promedio + ", Universidad: " + universidad;
    }

}
