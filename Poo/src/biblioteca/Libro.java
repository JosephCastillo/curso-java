package biblioteca;

public class Libro {

    private String titulo, autor;
    private int numeroPaginas;
    private boolean disponiblePrestamo;

    public Libro(String titulo, String autor, int numeroPaginas, boolean disponiblePrestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponiblePrestamo = disponiblePrestamo;
    }

    public void ingresaTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String mostrarTitulo() {
        return this.titulo;
    }

    public void ingresaAutor(String autor) {
        this.autor = autor;
    }

    public String mostrarAutor() {
        return this.autor;
    }

    public void ingresaNumeroDePaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int mostrarNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setEstadoLibro(boolean disponiblePrestamo) {
        this.disponiblePrestamo = disponiblePrestamo;
    }

    public boolean mostrarEstadoLibro() {
        return this.disponiblePrestamo;
    }

    public String muestraInformacionLibro() {
        String disponibilidad;
        if (this.disponiblePrestamo == true) {
            disponibilidad = "Si";
        } else {
            disponibilidad = "No";
        }

        return "El titulo del libro es: " + this.titulo
                + ". El autor del libro es: " + this.autor
                + ". El numero de paginas que tiene el libro son: " + this.numeroPaginas
                + ". Esta diponible para prestamo: " + disponibilidad;
    }

    public String prestarLibro() {
        if (!this.disponiblePrestamo) {
            return "El libro " + this.titulo + " ya esta prestado.";
        }
        this.disponiblePrestamo = false;
        return "Has prestado el libro " + this.titulo + ".";
    }

    public String devolverLibro() {
        if(this.disponiblePrestamo){
            return "El libro " + this.titulo + " ya esta disponible.";
        }
        this.disponiblePrestamo = true;
        return "Has devuelto el libro " + this.titulo + ".";
    }
}
