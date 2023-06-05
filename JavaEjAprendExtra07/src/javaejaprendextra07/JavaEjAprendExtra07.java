/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package javaejaprendextra07;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        int numeros = 0;
        
        while (numeros<1) {            
            System.out.println("Ingrese la cantidad de numeros a promediar: ");
            numeros = lector.nextInt();
        }
        calcularPromedio(lector, numeros);
    }
    
    public static void calcularPromedio(Scanner lector, int cantNumeros) {
        int totalNumeros = 0;
        int sumaTotal = 0;

        int numMaximo = Integer.MIN_VALUE;
        int numMinimo = Integer.MAX_VALUE;
        
        while (totalNumeros < cantNumeros) {            
            System.out.println("Ingrese el numero a promediar: ");
            int numeroActual = lector.nextInt();
            
            if(numeroActual > 0){
                sumaTotal += numeroActual;
                totalNumeros++;
            
                if (numeroActual > numMaximo) {
                    numMaximo = numeroActual;
                }
            
                if (numMinimo > numeroActual) {
                    numMinimo = numeroActual;
                
                }
            } else {
                System.out.println("Numero rechazado. Por favor, ingrese numeros positivos.");
            }
        }
        System.out.println("==== PROCESADO ====");
        
        // Resultados
        double promedio = (double) sumaTotal / totalNumeros;
        
        System.out.println("El valor minimo es: " + numMinimo);
        System.out.println("El valor maximo es: " + numMaximo);

        System.out.println("El promedio de los "+totalNumeros+" numeros es de: " + promedio);
    }
}
