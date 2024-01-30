public class Libro {

    private String titulo;
    private String autor;
    private final int ISBN;
    private int numPaginas;

    /**
     * Constructor de parámetros
     * Crear un libro con el título, el autor, ISBN y número de páginas especificados
     * @param titulo El título del libro
     * @param ISBN El ISBN del libr
     */
    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.autor = "(sin autor)";
        this.ISBN = ISBN;
        this.numPaginas = 0;
    }

    /**
     * Constructor de parámetros
     * Crear un libro con el título, el autor, ISBN y número de páginas especificados
     * @param titulo El título del libro
     * @param autor El autor del libro
     * @param ISBN El ISBN del libro
     * @param numPaginas El número de páginas del libro
     */
    public Libro(String titulo, String autor, int ISBN, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    /**
     * Obtener el título actual del libro
     * @return El título del libro
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Obtener el autor actual del libro
     * @return El autor del libro
     */
    public String getAutor(){
        return this.autor;
    }

    /**
     * Obtener el ISBN actual del libro
     * @return El ISBN del libro
     */
    public int getISBN(){
        return this.ISBN;
    }

    /**
     * Obtener el número de páginas actual del libro
     * @return El número de páginas del libro
     */
    public int getNumPaginas(){
        return this.numPaginas;
    }

    /**
     * Establecer el título del libro
     * @param titulo El nuevo titulo del libro
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Establecer el autor del libro
     * @param autor El nuevo autor del libro
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Establecer el numPaginas del libro
     * @param numPaginas El nuevo numPaginas del libro
     */
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    /**
     * Devolver la representación en formato de cadena (String) del objeto libro
     * @return Una cadena que representa el objeto libro
     */
    public String toString(){
        return "El libro " + this.titulo + ", de " + this.autor + ", con ISBN: " + this.ISBN + "; tiene " + this.numPaginas + " páginas.";
    }

    public static void main(String[] args){
        Libro libro1 = new Libro("LAS TEMPESTALIDAS", 123456789);
        Libro libro2 = new Libro("JUEGO DE TRONOS", "R.R. Martín", 123456789, 568);

        System.out.println("libro1 --> " + libro1);
        System.out.println("libro2 --> " + libro2);
    }
}
