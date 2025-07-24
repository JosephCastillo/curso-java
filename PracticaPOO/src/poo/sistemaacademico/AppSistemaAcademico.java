package poo.sistemaacademico;

public class AppSistemaAcademico {
    public static void main(String[] args) {

        Persona[] persona = new Persona[2];


        persona[0] = new EstudianteUniversitario("Juan", 20);
        persona[1] = new Profesor("Carlos", 45);

        for (Persona p : persona) {
            System.out.println(p.describirRol());
        }

    }
}
