import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Libro libro1 = new Libro("Las tempestálidas","Georgi Gospodinov", 841761,400,2020);
        Libro libro2 = new Libro("Como matar a tu familia","Bella Mackie",849129,400,2021);
        Libro libro3 = new Libro("Oso","Marian Engel",841597,168,1976);
        ArrayList<Libro> librosAutor1 = new ArrayList<Libro>();
        librosAutor1.add(libro1);
        librosAutor1.add(libro2);
        librosAutor1.add(libro3);

        Libro libro4 = new Libro("El sanatorio de las almas perdidas","Elema Montufo", 754859,600,2023);
        Libro libro5 = new Libro("Orgullo y Prejuicio","Jane Austen",845791,600,1813);
        Libro libro6 = new Libro("Gideon, la novena","Tansym Muir",648518,300,2020);
        ArrayList<Libro> librosAutor2 = new ArrayList<Libro>();
        librosAutor2.add(libro4);
        librosAutor2.add(libro5);
        librosAutor2.add(libro6);

        Libro libro7 = new Libro("Crimen y castigo","Dostoyesvki", 481418,250,1800);
        Libro libro8 = new Libro("La cantina de media noche","Yaro Abe",754896,296,2020);
        Libro libro9 = new Libro("El proceso","Kafka",578492,200,1800);
        ArrayList<Libro> librosAutor3 = new ArrayList<Libro>();
        librosAutor3.add(libro7);
        librosAutor3.add(libro8);
        librosAutor3.add(libro9);

        Autor autor1 = new Autor("Georgi Gospodinov","bulgaro",1970,0,librosAutor1);
        Autor autor2 = new Autor("Jane Austen","inglesa",1790,1850,librosAutor2);
        Autor autor3 = new Autor("Kafka","alemán",1883,1924,librosAutor3);

        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println(autor3);

        ArrayList<Autor> listaAutores = new ArrayList<Autor>();
        listaAutores.add(autor1);
        listaAutores.add(autor2);
        listaAutores.add(autor3);

        System.out.println("Muestra el nombre de los autores que no están muertos:");
        for(Autor autor : listaAutores){
            if (autor.getAnioMuerte() == 0) System.out.println(autor.getNombre());
        }
        System.out.println("Muestra el nombre de los libros que tengan más de 200 páginas.  ");
        for(Autor autor : listaAutores){
            for(Libro libro : autor.getLibrosEscritos()){
                if (libro.getNumPaginas() >= 200) System.out.println(libro.getTitulo());
            }
        }
        System.out.println("Muestra el nombre de los autores que tengan más de 30 años:");
        for(Autor autor : listaAutores){
            if (autor.getAnioMuerte() == 0 && (2024 - autor.getAnioNacimiento()) > 30) System.out.println(autor.getNombre());
        }
        System.out.println("Muestra el nombre de los libros que fueron escritos cuando sus autores tenían menos de 30 años:");
        for(Autor autor : listaAutores){
            for(Libro libro : autor.getLibrosEscritos()){
                if (libro.getFechaPublicacion() - autor.getAnioNacimiento() < 30) {System.out.println(libro.getTitulo());}
                
            }
        }
        System.out.println("Muestra el nombre de los autores cuyos libros nunca tengan más de 500 páginas:");
        for(Autor autor : listaAutores){
            boolean sonLibrosChiquitos = true;
            for(Libro libro : autor.getLibrosEscritos()){
                if (libro.getNumPaginas() > 500) sonLibrosChiquitos = false;  
            }
            if (sonLibrosChiquitos) System.out.println(autor.getNombre());
        }

    }
}
