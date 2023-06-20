/*
 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaejaprendizaje15;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        crearVector(lector);
    }
    
    
    public static void crearVector(Scanner lector ){
        int[] vector = new int[100];
        int j = 1;
        for (int i = 99; i >= 0; i--) {
            vector[i] = j;
            j++;
        }
        for (int elemento : vector) {
            System.out.print("|" + elemento + "|");
        }
    }
}
