/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaejaprendizaje05;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();
        
        calcular(numero);
        
        
    }
    
    public static void calcular(int num){
        
        System.out.println("El doble del numero ingresado es: " + num*2);
        
        System.out.println("El doble del numero ingresado es: " + num*3);
        
        System.out.println("El doble del numero ingresado es: " + (Math.sqrt(num)));
    }
    
}
