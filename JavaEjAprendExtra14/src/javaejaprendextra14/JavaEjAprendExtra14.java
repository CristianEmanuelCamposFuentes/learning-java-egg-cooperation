/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package javaejaprendextra14;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias: ");
        int numero = lector.nextInt();
        
        calcularEdades(numero, lector);
    }
    
    public static void calcularEdades(int cantidadFamilias, Scanner lector) {
        int totalHijos = 0;
        int sumaEdades = 0;
        
        System.out.println("====== PROCESO ======");
        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + i + ": ");
            int cantidadHijos = lector.nextInt();
            
            totalHijos += cantidadHijos;
            
            for (int j = 1; j <= cantidadHijos; j++) {
                System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = lector.nextInt();
                
                sumaEdades += edadHijo;
            }
        }
        
        double mediaEdad = (double) sumaEdades / totalHijos;
        
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
