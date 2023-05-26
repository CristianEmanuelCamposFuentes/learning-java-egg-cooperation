/*
 EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package javaintroej09;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma = 0, contador = 0;
        Scanner lector = new Scanner(System.in);
        
        do {
            if(contador == 20){
                System.out.println("Se excedio el limite de numeros ingresados.");
                System.out.println("La suma de los numeros ingresados es: " + suma);
                break;
            }
            
            System.out.println("Ingrese un numero: ");
            num = lector.nextInt();
            
            if(num < 0){
                System.out.println("Por favor, solo ingrese numeros positivos.");
                continue;
            }
            
            if(num == 0){
                System.out.println("Se capturo el numero cero.");
                System.out.println("La suma de todos los numeros positivos ingresados es : " + suma);
                break;
            }
            suma += num;
            contador++;
            
        } while (num != 0);
        
    }
    
}
