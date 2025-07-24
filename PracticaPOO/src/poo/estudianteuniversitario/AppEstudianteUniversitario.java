package poo.estudianteuniversitario;

public class AppEstudianteUniversitario {
    public static void main(String[] args){

        EstudianteUniversitario estudiante1 = new EstudianteUniversitario(8.5, "Universidad Nacional", "Juan Perez", 20);
        EstudianteUniversitario estudiante2 = new EstudianteUniversitario(9.0, "Universidad Central", "Maria Lopez", 22);

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());


    }
}
