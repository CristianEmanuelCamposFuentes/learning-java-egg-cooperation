/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaejaprendextra01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese su cantidad de minutos: ");
        int minutos = lector.nextInt();
        
        calcularMinutos(minutos);
    }
    
    public static void calcularMinutos(int minutosIngresados) {
        
        int minutosEnUnDia = 24 * 60;
        
        int dias = minutosIngresados / minutosEnUnDia;
        int horas = (minutosIngresados % minutosEnUnDia) / 60;
        
        System.out.println("==== RESULTADO ====");
        System.out.println(minutosIngresados + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s).");
        
    }
    
    /*
    Solucion alternativa utilizando restas sucesivas
    public static void calcularMinutos(int minutosIngresados) {
        int minutos = minutosIngresados;
        int minutosEnUnDia = 24 * 60;
    
        int dias = 0;
        
    while(minutos >= minutosEnUnDia){
        
        minutos -= minutosEnUnDia;
        dias++;
    
    }
        int horas = minutos / 60;
    
    
        System.out.println("==== RESULTADO ====");
        System.out.println(minutosIngresados + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s).");
        
    }
    */
}
