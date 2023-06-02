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
        
        int[][] matrizP = crearMatrizP(lector);
        System.out.println("==== SUBMATRIZ INGRESADA ====");
        mostrarMatriz(matrizP);
        
        boolean esSubmatriz = comprobarSubmatriz(matrizM,matrizP);
        System.out.println("==== RESULTADO ====");
        
        if(esSubmatriz){
            System.out.println("Su matriz ingresada es submatriz de la matriz principal.");   
        } else {
            System.out.println("Su matriz ingresada no es submatriz de la matriz principal.");
        }
    }
    
    
    
    
    
    
    public static int[][] crearMatriz(int dim) {
        int[][] matriz = new int[dim][dim];
        
        System.out.println("==== MATRIZ PRINCIPAL ====");
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j] = new Random().nextInt(100);
            }
        }
        return matriz;
    }
    
    
    public static int[][] crearMatrizP(Scanner lector) {
        int[][] matriz = new int[3][3];
        
        System.out.println("==== INGRESE SU SUBMATRIZ ====");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               do {
                   System.out.print("Ingrese un valor para el indice [" +i+"]["+j+"]:  ");
                   matriz[i][j] = lector.nextInt();
               } while(matriz[i][j]<0 || matriz[i][j]>99);
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
    
    public static boolean comprobarSubmatriz(int[][] matrizM, int[][] matrizP) {
        // Comprobacion, tengo en cuenta el largo de las matrices porque 10 - 3 = 7
        // Que es el numero de la ultima fila que puedo recorrer, sino se sale del limite.
        int m = matrizM.length;
        int p = matrizP.length;

        // Bucles anidados para recorrer toda la submatriz principal
        for (int i = 0; i <= m - p; i++) {
            for (int j = 0; j <= m - p; j++) {
                boolean esSubmatriz = true;

                // Con estos comparo cada indice con la submatriz, por eso itera hasta m (es igual a 3)
                for (int k = 0; k < p; k++) {
                    for (int l = 0; l < p; l++) {
                        if (matrizM[i + k][j + l] != matrizP[k][l]) {
                            esSubmatriz = false;
                            break;
                        }
                    }
                    if (!esSubmatriz) {
                        break;
                    }
                }
                if (esSubmatriz) {
                    System.out.println("La submatriz P se encuentra en la matriz M en los índices: ");
                    System.out.println("Fila: " + (i + 1) + " + , Columna: " + (j + 1));
                    return true;
                }
            }
        }
        return false;
    }
}