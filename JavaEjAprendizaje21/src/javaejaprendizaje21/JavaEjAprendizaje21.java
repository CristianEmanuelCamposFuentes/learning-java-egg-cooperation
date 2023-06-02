/*
 21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaejaprendizaje21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector 
        Scanner lector = new Scanner(System.in);
        
        int[][] matrizM = crearMatriz(10);
        mostrarMatriz(matrizM);
        
    }
    
    
    
    
    
    
    public static int[][] crearMatriz(int dim) {
        int[][] matriz = new int[dim][dim];
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j] = new Random().nextInt(100);
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        
        
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.printf("| %2d ", elemento);
            }
            System.out.println("|");
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("_____");
            }
            System.out.println("_");
        }
    }
}
