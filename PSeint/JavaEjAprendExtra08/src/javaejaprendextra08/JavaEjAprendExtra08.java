/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaejaprendextra08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Lector
        Scanner lector = new Scanner(System.in);
        boolean detener = false;
        
        List<Integer> numeros = new ArrayList<>();
        int numero;
        do {            
            System.out.println("Ingrese su numero: ");
            numero = lector.nextInt();
            
            if(numero == 0){
                System.out.println("==== ERROR ====");
                System.out.println("El número 0 no es válido. Por favor, ingrese otro número.");
                System.out.println("==== ===== ====");
            }else if(numero % 5 == 0){
                detener = true;
            } else if (numero > 0) {                
              numeros.add(numero);  
            } else {
                System.out.println("==== ERROR ====");
                System.out.println("Por favor, solo ingrese numeros positivos.");
                System.out.println("==== ===== ====");
            }   
        } while (!detener);
        calcularParidades(numeros);
    }
    
    public static void calcularParidades(List<Integer> cantNumeros) {
        int numerosPares = 0;
        int numerosImpares = 0;
        
        for (int i = 0; i < cantNumeros.size(); i++) {
            int numeroActual = cantNumeros.get(i);
            if(numeroActual % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
        System.out.println("==== PROCESADO ====");
        System.out.println("Numeros leidos: "+ cantNumeros.size());
        System.out.println("Numeros pares: "+ numerosPares);
        System.out.println("Numeros impares: "+ numerosImpares);
        System.out.println("==== ========= ====");
    }
    
}
