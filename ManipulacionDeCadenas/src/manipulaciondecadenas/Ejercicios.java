package manipulaciondecadenas;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Ejercicios {

    Scanner scanner = new Scanner(System.in);

    public void longitudSubstring() {

        /*
            *Ejercicio 1: Longitud y Substring
    ¨       *Escribe un programa que:

            *Pida al usuario que ingrese una frase.
            *Imprima la longitud de la frase (length).
            *Extraiga y muestre los primeros 5 caracteres usando substring.
         */
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Longitud frase: " + frase.length());
        System.out.println("Extraer los primeros 5 caractes: " + frase.substring(0, 5));
    }

    public void comparacionDeCadenas() {

        /*
        *Ejercicio 2: Comparación de cadenas
        *Crea un programa que:

        *Pida dos cadenas de texto.
        *Compare ambas cadenas usando equals y equalsIgnoreCase.
        *Muestra si las cadenas son iguales o no, ignorando las mayúsculas y minúsculas.
        
         */
        String cadena1, cadena2;

        System.out.println("Ingresa dos cadenas de texto");

        System.out.println("Cadena 1");
        cadena1 = scanner.nextLine();

        System.out.println("Cadena 2");
        cadena2 = scanner.nextLine();

        System.out.println("Con equals: " + cadena1.equals(cadena2));
        System.out.println("Con equalsIgnoreCase: " + cadena1.equalsIgnoreCase(cadena2));

        /*
        *Ejercicio 3: Reemplazo y conversión a mayúsculas/minúsculas
        *Escribe un programa que:

        *Pida una palabra y reemplace todas las vocales por el carácter * (replace).
        *Convierte la palabra a mayúsculas (toUpperCase) y luego a minúsculas (toLowerCase).
        *Muestra ambas versiones.
         */
    }

    public void remplazoConversionMayusculasMinusculas() {

        System.out.println("Ingresa la palabra para remplazar las voclaes con el caracter *");
        String palabra = scanner.nextLine();

        System.out.println(palabra.replace('a', '*')
                .replace('e', '*')
                .replace('i', '*')
                .replace('o', '*')
                .replace('u', '*'));

        System.out.println("Convirtiendo la palabra en mayusculas: " + palabra.toUpperCase() + "  y minusculas " + palabra.toLowerCase());
    }

    public void busquedaCaracteres() {

        /*
        *Ejercicio 4: Búsqueda de caracteres
        *Crea un programa que:

        *Pida una frase al usuario.
        *Encuentra la primera posición del carácter a (indexOf) y la última posición (lastIndexOf).
        *Imprime los resultados.
         */
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println(frase.toLowerCase().indexOf('a'));
        System.out.println(frase.toLowerCase().lastIndexOf('a'));

    }
    
}
