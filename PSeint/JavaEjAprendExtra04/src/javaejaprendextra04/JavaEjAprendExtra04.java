/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package javaejaprendextra04;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();
        
        if(numero > 0 && numero <=10){
            String numeroRomano = convertirARomano(numero);
        System.out.println("El número convertido a romano es: " + numeroRomano);
        } else {
            System.out.println("El número debe estar entre 1 y 10.");
        }  
    }
    
    public static String convertirARomano(int numeroAConvertir) {
        String[] numerosRomanos = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        
        return numerosRomanos[numeroAConvertir - 1];
    }
}
