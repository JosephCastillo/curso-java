
package biblioteca;


public class App {

    
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("1948", "George Orwell", 328, true);
        Libro libro2 = new Libro("Cien años de soliedad", "Gabriel García Márquez", 471, false);
    
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        
        System.out.println("Libros disponibles en la biblioteca");
        biblioteca.mostrarLibrosDisponibles();
        
        Libro encontrado = biblioteca.buscarLibro("1948");
        
        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado.muestraInformacionLibro());
        }
        else{
            System.out.println("El libro no se encontró en la biblioteca");
        }
    }
    
}
