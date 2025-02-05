
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Ejercicios {
    
    Scanner scanner = new Scanner(System.in);
    
    public void numeroPositivoNegativo(){
        
        /* 
         *Ejercicio 1: Número positivo o negativo
         *Escribe un programa que:

         *Pida un número al usuario.
         *Verifique si el número es positivo, negativo o cero, y muestra el resultado.
        */
        
        int numero;
        
        System.out.println("Ingresa un numero para validar si es positivo, negativo o cero: ");
        numero = scanner.nextInt();
        
        if(numero == 0){
            System.out.println("El numero es 0");
        }
        else if (numero > 0){
            System.out.println("El numero es positivo");
        }
        else if(numero <0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("NO ingresaste un valor valido");
        }
    }
    
    
    public void mayorDeDosNumeros(){
        /*
        *Ejercicio 2: Mayor de dos números
        *Crea un programa que:

        *Solicite dos números al usuario.
        *Use if-else para determinar cuál es el mayor o si son iguales.
        */
        
        int num1, num2;
        
        
        System.out.println("Ingresa dos numeros para determinar cual es mayo o si son iguales: ");
        
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        
        
        if (num1 == num2){
            System.out.println("Los numeros son iguales");
        }
        else if(num1 > num2){
            System.out.println("El numero 1, es mayor");
        }
        else if(num2 > num1){
            System.out.println("El numero 2, es mayor");
        }
        else{
            System.out.println("No ingresaste un valor valido");
        }
    }
    
    
    public void anioBisiesto(){
        /*
        *Ejercicio 3: Año bisiesto
        *Escribe un programa que:

        *Pida un año y determine si es bisiesto (un año es bisiesto si es divisible entre 4 y no entre 100, excepto si es divisible entre 400).
        */
        
        int anio;
        
        System.out.println("Ingresa el año: ");
        
        
        anio = scanner.nextInt();
        
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("NO es bisiesto");
        }
        
        
        
    }
    
    
   public void clasificacionEdad(){
       
       /*
        *Ejercicio 4: Clasificación de edad
        *Crea un programa que:

        *Solicite la edad de una persona.
        *Muestra un mensaje según la clasificación:
        *Menor de 18: "Eres menor de edad".
        *Entre 18 y 65: "Eres adulto".
        *Mayor de 65: "Eres adulto mayor".
       */
       
       int edadPersona;
       
       System.out.println("Ingrese la edad de una persona: ");
       edadPersona = scanner.nextInt();
       
       if(edadPersona < 18){
           System.out.println("Eres menor de edad");
       }
       else if(edadPersona >= 18 && edadPersona <= 65){
           System.out.println("Eres adulto");
       }
       else if(edadPersona > 65){
           System.out.println("Eres un adulto mayor");
       }
       else{
           System.out.println("Ingresa un numero valido");
       }
       
       
       
       
       
   }
    
    public void notasExamen(){
           /*Ejercicio 5: Notas de examen
            *Crea un programa que:

            *Pida la nota de un examen (de 0 a 100).
            *Use if-else para clasificarla:
            *Menor de 50: "Reprobado".
            *Entre 50 y 74: "Aprobado".
            *Mayor o igual a 75: "Sobresaliente".*/
           
           double nota;
           
           System.out.println("Ingresa la nota de 0 a 100");
           
           nota = scanner.nextDouble();
           
           
           if(nota < 50){
               System.out.println("Reprobado");
           }
           else if(nota >= 50 && nota <= 74){
               System.out.println("Aprobado");
           }
           else if(nota >= 75){
               System.out.println("Sobresaliente");
           }
           else{
               System.out.println("Ingresa un valor correcto");
           }
       }
}
