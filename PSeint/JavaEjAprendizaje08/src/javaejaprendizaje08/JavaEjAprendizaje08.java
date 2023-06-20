/*
 8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package javaejaprendizaje08;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = lector.next();
        tieneOchoDigitos(frase);
    }
    
    public static void tieneOchoDigitos(String frase){
        if(frase.length() == 8){
            System.out.println("Correcto.".toUpperCase());
        } else {
            System.out.println("Incorrecto.".toUpperCase());
        }
    
    }
    
}
