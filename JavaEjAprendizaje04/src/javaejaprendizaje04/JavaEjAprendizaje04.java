/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaejaprendizaje04;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura: ");
        int grados = lector.nextInt();
        
        calcularF(grados);
    }
    
    public static void calcularF(int temperatura){
        int f = 32 + (9 * temperatura / 5);
        
        System.out.println("La temperatura corresponde a "+ f +" grados Fahrenheit.");
    }
}
