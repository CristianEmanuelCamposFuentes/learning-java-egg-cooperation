/*
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package javaejaprenextra10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprenExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        int numeroIngresado;
        int numeroAleatorio = generarAleatorio();
        
        System.out.println("=== INICIO DEL JUEGO ===");
        do {            
            System.out.println("Ingrese el numero! :");
            numeroIngresado = lector.nextInt();
            
            if(numeroIngresado == numeroAleatorio){
                System.out.println(" ==============");
                System.out.println("FELICIDADES ! Acertaste!!");
                System.out.println(" ==============");
            } else {
                System.out.println(" ==============");
                System.out.println("El numero es incorrecto. Segui participando !");
                System.out.println(" ==============");
            }
            
        } while (numeroAleatorio != numeroIngresado);
        
    }
    
    public static int generarAleatorio() {
        //int max = 10; int min = 1; 
        // Random
        Random random = new Random();
        
        //int numero1 = random.nextInt(max - min + 1) + min;
        //int numero2 = random.nextInt(max - min + 1) + min;
        int numero1 = random.nextInt(11);
        int numero2 = random.nextInt(11);       
                
                
        int numero = numero1 * numero2;
        System.out.println("Numero :" + numero);
       return numero;
    }
}
