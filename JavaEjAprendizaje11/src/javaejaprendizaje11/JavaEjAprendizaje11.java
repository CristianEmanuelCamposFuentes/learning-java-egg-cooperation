/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaejaprendizaje11;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = lector.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = lector.nextInt();
        
        mostrarMenu(num1, num2, lector);
    }
    
    public static void mostrarMenu(int primerNumero, int segundoNumero, Scanner lector){
        boolean salir = false;
        
        do{
            
            // Imprimir Menu en pantalla
            System.out.println("======== == MENU == ========");
            System.out.println("1: Sumar.");
            System.out.println("2: Restar.");
            System.out.println("3: Multiplicar.");
            System.out.println("4: Dividir.");
            System.out.println("5: Salir.");
            System.out.println("Elija opcion:");

            int opcion = lector.nextInt();

            switch (opcion) {
                case 1: 
                    sumar(primerNumero,segundoNumero);
                     break;
                case 2: 
                    restar(primerNumero,segundoNumero);
                     break;
                case 3: 
                    producto(primerNumero,segundoNumero);
                     break;
                case 4: 
                    cociente(primerNumero,segundoNumero);
                     break;
                case 5: 
                    salir = comprobar(lector);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    
            }
        } while( !salir);
        
        
    }
    public static void sumar(int primerNumero, int segundoNumero){
        int total = primerNumero + segundoNumero;
        System.out.println("======== ==== ========");
        System.out.println("La suma de sus numeros es: " + total);
        System.out.println("======== ==== ========");
    }
    public static void restar(int primerNumero, int segundoNumero){
        int total = primerNumero - segundoNumero;
        System.out.println("======== ==== ========");
        System.out.println("La resta de sus numeros es: " + total);
        System.out.println("======== ==== ========");
    }
    public static void producto(int primerNumero, int segundoNumero){
        int total = primerNumero * segundoNumero;
        System.out.println("======== ==== ========");
        System.out.println("La multiplicacion de sus numeros es: " + total);
        System.out.println("======== ==== ========");
    }
    // Validacion para las divisiones sobre cero
    public static void cociente(int primerNumero, int segundoNumero){
        if(segundoNumero != 0){
            double total = (double) primerNumero / segundoNumero;
            String resultado = String.format("%.2f", total);
            System.out.println("======== ==== ========");
            System.out.println("La division de sus numeros es: " + resultado);
            System.out.println("======== ==== ========");
        } else {
            System.out.println("======== ==== ========");
            System.out.println("Error: No se puede dividir por cero.");
            System.out.println("======== ==== ========");
        }
        
    }
    
    public static boolean comprobar(Scanner lector){
        System.out.println("======== ==== ========");
        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
        String salirOpcion = lector.next();
        if(salirOpcion.equalsIgnoreCase("S")){
            System.out.println("======== CERRANDO PROGRAMA ========");
            return true;
        } else if (salirOpcion.equalsIgnoreCase("N")){
            System.out.println("======== VOLVIENDO AL MENU ========");
            return false;
        } else {
            System.out.println("======== ==== ========");
            System.out.println("Ingrese una opcion correcta. 'S' para salir y 'N' para continuar.");
            return comprobar(lector);
        }
    }
    
}
