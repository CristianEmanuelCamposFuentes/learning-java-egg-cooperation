/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package javaejaprendextra09;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        pedirNumeros(lector);
    }
    
    
    public static void pedirNumeros(Scanner lector) {
        int numero1; int numero2;; int residuo; int cantRestas = 0;
        do{
            System.out.println("Ingrese el primer numero: ");
            numero1 = lector.nextInt();
        }while (numero1 <= 0);
        
        do{
            System.out.println("Ingrese el segundo numero:");
            numero2 = lector.nextInt();
        }while (numero2 <= 0);
        
        System.out.println("==== PROCESO ====");
        residuo = numero1;
        
        
        while(residuo >=numero2){
            System.out.println(residuo + " - " + numero2 + " = " + (residuo-numero2) );
            residuo -= numero2;
            cantRestas++;
        }
        System.out.println("====RESULTADO ====");
        System.out.println(numero1 + " dividido entre " + numero2 + " es igual a "+ cantRestas + ", con residuo: " +residuo);
        
        
    }
}
