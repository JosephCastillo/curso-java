package estructuras;

import java.util.Scanner;

public class Ejercicios {
    
      //Se crea un objeto de la clase Scanner llamado scanner
        Scanner scanner = new Scanner(System.in);

    /*
    * Ejercicio 1: Declaración y asignación de variables
    * Crea un programa que declare las siguientes variables y les asigne valores:

    * Un número entero (int) para representar tu edad.
    * Un número decimal (double) para representar tu altura en metros.
    * Un carácter (char) para la inicial de tu nombre.
    * Una cadena (String) para tu ciudad favorita.
    * Después, imprime todos los valores en la consola.
     */
    public void declaracionAsignaciónVariables() {
        int edad = 32;
        double altura = 1.69;
        char inicialNombre = 'J';
        String ciudadFavorita = "Bogota D.C.";

        System.out.println("***********************");
        System.out.println("Declaracion y asignacion de variables");
        System.out.println("************************");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Letra inicial de mi nombre: " + inicialNombre);
        System.out.println("Ciudad favorita: " + ciudadFavorita);
    }

    /*
     Ejercicio 2: Operadores aritméticos
    *Crea un programa que:

    *Declare dos números enteros (int) y realiza las siguientes operaciones:
    *Suma
    *Resta
    *Multiplicación
    *División
    *Módulo (resto de la división)
    *Muestra los resultados en la consola.
     */
    public void operacionesMatematicas() {
        int num1 = 2, num2 = 5;

        System.out.println("***********************");
        System.out.println("Operaciones matematicas");
        System.out.println("************************");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num2 / num1));
        System.out.println("Resto de division: " + (num2 % num1));
    }

    /*
    * Ejercicio 3: Uso de constantes
    * Crea un programa que:

    * Declare una constante (final) llamada PI con el valor 3.1416.
    * Calcula el área de un círculo usando la fórmula Área = PI * radio * radio.
    * Imprime el resultado.
     */

    public void usoConstantes() {
        //constante PI
        final double PI = 3.1416;
        //variables
        double area, radio;

        //asignación variables
        radio = 5.0;

        System.out.println("***********************");
        System.out.println("Uso de constantes");
        System.out.println("************************");
        //formula para calcular el área de un circulo
        area = PI * radio * radio;
        System.out.println("Area de un circulo: " + (area));
    }

    /*
    *Ejercicio 3: Operadores de comparación
    *Escribe un programa que:

    *Declare dos variables (int a = 10; int b = 20;).
    *Usa los operadores >, <, >=, <=, == y != para comparar ambas variables.
    *Imprime en la consola el resultado de cada comparación.
     */

    public void operadoresComparacion() {

        int a = 10, b = 20;

        System.out.println("***********************");
        System.out.println("Operadores de comparacion");
        System.out.println("************************");

        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " <= " + b + ": " + (a <= b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));

    }

    public void operadoresLogicos() {

        System.out.println("************************");
        System.out.println("Operadores de comparacion");
        System.out.println("*************************");
        /*
        *Ejercicio 4: Operadores lógicos
        *Crea un programa que:

        *Declare dos variables booleanas (true o false).
        *Usa los operadores && (AND), || (OR), y ! (NOT) para mostrar combinaciones de resultados.
        *Imprime cada resultado.
         */

        boolean verdadera = true;
        boolean falsa = false;

        System.out.println(verdadera + " AND " + falsa + ": " + (verdadera && falsa));
        System.out.println(verdadera + " OR " + falsa + ": " + (verdadera || falsa));
        System.out.println(verdadera + "  NOT " + falsa + " : " + !verdadera + " " + !falsa);

    }
    
    public void claseMath(){
        /*
        *Ejercicio 1: Raíz cuadrada y potencia
        *Escribe un programa que:

        *Pida al usuario que ingrese dos números.
        *Calcule e imprima la raíz cuadrada del primer número y el segundo número elevado al cubo (Math.pow).
        */
        
        System.out.println("************************");
        System.out.println("Raiz cuadrada y potencia");
        System.out.println("*************************");
        
        
      
        
        System.out.println("Ingresa dos numeros: ");
        
        int num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        
        System.out.println("Ingresa el exponente: ");
        double exp = scanner.nextDouble();
        
        
        
        //Calcluar la raiz cuadrada
        double raiz = Math.sqrt(num1);
        
        //Segundo numero elevado al cubo
        double elevadoAlCubo = Math.pow(num2, exp);
        
        //Imprimir raiz cuadrada del primer número
        System.out.println("Raiz cuadrada del primer numero es: " + raiz);
        //Imprimir número elevado al cubo.
        System.out.println("Numero elevado al cubo: " + elevadoAlCubo);
    }
    
    
    public void numerosAleatorios(){
     
        /*Ejercicio 2: Números aleatorios
         *Crea un programa que:

         *Genere cinco números aleatorios entre 1 y 100 usando Math.random().
         *Imprima cada número.
        */
        
        System.out.println("************************");
        System.out.println("Numeros aleatorios");
        System.out.println("*************************");
        
        
        double numeroAleatorio;
        
        numeroAleatorio = Math.random()*100;
        System.out.println(numeroAleatorio);
        numeroAleatorio = Math.random()*100;
        System.out.println(numeroAleatorio);
        numeroAleatorio = Math.random()*100;
        System.out.println(numeroAleatorio);
        numeroAleatorio = Math.random()*100;
        System.out.println(numeroAleatorio);
        numeroAleatorio = Math.random()*100;
        System.out.println(numeroAleatorio);
        
        
        
        
        
    }            
    
    
    public void redondeoValorAbsoluto(){
        /* 
        *Ejercicio 3: Redondeo y valor absoluto
        *Crea un programa que:

        *Pida al usuario que ingrese un número decimal.
        *Imprima el número redondeado hacia arriba (Math.ceil), hacia abajo (Math.floor), y el valor absoluto (Math.abs).
        */
        
        System.out.println("************************");
        System.out.println("Redondeo y valor absoluto");
        System.out.println("*************************");
        
        
        System.out.println("Ingresa un numero decimal: ");
        double  numDecimal = scanner.nextFloat();
        
        //redondeado hacia arriba
        System.out.println("Redondeado hacia arriba: " + Math.ceil(numDecimal));
       
        //redondeado hacia abajo
        System.out.println("Redondeado hacia abajo:  " + Math.floor(numDecimal));
        
        //valor absoluto
        System.out.println("Redondeado absoluto: " + Math.abs(numDecimal));
    }
    
    public void maximoMinimo(){
        /*
         *Ejercicio 4: Máximo y mínimo
         *Escribe un programa que:

         *Pida tres números al usuario.
         *Determine cuál es el mayor y el menor usando Math.max y Math.min.
        */
        
        int num1, num2, num3;
        
        System.out.println("Ingresa tres numero para determinar cual es mayor y menor");
        
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        
        //sacamos el máximo
        System.out.println("El mayor es: " + Math.max(num1, Math.max(num2, num3)));

        //sacamos el mínimo 
        System.out.println("El menor es: " + Math.min(num1, Math.min(num2, num3 )));
    }
}
