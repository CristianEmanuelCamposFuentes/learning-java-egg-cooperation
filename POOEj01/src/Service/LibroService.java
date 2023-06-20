package Service;

import Entidad.Libro;

import java.util.Scanner;

public class LibroService {
    // Variable de instancia para mantener cada valor
    private Libro libro;
    public Libro crearLibro(){
        Scanner lector = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el codigo ISBN: ");
        int ISBN = lector.nextInt();

        System.out.println("Ingrese el titulo: ");
        String titulo = lector.next();

        System.out.println("Ingrese el autor: ");
        String autor = lector.next();

        System.out.println("Ingrese el numero de paginas: ");
        int numPaginas = lector.nextInt();

        // Debo darle esos valores a la variable ya instanciada
        libro = new Libro(ISBN, titulo, autor, numPaginas);

        return libro;
    }

    public String informarLibro(){
        return "Libro{" + "ISBN=" + libro.getISBN() + ", titulo=" + libro.getTitulo() + ", autor=" + libro.getAutor() + ", numPaginas=" + libro.getPaginas() + '}';
    }
}
