/*
13. Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package javaejaprendextra13;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();
        
        escalera(numero);
    }
    
    public static void escalera(int numero) {
        System.out.println("====== PROCESO ======");
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                  System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
