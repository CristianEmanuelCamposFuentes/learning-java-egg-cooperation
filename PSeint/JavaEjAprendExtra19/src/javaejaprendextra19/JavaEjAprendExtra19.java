/*
19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package javaejaprendextra19;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        int dim = scanner.nextInt();

        int[] vector1 = new int[dim];
        int[] vector2 = new int[dim];

        // Ingreso de los valores del primer vector por el usuario
        System.out.println("Ingrese los valores para el primer vector:");
        for (int i = 0; i < dim; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        // Ingreso de los valores del segundo vector por el usuario
        System.out.println("Ingrese los valores para el segundo vector:");
        for (int i = 0; i < dim; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        boolean sonIguales = true;

        // Verificación de igualdad de los vectores
        for (int i = 0; i < dim; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false;
                break;
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    } 
}
