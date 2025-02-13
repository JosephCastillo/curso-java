package matrices;

import java.util.Scanner;

public class Ejercicios {

    Scanner scanner = new Scanner(System.in);

    public void numerosDelUnoAlDiez() {
//        Ejercicio 1: Números del 1 al 10
//        Descripción:
//        Crea un array que contenga los números del 1 al 10 e imprímelos uno por uno.

        int[] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
        System.out.println(numeros[6]);
        System.out.println(numeros[7]);
        System.out.println(numeros[8]);
        System.out.println(numeros[9]);

    }

    public void promedioCalificaciones() {
//        Ejercicio 2: Promedio de calificaciones
//        Descripción:
//
//        Declara un array de 5 números que representan calificaciones.
//        Calcula e imprime el promedio de las calificaciones.

        double promedio;

        double[] calificaciones = new double[5];

        calificaciones[0] = 4.4;
        calificaciones[1] = 2.2;
        calificaciones[2] = 1.3;
        calificaciones[3] = 3.4;
        calificaciones[4] = 3.3;

        promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / calificaciones.length;

        System.out.println("Promedio: " + promedio);

    }

    public void buscarUnNumero() {
//        Ejercicio 3: Buscar un número
//        Descripción:
//
//        Crea un array de 10 números.
//        Solicita al usuario que ingrese un número y verifica si está en el array.

        int numeroUsuario;

        int[] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 2;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        System.out.print("Ingresa un numero para verificar si esta en el Array: ");

        numeroUsuario = scanner.nextInt();

        boolean encontrar = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeroUsuario) {
                encontrar = true;
                break;
            }
        }
        if (encontrar) {
            System.out.println("El numero se encuentra dentro del Array.");
        } else {
            System.out.println("El numero no se encuentra dentro del Array");
        }
    }

    public void invertirArray() {
//        Ejercicio 4: Invertir el array
//        Descripción:
//
//        Crea un array con 5 números.
//        Imprime los elementos en orden inverso.

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }

    public void calculadoraDeNotas() {
//        Ejercicio Final: Calculadora de notas
//        Descripción:
//        Crea un programa en Java que:
//
//        Solicite al usuario que ingrese 5 calificaciones (de tipo double).
//        Almacene las calificaciones en un array.
//        Calcule el promedio usando un bucle for.
//        Utilice una condición if-else para verificar:
//        Si el promedio es mayor o igual a 6: muestra "Aprobado".
//        Si el promedio es menor a 6: muestra "Reprobado".

        double calificacion;
        double promedio = 0, sumar = 0;

        System.out.println("Ingresa cinco calificaciones: ");

        double[] calificaciones = new double[5];

        for (int i = 0; i < calificaciones.length; i++) {
            calificacion = scanner.nextDouble();
            calificaciones[i] = calificacion;
        }

        for (int j = 0; j < calificaciones.length; j++) {
            sumar = sumar + calificaciones[j];

        }
        promedio = sumar / calificaciones.length;
        System.out.println("Promedio: " + promedio);

        if (promedio >= 6) {
            System.out.println("Aprobado");
        } else if (promedio < 6) {
            System.out.println("Reprobado");
        }

    }

    //        EJEMPLO FOR EACH
    public void ejemploForEach() {
        int [] numeros = new int [5];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i*6;
        }
        
        for (int elemento:numeros) {
            System.out.println(elemento);    
        }
        
    }
}
