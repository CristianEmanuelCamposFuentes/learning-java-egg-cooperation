/*
20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package javaejaprendextra20;

import java.util.Random;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        int[] vector = new int[10]; // Tamaño del vector
        
        rellenarVectorAleatorio(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVectorAleatorio(int[] vector) {
        Random random = new Random();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Generar número aleatorio entre 0 y 99
        }
    }
    
    public static void imprimirVector(int[] vector) {
        System.out.println("Vector:");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
