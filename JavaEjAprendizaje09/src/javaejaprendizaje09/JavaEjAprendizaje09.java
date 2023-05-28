/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package javaejaprendizaje09;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra: ");
        String frase = lector.nextLine();
        
        empiezaA(frase);
    }
    
    public static void empiezaA(String fraseEvaluada){
        
        // if(fraseEvaluada.charAt(0) == 'A'){
        if(fraseEvaluada.substring(0, 1).equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
    
}
