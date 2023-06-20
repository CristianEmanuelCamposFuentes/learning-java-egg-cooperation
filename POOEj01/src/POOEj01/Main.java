package POOEj01;

import Entidad.Libro;
import Service.LibroService;

public class Main {

    /* 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
     */


    public static void main(String[] args) {
        // Invocar el servicio para acceder a los metodos
        LibroService SV = new LibroService();
        Libro libroPrincipito = SV.crearLibro();

        // Almaceno en una variable
        String elPrincipito = SV.informarLibro();
        System.out.println(elPrincipito);
        System.out.println(libroPrincipito);
    }
}