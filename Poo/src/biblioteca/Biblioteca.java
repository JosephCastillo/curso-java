package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (libro.mostrarEstadoLibro()) {
                System.out.println(libro.muestraInformacionLibro());
            }
        }
    }

    public Libro buscarLibro(String criterio) {
        for (Libro libro : libros) {
            if (libro.mostrarTitulo().equalsIgnoreCase(criterio) || libro.mostrarAutor().equalsIgnoreCase(criterio)) {
                return libro;
            }
        }
        return null;
    }

}
