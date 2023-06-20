/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package javaejaprendextra03;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        String letra = lector.nextLine().toLowerCase();
        
        if(esVocal(letra)){
            System.out.println("La letra ingresada es vocal.");
        } else {
            System.out.println("La letra ingresada no es vocal.");
        }
    }
    
    public static boolean esVocal(String letra) {
        return letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u");
        
        
    }
    
//    public static void esVocal(char letra) {
//        // Lector
//        switch(letra){
//            case 'a':
//                System.out.println("Es vocal.");
//                break;
//            case 'e':
//                System.out.println("Es vocal.");
//                break;
//            case 'i':
//                System.out.println("Es vocal.");
//                break;
//            case 'o':
//                System.out.println("Es vocal.");
//                break;
//            case 'u':
//                System.out.println("Es vocal.");
//                break;
//            default:
//                System.out.println("No es vocal.");
//                break;
//        }
//    }
}
