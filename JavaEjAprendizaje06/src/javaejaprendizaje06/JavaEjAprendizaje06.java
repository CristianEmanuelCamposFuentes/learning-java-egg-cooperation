/*
6. Crear un programa que dado un numero determine si es par o impar.
 */
package javaejaprendizaje06;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = lector.nextInt();
        calculoParidad(num);
    }
    
    public static void calculoParidad(int numero){
        if(numero % 2 == 0){
            System.out.println("Su numero es par.");
        } else {
            System.out.println("Su numero es impar.");
        }
    }
}
