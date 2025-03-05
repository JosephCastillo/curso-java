package practicaMetodosStatic;

public class app {
    public static void main(String[] args){
        
        Producto producto1 = new Producto("Brayam", 2000);
        Producto producto2 = new Producto("Carlso", 2300);
        Producto producto3 = new Producto("Camila", 2040);
        Producto producto4 = new Producto("Jorge", 300);

        System.out.println(producto1.mostrarInfor());
        System.out.println(producto2.mostrarInfor());
        System.out.println(producto3.mostrarInfor());
        System.out.println(producto4.mostrarInfor());


        System.out.println(Producto.obtenerTotalProducto());


    }
}
