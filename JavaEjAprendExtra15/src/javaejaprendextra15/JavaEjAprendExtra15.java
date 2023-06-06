/*
15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package javaejaprendextra15;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        int opcion; int resultado = 0;
        boolean salir = false;
        
        System.out.println("====== PROCESO ======");
        System.out.println("Ingrese el primer numero: ");
        int numero1 = lector.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = lector.nextInt();
        
        
        
        do {        
            System.out.println("====== MENU ======");
            System.out.println("Elija la operacion: ");
            System.out.println("(1) Sumar.");
            System.out.println("(2) Restar.");
            System.out.println("(3) Dividir.");
            System.out.println("(4) Multiplicar.");
            System.out.println("(5) Salir.");
            
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    break;
                case 3:
                    resultado = dividir(numero1, numero2, lector);
                    break;
                case 4:
                    resultado = multiplicar(numero1, numero2);
                    break;
                case 5:
                    System.out.println("====== SALIENDO ======");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                
            }
            if (salir) {
                System.out.println("====== FIN DEL PROGRAMA ======");
            } else {
                System.out.println("====== PROCESADO ======");
                System.out.println("Resultado: " + resultado);                
            }
        } while (!salir);
        
    }
    
    public static int sumar(int num1, int num2){
        System.out.println("==== SUMA ====");
        return num1 + num2;
    }
    
    public static int restar(int num1, int num2){
        System.out.println("==== RESTA ====");
        return num1 - num2;
    }
    public static int dividir(int num1, int num2, Scanner lector){
        System.out.println("==== COCIENTE ====");
        if(num2 == 0){
            while(num2 == 0){
                System.out.println("Por favor, ingrese un numero distinto de cero: ");
                num2 = lector.nextInt();
            }  
        } 
        return num1 / num2;
    }
    public static int multiplicar(int num1, int num2){
        System.out.println("==== PRODUCTO ====");
        return num1 * num2;
    }
    
}
