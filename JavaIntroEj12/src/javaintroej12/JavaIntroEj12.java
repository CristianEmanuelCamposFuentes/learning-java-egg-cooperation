/*
 EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package javaintroej12;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num1 = lector.nextInt();
        
        System.out.println("Ingrese un numero: ");
        int num2 = lector.nextInt();
        
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int numero1, int numero2) {
        if(numero1 % numero2 == 0){
            System.out.println("El primer numero ("+ numero1 +") es multiplo del segundo ("+ numero2 +").");
        } else {
            System.out.println("El primer numero ("+ numero1 +") NO es multiplo del segundo ("+ numero2 +").");    
        }
    }
}
