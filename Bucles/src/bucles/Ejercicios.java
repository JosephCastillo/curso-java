package bucles;

import java.util.Scanner;

public class Ejercicios {

    Scanner scanner = new Scanner(System.in);

    //############## EJERCICIO BUBLE WHILE #####################
    public void contadorNumerosPares() {

        /*
        *Ejercicio: Contador de números pares
        *Descripción:
        *Crea un programa que:

        *Imprima los primeros 10 números pares usando un bucle while.
        *Muestra cada número en una línea nueva.
         */
        int numeros = 1;

        while (numeros <= 10) {
            if (numeros % 2 == 0) {
                System.out.println(numeros);
            }
            numeros++;
        }

    }

    public void calculoSuma() {
        /* Ejercicio: Cálculo de la suma
        *Descripción:
        *Escribe un programa que:

        *Solicite números al usuario.
        *Siga sumando los números hasta que el usuario ingrese un número negativo.
        *Al final, muestra la suma total.
         */

        int numeros = 0, suma = 0;

        System.out.println("Ingresa los numeros que quieres sumar, si deseas terminar ingresa un numero negativo");

        while (numeros >= 0) {
            numeros = scanner.nextInt();
            if (numeros >= 0) {

                suma = suma + numeros;

            }
        }

        System.out.println("Sumar de los numeros ingresados: " + suma);

    }

    //############## EJERCICIO BUCLE  DO WHILE #####################
    public void ingresoContraseña() {
        /*
        *Ejercicio 1: Ingreso de contraseña
        *Descripción:
        *Crea un programa que:

        *Solicite al usuario que ingrese una contraseña.
        *Use un bucle do-while para pedir la contraseña hasta que el usuario acierte.
         */

        String contrasena = "Camila", contrasenaIngresada;

        do {

            System.out.println("Ingrese contraseña: ");
            contrasenaIngresada = scanner.nextLine();

        } while (contrasena.equals(contrasenaIngresada) == false);

        System.out.println("Contraseña correcta");
    }

    public void menuInteractivo() {
        //Ejercicio 2: Menú interactivo
        //Descripción:
        //Escribe un programa que:
        //
        //Muestre un menú con opciones (1. Sumar, 2. Restar, 3. Salir).
        //El programa se repite hasta que el usuario elija la opción 3 (Salir).

        int opcion;

        System.out.println("#################");
        System.out.println("Menu interactivo");
        System.out.println("#################");

        do {

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = scanner.nextInt();

        } while (opcion != 3);

        System.out.println("Termino el menu interactivo");
    }

    public void numeroImpar() {
//        Ejercicio 3: Número impar
//        Descripción:
//        Pide un número al usuario y verifica si es impar. Si no lo es, vuelve a solicitar otro número hasta que el usuario ingrese uno impar.

        int numero;

        do {
            System.out.print("Ingresa un numero para verificar si es impar: ");
            numero = scanner.nextInt();

        } while (numero % 2 == 0);

        System.out.println("Numero es impar");

    }

//    #################### BUCLE FOR ##########################
    public void tablaDeMultiplicar() {
//        Ejercicio 1: Tabla de multiplicar
//        Descripción:
//        Crea un programa que imprima la tabla de multiplicar del número 5 usando un bucle for.

        int tablaDeMultiplicar = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + tablaDeMultiplicar + " = " + (i * tablaDeMultiplicar));
        }

    }

    public void SumaDeLosDiezPrimerosNumeros() {

//        Ejercicio 2: Suma de los primeros 10 números
//        Descripción:
//        Escribe un programa que calcule la suma de los números del 1 al 10 utilizando un bucle for
        int sumar = 0;

        for (int i = 1; i <= 10; i++) {
            sumar = sumar + i;
        }

        System.out.println("La suma de los numeros del 1 al 10 es: " + sumar);

    }

    public void numerosParesDelUnoAlVeinte() {
//        Ejercicio 3: Números pares del 1 al 20
//        Descripción:
//        Haz un programa que muestre todos los números pares del 1 al 20 con un bucle for.

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
    
    
    public void cuentaRegresiva(){
        
//        Ejercicio 4: Cuenta regresiva
//        Descripción:
//        Crea un programa que imprima una cuenta regresiva del 10 al 1 usando for.


        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        
    }
}
