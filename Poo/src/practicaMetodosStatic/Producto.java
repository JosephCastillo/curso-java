package practicaMetodosStatic;

public class Producto {
    
    private  int id;
    private String nombre;
    private double precio;
    private static int cantidadProductosCreados = 0;

    public Producto(String nombre, double precio){
        id = 1;
        this.nombre = nombre;
        this.precio = precio;
        id = cantidadProductosCreados;
        cantidadProductosCreados++;
    }

    public  String mostrarInfor(){
        return "El id del producto es: " + id + ". El nombre del producto es: " + nombre + ". El precio del producto es: " + precio;
    }

    public static String obtenerTotalProducto(){
        return "El total de productos es: " +  cantidadProductosCreados;
    }

}
