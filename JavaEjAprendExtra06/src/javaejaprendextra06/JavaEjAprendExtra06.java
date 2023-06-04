/*
 6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaejaprendextra06;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        int cantidadPersonas;
        
        do {            
            System.out.println("Ingrese la cantidad de personas: ");
            cantidadPersonas = lector.nextInt();
        } while (cantidadPersonas < 1);
        calcularAlturas(cantidadPersonas,lector);
        
    }
    
    public static void calcularAlturas(int cantidadPersonas, Scanner lector) {
        double promedioGeneral = 0;
        double promedioMetroSesenta = 0;
        int cantidadPersonasFiltradas = 0;
        double altura;
        
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese altura de la persona: ");
            String alturaCadena = lector.next();
            altura = Double.parseDouble(alturaCadena);
            
            promedioGeneral += altura;
            
            if( altura < 1.60) {
                promedioMetroSesenta += altura;
                cantidadPersonasFiltradas++;
            }
            
        }
        System.out.println("==== PROCESADO ====");
        if (cantidadPersonasFiltradas != 0){
            System.out.println("El promedio de altura de las " + cantidadPersonasFiltradas + " personas mas bajas de 1.60 es: " + promedioMetroSesenta / cantidadPersonasFiltradas + " metros.");
        } else {
            System.out.println("No hay personas con altura menor a 1.60 metros.");
        }
        
        System.out.println("El promedio de altura general es : " + promedioGeneral / cantidadPersonas + " metros.");
    }
    
}
