/*
 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package javaejaprendizaje13;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int dim = lector.nextInt();
        
        char[][] matriz= crearCuadrado(dim);
        mostrarMatriz(matriz);
    }
    
    public static char[][] crearCuadrado(int dimension){
        char[][] matriz = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i == 0 || i == dimension -1 || j == 0 || j == dimension - 1){
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(char[][] matriz){
        for (char[] fila : matriz) {
            for(char elemento: fila){
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }
}
