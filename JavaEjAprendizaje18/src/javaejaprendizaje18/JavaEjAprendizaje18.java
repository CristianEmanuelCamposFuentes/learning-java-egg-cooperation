/*
18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaejaprendizaje18;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int dim = lector.nextInt();
        
        int[][] matriz= crearCuadrado(dim);
        System.out.println("=== SU MATRIZ ===");
        mostrarMatriz(matriz);
        
        int[][] matrizTranspuesta = crearTranspuesta(matriz, dim);
        System.out.println("=== SU MATRIZ TRANSPUESTA ===");
        mostrarMatriz(matrizTranspuesta);
    }
    
    public static int[][] crearCuadrado(int dimension){
        Random random = new Random();
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                
                    matriz[i][j] = random.nextInt(10);
            }        
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for(int elemento: fila){
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] crearTranspuesta(int[][] matriz, int dimension){
        
        int[][] matrizTranspuesta = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                
                    matrizTranspuesta[j][i] = matriz[i][j];
            }        
        }
        return matrizTranspuesta;
    }
}