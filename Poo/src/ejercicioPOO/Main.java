package ejercicioPOO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a = 0, b = 0;

        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Ingresa los dos numeros para hacer la operación");
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        System.out.println("La suma de los números es: " + calc.sumar(a,b));
        System.out.println("La resta de los números es: " + calc.restar(a,b));
        System.out.println("La multiplicación de los números es: " + calc.multiplicar(a,b));
        System.out.println("La división de los números es: " + calc.dividir(a,b));
        scanner.close();

    }

}
