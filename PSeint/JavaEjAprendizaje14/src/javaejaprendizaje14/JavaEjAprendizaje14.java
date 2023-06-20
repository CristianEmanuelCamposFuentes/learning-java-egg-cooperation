/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaejaprendizaje14;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        
        System.out.println("Ingrese su cantidad de euros: ");
        int euros = lector.nextInt();
        
        System.out.println("Ingrese su moneda de cambio : 'DOLAR' , 'LIBRA' o 'YEN'  ");
        String moneda = lector.next();
        
        conversorMoneda(euros, moneda);
    }
    
    public static void conversorMoneda(int cantEuros, String monedaAConvertir) {
        //double total;
        switch(monedaAConvertir.toUpperCase()){
            case "DOLAR":
                System.out.println("En dolares: "+  cantEuros * 1.28611);
                break;
            case "LIBRA":
                System.out.println("En dolares: "+  cantEuros * 0.86);
                break;
            case "YEN":
                System.out.println("En dolares: "+  cantEuros * 129.852);
                break;
            default:
                System.out.println("Moneda incorrecta.");
                break;     
        }
    }
}
