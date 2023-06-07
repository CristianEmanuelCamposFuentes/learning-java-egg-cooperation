/*
16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaejaprendextra16;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas: ");
        int numero = lector.nextInt();
        
        calcularEdades(numero, lector);
    }
    
    public static void calcularEdades(int cantidadPersonas, Scanner lector){
        boolean salir = false;
        System.out.println("====== PROCESO ======");
                    
            for (int i = 1; i <= cantidadPersonas; i++) {
                System.out.println("Ingrese el nombre de la persona " + i + ": ");
                String nombre = lector.next();
                
                int edad;
                do {
                    System.out.println("Ingrese la edad : ");
                    edad = lector.nextInt();                    
                } while (edad < 0);
                
                if (edad >= 18) {
                    System.out.println(nombre + " es mayor de edad.");
                    
                } else {
                    System.out.println(nombre + " es menor de edad.");
                }
                if( i != cantidadPersonas){
                    salir = preguntar(lector);
                if (salir) {
                    break;
                }    
            }
        }  
    }
    
    /**
     *
     * @param lector
     * @return
     */
    public static boolean preguntar(Scanner lector){
        System.out.println("Desea continuar? (Si) - (No)");
        String respuesta = lector.next();
        
        if(respuesta.equalsIgnoreCase("Si")){
            return false;
        } else if (respuesta.equalsIgnoreCase("No")){
            return true;
        } else {
            System.out.println("Opcion incorrecta. Ingrese (Si) o (No).");
            return preguntar(lector);
        }
    }
}
