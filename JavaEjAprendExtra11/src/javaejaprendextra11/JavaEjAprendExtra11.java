/*
11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package javaejaprendextra11;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el numero: ");
        int numero = lector.nextInt();

        contarDigitos(numero);
    }
    
    
    
    public static void contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("=== === RESULTADO === ===");
        System.out.println("Tu numero posee "+ contador + " digitos.");
    }
}
