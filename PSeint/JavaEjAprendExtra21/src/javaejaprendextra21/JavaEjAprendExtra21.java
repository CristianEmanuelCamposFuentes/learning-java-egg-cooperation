/*
21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package javaejaprendextra21;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        double[] notas = new double[10]; // Arreglo para almacenar las notas de los 10 alumnos
        int aprobados = 0;
        int desaprobados = 0;
        
        cargarNotas(notas);
        
        for (int i = 0; i < notas.length; i++) {
            double promedio = calcularPromedio(notas, i);
            
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
    
    public static void cargarNotas(double[] notas) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            double tp1 = scanner.nextDouble();
            double tp2 = scanner.nextDouble();
            double integrador1 = scanner.nextDouble();
            double integrador2 = scanner.nextDouble();
            
            double promedio = (tp1 * 0.1) + (tp2 * 0.15) + (integrador1 * 0.25) + (integrador2 * 0.5);
            notas[i] = promedio;
        }
    }
    
    public static double calcularPromedio(double[] notas, int indice) {
        return notas[indice];
    }

}
