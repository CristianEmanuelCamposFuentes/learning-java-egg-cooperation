/*
19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaejaprendizaje19;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de filas: ");
        int dimFilas = lector.nextInt();
        
        System.out.println("Ingrese un numero de columnas: ");
        int dimColumnas = lector.nextInt();
      
        //Crear Matriz
        int[][] matriz= crearMatriz(dimFilas, dimColumnas, lector);
        System.out.println("=== SU MATRIZ ===");
        mostrarMatriz(matriz);
        
        //Crear matriz transpuesta
        int[][] matrizTranspuesta= crearMatrizTranspuesta(matriz, dimFilas, dimColumnas, lector);
        System.out.println("=== SU MATRIZ TRANSPUESTA ===");
        mostrarMatriz(matrizTranspuesta);
        
        boolean esAntisimetrica = verificarAntisimetrica(matriz);
                System.out.println("=== ====== ===");

        if(esAntisimetrica){
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }
        
    }
    
    public static int[][] crearMatriz(int dimensionFilas, int dimensionColumnas, Scanner lector){
        int[][] matriz = new int[dimensionFilas][dimensionColumnas];
        for (int i = 0; i < dimensionFilas; i++) {
            for (int j = 0; j < dimensionColumnas; j++) {
                int num;
                do{
                    System.out.println("Ingrese un numero: ");
                    num = lector.nextInt();
                    matriz[i][j] = num;
                } while(num < -10 || num > 10);
                    
            }        
        }
        return matriz;
    }
    
    public static int[][] crearMatrizTranspuesta(int[][] matriz, int dimensionFilas, int dimensionColumnas, Scanner lector){
        int[][] matrizTranspuesta = new int[dimensionFilas][dimensionColumnas];
        for (int i = 0; i < dimensionFilas; i++) {
            for (int j = 0; j < dimensionColumnas; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
                    
            }        
        }
        return matrizTranspuesta;
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for(int elemento: fila){
                System.out.print("|" + elemento + "|");
            }
            System.out.println("");
        }
    }
    
    public static boolean verificarAntisimetrica(int[][] matriz){ 
    int dimensionFilas = matriz.length;
    int dimensionColumnas = matriz[0].length;
    
    
    if( dimensionFilas != dimensionColumnas){
            return false; // La matriz no es cuadrada, por lo tanto, no puede ser antisimetrica
        }
        
        for (int i = 0; i < dimensionFilas; i++) {
            for (int j = 0; j < dimensionColumnas; j++) {
                if (matriz[j][i] != -matriz[i][j]){
                    return false; // Cada elemento debe ser igual al elemento transpuesto negativo
                }
            }        
        }
        return true;
    }
}