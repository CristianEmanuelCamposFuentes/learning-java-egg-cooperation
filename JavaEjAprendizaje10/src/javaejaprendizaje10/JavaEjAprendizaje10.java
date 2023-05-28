/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package javaejaprendizaje10;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero límite: ");
        int num = lector.nextInt();
        
        sumaLimite(num, lector);
    }
    
    public static void sumaLimite(int numeroLimite, Scanner lector){
        
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero para sumar: ");
            int num = lector.nextInt();
            suma += num;
            
            
            System.out.println("Se agregó "+num+ " a la suma.");
            System.out.println("Suma parcial: "+ suma);
        
        } while (suma <= numeroLimite);
        
        System.out.println("Limite (" +numeroLimite+") superado.");
    }
}
