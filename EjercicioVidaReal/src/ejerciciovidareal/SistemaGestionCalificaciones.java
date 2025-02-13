package ejerciciovidareal;

import java.util.Scanner;

public class SistemaGestionCalificaciones {

    Scanner scanner = new Scanner(System.in);

//        Ejercicio: Sistema de gestión de calificaciones
//        Descripción:
//        Crea un programa que permita gestionar calificaciones de estudiantes.
//
//        Requisitos:
//
//        Solicita al usuario que ingrese los nombres de 5 estudiantes y almacénalos en un array de String.✅
//        Pide que el usuario ingrese 3 calificaciones para cada estudiante y guárdalas en un array de double.✅
//        Calcula el promedio de las calificaciones de cada estudiante utilizando un bucle for.✅
//        Usa una condición if-else para determinar si el estudiante aprueba (promedio ≥ 6) o reprueba (promedio < 6).✅
//        Muestra el nombre del estudiante, sus calificaciones y su estado (Aprobado/Reprobado).✅
//        Redondea el promedio a dos decimales con la clase Math.✅
    public void sistemaGestionCalificaciones() {

        final int CANTIDAD_ESTUDIANTES = 5;
        final double PROMEDIO_APROBACION = 6.0;
        final int CANTIDAD_CALIFICACIONES = 3;

        String nombreEstudiante;
        double calificacionEstudiante;
        double promedio = 0;

        String[] nombreEstudiantes = new String[CANTIDAD_ESTUDIANTES];
        double[][] calificacionesEstudiantes = new double[CANTIDAD_CALIFICACIONES][CANTIDAD_ESTUDIANTES];

        System.out.println("Ingresa el nombre de 5 estudiantes: ");
//        registra nombres estudiantes
        for (int i = 0; i < nombreEstudiantes.length; i++) {
            nombreEstudiante = scanner.nextLine();
            nombreEstudiantes[i] = nombreEstudiante;
        }
//        Registra notas estudiante en el array
        System.out.println("Ingresa 3 calificaciones para cada estudiante: ");
        for (int c = 0; c < nombreEstudiantes.length; c++) {
            System.out.println(nombreEstudiantes[c] + " ");
            for (int j = 0; j < calificacionesEstudiantes.length; j++) {
                calificacionEstudiante = scanner.nextDouble();
                calificacionesEstudiantes[j][c] = calificacionEstudiante;
                System.out.println("  - Calificacion: " + calificacionesEstudiantes[j][c] + " ");
            }
            System.out.println();
        }
         
        
//        calcular promedio notas
        for (int n = 0; n < nombreEstudiantes.length; n++) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Estudiante: " + nombreEstudiantes[n] + " - ");
            for (int p = 0; p < calificacionesEstudiantes.length; p++) {
                promedio =+ calificacionesEstudiantes[p][n];
            }
            
            double promedioRedondeado = Math.round((promedio / CANTIDAD_CALIFICACIONES) * 100.0) / 100.0;
            System.out.print(" Promedio: " + promedioRedondeado);
            
            if ((promedio / CANTIDAD_CALIFICACIONES) >= PROMEDIO_APROBACION) {
                System.out.print(" Aprueba");
                System.out.println();
            }
            else
            {
                System.out.print(" Reprueba");
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");    
            
            promedio = 0;
        }
    }

}
