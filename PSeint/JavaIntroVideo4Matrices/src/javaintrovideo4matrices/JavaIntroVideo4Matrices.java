/*
 EJERCICIO MATRICES Y VECTORES
Realizar el producto de un vector por una matriz
Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM
Ej. Vector 1x2 * Matriz 2x3 = producto 1x3

V = | 3 , 5 | * M = | 4 , 8 , 6 |  = |3x4+5x2 , 3x8+5x1 , 3x6+5x7| = |22,29,53|
                    | 2 , 1 , 7 |            
 */
package javaintrovideo4matrices;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroVideo4Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Declaracion y creacion de un vector
         // tipo[] nombreVector = new Tipo[tamaño];
         
         // Declarar un arreglo de una dimension
         int[] vector;
         // Crear en memoria con el valor por defecto (0 para enteros)
         vector = new int[2];
         // Los dos pasos en una linea
         int[] producto = new int[3];
         
         // Declaracion de una Matriz
         // tipo[][] nombreMatriz = new tipo[filas][columnas]
         
         // Declaracion y definicion con valores predeterminados
         int[][] matriz = {{4,8,6},{2,1,7}};
         
         // Declaracion y creacion de arreglos genericos
         // Tipo[][]...[] nombreArreglo = new Tipo[cardinalidad1][cardinalidad2]...[cardinalidadN];
         
         System.out.println("Ingrese los valores del vector de tamaño" + vector.length + ": ");
         Scanner lector = new Scanner(System.in);
         
         // int = 0, porque los subindices de los arreglos en Java comienzan desde cero.
         for (int i = 0; i < vector.length; i++) {
             System.out.print("v["+i+"]=");
             // Acceder al valor i del vector
             vector[i] = lector.nextInt();
        }
         
        // Multiplica vector por matriz
        int sum;
        //... para cada columna de la matriz ...
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            //... recorro el vector y multiplico
            for(int i = 0;i< vector.length; i++){
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        String aux = "";
        
        // Mostrar vector
        System.out.println("* Vector ");
        // bucle for "MEJORADO" (ENHANCED)
        //for (tipo nombreVariable: arreglo)
        for (int elemento : vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        // Mostrar matriz
        System.out.println("\n* Matriz: ");
        //Para cada fila de la matriz
        for(int[] fila: matriz){
            aux = "";
            //Para cada elemento de la fila
            for(int elemento: fila){
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        
        // Mostrar resultado
        aux = "";
        System.out.println("\n* Vector x Matriz : ");
        for(int elemento: producto){
            aux += " " + elemento;
            
        }
        System.out.println(aux);
    }
}
