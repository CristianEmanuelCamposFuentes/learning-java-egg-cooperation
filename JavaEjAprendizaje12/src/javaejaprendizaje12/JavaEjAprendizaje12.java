/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package javaejaprendizaje12;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Lector
        Scanner lector = new Scanner(System.in);
        
        calcularCodigos(lector);
    }
    public static void calcularCodigos(Scanner lector) {
        // Acumuladores 
        int codigosCorrectos = 0;
        int codigosIncorrectos = 0;
        String codigo;
        boolean salir = false;
        
        do {            
            System.out.println("Ingrese el codigo, recuerde que debe: ");
            System.out.println("Comenzar con (X), acabar en (O) y tener 5 caracteres. ");
            System.out.println("Para salir, digite: (&&&&&) ");
             codigo = lector.next();
             
            if(codigo.equals("&&&&&") ){
                salir = true;
                break;
            }
            if(codigo.startsWith("X") && codigo.endsWith("O") && codigo.length() <= 5){
                codigosCorrectos++;
            } else {
                codigosIncorrectos++;
            }
        } while (!salir); 
        System.out.println("======== INFORME ========");
        System.out.println("Codigos correctos: " + codigosCorrectos);
        System.out.println("Codigos incorrectos: " + codigosIncorrectos);

    }       
        
        
}
