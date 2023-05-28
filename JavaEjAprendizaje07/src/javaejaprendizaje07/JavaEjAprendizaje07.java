/*
7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package javaejaprendizaje07;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = lector.next();
        esEureka(frase);
    }
    
    public static void esEureka(String frase){
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}
