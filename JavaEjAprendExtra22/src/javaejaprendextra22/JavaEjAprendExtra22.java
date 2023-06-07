/*
22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package javaejaprendextra22;
import java.util.Random;
/**
 *
 * @author crist
 */
public class JavaEjAprendExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 3; // Cantidad de filas
        int M = 4; // Cantidad de columnas
        
        int[][] matriz = new int[N][M];
        
        // Rellenar la matriz con valores aleatorios
        rellenarMatriz(matriz);
        
        // Mostrar la matriz
        System.out.println("Matriz:");
        mostrarMatriz(matriz);
        
        // Calcular la suma de los elementos de la matriz
        int suma = calcularSuma(matriz);
        
        System.out.println("La suma de los elementos es: " + suma);
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        Random random = new Random();
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz1[j] = random.nextInt(10); // Generar valores aleatorios entre 0 y 9
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz1[j];
            }
        }
        return suma;
    }    
}
