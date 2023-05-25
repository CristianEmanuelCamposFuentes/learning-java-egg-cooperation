/*
 DETECCIÓN DE ERRORES
Arreglar la siguiente porción de codigo.
public static void main(String[] args) {
    Scanner leer = new Scanner();
    System.out.println("Ingresa tu edad");
    String nombre = leer.nextInt();

    System.out.println("Ingresa tu nombre");
    int edad = leer.next();
    }
}
 */
package javaintrodeterrores01;
import java.util.Scanner;


/**
 *
 * @author crist
 */
public class JavaIntroDetErrores01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = leer.next();

        System.out.println("Ingresa tu edad:");
        int edad = leer.nextInt();
        
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
    

