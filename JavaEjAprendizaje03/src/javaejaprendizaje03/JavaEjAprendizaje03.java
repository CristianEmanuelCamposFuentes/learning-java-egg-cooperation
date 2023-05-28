/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package javaejaprendizaje03;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        String fraseMayusculas = fraseMayus(frase);
        System.out.println("Su frase en mayusculas es : "+fraseMayusculas);
        
        String fraseMinusculas = fraseMinus(frase);
        System.out.println("Su frase en minusculas es : "+fraseMinusculas);
    }
    
    public static String fraseMayus(String fraseOriginal){
        return fraseOriginal.toUpperCase();
    }
    
    public static String fraseMinus(String fraseOriginal){
        return fraseOriginal.toLowerCase();
    }
}
