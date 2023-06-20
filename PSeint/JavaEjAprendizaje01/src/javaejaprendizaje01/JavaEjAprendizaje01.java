/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaejaprendizaje01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = lector.nextInt();
        System.out.println("Ingrese el primer numero: ");
        int num2 = lector.nextInt();

        int resultado = sumar(num1, num2);
        System.out.println("La suma de ambos elementos es: " + resultado);
    }
    
    
    public static int sumar(int a, int b) {
        
        int c = a + b;
        
        return c;
        
    }
}
