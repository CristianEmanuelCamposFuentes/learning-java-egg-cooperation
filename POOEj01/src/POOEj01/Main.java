package POOEj01;

import Entidad.Libro;
import Service.LibroService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    /* 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
     */


    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);

        // Crear la lista de libros
        List<Libro> libros = new ArrayList<>();

        // Invocar el servicio para acceder a los metodos
        LibroService SV = new LibroService();

        int cantidadLibros;

        System.out.println("Ingrese el número de libros que desea cargar: ");
        cantidadLibros = lector.nextInt();

        for (int i = 0; i < cantidadLibros; i++) {
            Libro libroActual = SV.crearLibro();
            libros.add(libroActual);
        }

        for(Libro libro : libros){
            SV.informarLibro(libro);
        }
    }
}