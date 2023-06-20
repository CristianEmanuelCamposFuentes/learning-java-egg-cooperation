/*
 EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package javaintroej06;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su primer numero : ");
        int numero1 = lector.nextInt();
        
        System.out.println("Ingrese su segundo numero : ");
        int numero2 = lector.nextInt();
        
        if(numero1 > 25 && numero2 > 25 ){
            System.out.println("Ambos numeros: (" +numero1+") y (" + numero2 + ") son mayores a 25.");
            
        } else if(numero1 > 25 && !(numero2 > 25)){
            System.out.println("El primer numero (" +numero1+"), es mayor a 25.");
            
        }else if(numero2 > 25 && !(numero1 > 25)){
            System.out.println("El sugundo numero (" + numero2 + "),  es mayor a 25.");
        } else {
            System.out.println("Ambos numeros: (" +numero1+") y (" + numero2 + ")  son menores a 25.");
        }    
    }
    
}
