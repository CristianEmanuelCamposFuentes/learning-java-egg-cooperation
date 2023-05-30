/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
 */
package javaejaprendizaje16;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension: ");
        int dim = lector.nextInt();
        
        float[] miVector = crearVector(lector, dim);
        
        System.out.println("Ingrese el numero que quiere buscar: ");
        int numero = lector.nextInt();
        
        buscarNumero(miVector, numero, dim);
        
    }
    
    
    public static float[] crearVector(Scanner lector, int dimension ){
        float[] vector = new float[dimension];
        
        System.out.println("============================");
        
        for (int i = 0; i < dimension; i++) {
            vector[i] = Math.round((Math.random()*10));
            
        }
        for (float elemento : vector) {
            System.out.print("|" + elemento + "|");
        }
        System.out.println("");
        System.out.println("============================");
        return vector;
    }
    
    public static void buscarNumero(float[] vector, int numeroBuscado,int dimension ){
        int cantVeces = 0;
        
        System.out.println("============================");
        
        for (int i = 0; i < dimension; i++) {
            
            if(numeroBuscado == vector[i]){
                System.out.println("Se encontro el numero en la posicion: " + i);
                cantVeces++;
            }
        }
        if(cantVeces <= 0){
            System.out.println("El numero "+ numeroBuscado + " no aparece en el vector.");
        } else if(cantVeces == 1){
            System.out.println("El numero "+ numeroBuscado + " aparece una vez en el vector.");
        } else {
            System.out.println("El numero "+ numeroBuscado + " aparece " +cantVeces+ " veces en el vector.");
        }
        
    }
    
}
