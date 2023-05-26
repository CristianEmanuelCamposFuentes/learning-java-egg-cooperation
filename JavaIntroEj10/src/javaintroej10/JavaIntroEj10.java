/*
 EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaintroej10;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        int[] numeros = new int[4]; // Arreglo para almacenar los 4 numeros
           
        
        for(int i = 0; i < 4; i++){
            int num;
            
            do {
                System.out.println("Ingrese su numero, entre 1 y 20: ");
                num = lector.nextInt();
            
                // Validacion si es erroneo
                if(num< 1 || num >20){
                    System.out.println("Valor invalido, ingrese un valor entre 1 y 20.");
                } 
            } while(num < 1 || num > 20); 
                
            numeros[i] = num;
        }
        
        System.out.println("==================================");
        System.out.println("Usted ingresó: ");
        
        // Otro ciclo for para imprimir los resultados
        for(int i = 0; i< 4; i++){
            int num = numeros[i]; // Obtener cada valor
            System.out.print(num + ": ");
            for(int j= 0; j < num; j++){
                System.out.print("*");
                }
            System.out.println("");
            } 
        }  
}
