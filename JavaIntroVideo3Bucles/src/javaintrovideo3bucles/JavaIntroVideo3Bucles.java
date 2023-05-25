/*
 VIDEO 3: BUCLES Y SENTENCIAS DE SALTO
Muestre N sumatorias de los primeros numeros enteros partiendo desde 1, siendo 
N par, de un aviso si el usuario identifica un valor de N superior a 1000 por
ejecucion lenta.
 */
package javaintrovideo3bucles;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroVideo3Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner lector = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un numero entero positivo: ");
            num = lector.nextInt();
            if(num > 1000){
                System.out.println("Este programa podria tardar, esta seguro? (s/n)");
                String confirma = lector.next();
                if (confirma.equals("s")){
                    break;             
                }
            }
            
        } while (num <= 0 || num > 1000);
        
        int j, suma;
        for (int i = 1; i <= num ; i++) {
            if(i % 2 != 0) 
                continue; // Si el valor es impar, continua al siguiente valor
            
            suma = 0;
            j=1;
            while(j<= i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " numeros naturales es: "+ suma);
        }
    }
}
