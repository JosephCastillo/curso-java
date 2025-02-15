package ejercicioarraybidimensional;

import java.util.Scanner;

public class RegistroVentasSemanalesTienda {

    public void ventasSemanales() {

//        Ejercicio: Registro de ventas semanales en una tienda
//        Crea un programa que gestione y analice las ventas semanales de 4 productos en una tienda. 
//        Utiliza un array bidimensional para almacenar las ventas de cada producto durante los 7 días de la semana.
//
//        Instrucciones:
//
//        Declara un array bidimensional ventas[4][7] (4 productos y 7 días)✅
//        Solicita al usuario que ingrese las ventas diarias para cada producto.✅
//        Calcula y muestra:
//        Total de ventas por producto.✅
//        Total de ventas semanal.✅
//        El día con mayor venta para cada producto.✅
        Scanner scanner = new Scanner(System.in);

        final int CANTIDAD_PRODUCTOS = 4;
        final int CANTIDAD_DIAS = 7;

        double valorProducto, totalVentaProducto = 0, totalVentaSemana = 0, maxVenta = 0, diaMax = 0;

        String[] nombreProducto = new String[CANTIDAD_PRODUCTOS];
        double[][] productos = new double[CANTIDAD_PRODUCTOS][CANTIDAD_DIAS];

        //Se llena el array con  nombres de productos
        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            nombreProducto[i] = "Producto: " + i;
        }

        //Se ingresan los valores de cada producto
        System.out.println("Ingresa las ventas diarias para cada producto: ");
        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            for (int j = 0; j < CANTIDAD_DIAS; j++) {
                valorProducto = scanner.nextDouble();
                //guarda valor del producto
                productos[i][j] = valorProducto;
            }

        }

        //Total ventas por producto, semana y dia con mayor venta 
        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            System.out.println();
            for (int j = 0; j < CANTIDAD_DIAS; j++) {
                // Total venta por producto producto
                totalVentaProducto = totalVentaProducto + productos[i][j];
                // Total venta producto  semana 
                totalVentaSemana = totalVentaSemana + productos[i][j];
                //Calcular la máxima venta del producto
                if (maxVenta < productos[i][j]) {
                    diaMax = j+1;
                    maxVenta = productos[i][j];
                }
            }
            //Imprime el nombre del producto
            System.out.print(nombreProducto[i] + ": ");
            //Imprime el total de productos
            System.out.println("Total productos: " + totalVentaProducto);
            //Coloca en 0 de nuevo el valor del producto
            totalVentaProducto = 0;
            //Imprime el valor de producto  semanal
            System.out.println("Total venta semana: " + totalVentaSemana);

        }
        System.out.println("El dia de la maxima venta: " + diaMax + ", la maxima venta fue: " + maxVenta);

//         Muestra los productos 
//        for (double[] fila : productos) {
//            System.out.println();
//            for (double z : fila) {
//
//                System.out.print(z);
//            }
//        }
    }

}
