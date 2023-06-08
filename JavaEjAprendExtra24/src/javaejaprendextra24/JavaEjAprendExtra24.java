/*
24. Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
 */
package javaejaprendextra24;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
       
        
        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();
        
        // Lista 
        ArrayList<Integer> secuenciaFibonacci = fibonacci(numero);
        
        System.out.println("Sucesion de Fibonacci hasta " + numero + ": ");
        // Para mostrar se necesita recorrer
        secuenciaFibonacci.forEach((elementoLista) -> {
            System.out.print(elementoLista + " ");
        });
        System.out.println(" ");
        System.out.println("======== CERRANDO PROGRAMA ==========");
    }
    
    public static ArrayList<Integer> fibonacci( int numero){
        
        // Se crea la instancia de la lista para despues almacenarla en la variable del mismo tipo
        ArrayList<Integer> listaFibonacci = new ArrayList<>();
        
        if(numero<= 0){
            return listaFibonacci;
        }
        
        listaFibonacci.add(1);
        
        if(numero == 1){
            return listaFibonacci;
        }
        
        listaFibonacci.add(1);
        
        for (int i = 2; i < numero; i++) {
            int numeroSiguiente = listaFibonacci.get(i-1) + listaFibonacci.get(i - 2);
            listaFibonacci.add(numeroSiguiente);
        }
        return listaFibonacci;
    }
}
