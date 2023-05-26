/*
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintroej08;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una nota entre 0 y 10: ");
        int nota = lector.nextInt();
        
        
        while ( nota < 0 || nota > 10) {
            System.out.println("Por favor, ingrese una nota entre 0 y 10: ");
            nota = lector.nextInt();
            
            
        }
        System.out.println("Nota correcta ingresada: " + nota);
    }
}
