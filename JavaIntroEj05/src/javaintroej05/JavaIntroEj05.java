/*
 Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
    Scanner.
 */
package javaintroej05;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variables = new Scanner(System.in);
        System.out.println("Scanner creado, ahora voy a aplicarlo en las variables.");
        
        System.out.println("Ingresando booleano: ");
        boolean booleano1 = variables.nextBoolean();
        System.out.println("Ingresaste : " + booleano1);
        
        System.out.println("Ingresando double: ");
        double double1 = variables.nextDouble();
        System.out.println("Ingresaste : " + double1);
        
        System.out.println("Ingresando character: ");
        char char1 = variables.next().charAt(0);
        System.out.println("Ingresaste : " + char1);
        
    }
    
}
