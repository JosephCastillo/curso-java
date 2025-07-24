package poo.estudiante;

public class AppEstudiante {
    public static void main(String [] args){

       Estudiante[] estudiantes = new Estudiante[3];

       estudiantes[0] = new Estudiante("Juan", 20, 8.5);
       estudiantes[1] = new Estudiante("Ana", 22, 9.0);
       estudiantes[2] = new Estudiante("Luis", 21, 7.5);


       for(Estudiante estudiante : estudiantes ){
           System.out.println(estudiante.toString());
       }

    }
}
