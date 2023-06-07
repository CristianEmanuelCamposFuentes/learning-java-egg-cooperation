/*
18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package javaejaprendextra18;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = scanner.nextInt();

        int[] vector = new int[tamanio];

        // Ingreso de los valores del vector por el usuario
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int suma = 0;

        // Cálculo de la suma de los elementos del vector
        for (int i = 0; i < tamanio; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    } 
}
