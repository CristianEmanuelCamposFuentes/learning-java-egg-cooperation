/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaejaprendizaje02;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        
        // next() para tomar solo una palabra
        // nextLine() para tomar toda la linea completa
        String nombre = lector.nextLine();
        
        mostrarPantalla(nombre);
    }
    
    public static void mostrarPantalla(String nombrePersona){
        System.out.println("Su nombre es: " + nombrePersona);
    }
}
