/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej03;

/**
 *
 * @author crist
 */
public class JavaIntroEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreAlumno = "Cristian", nombreAlumno2 = "Emanuel";
        int edadAlumno = 30, edadAlumno2 = 25;
        double altura = 1.74, altura2 = 1.73;
        boolean estaAprendiendo = true, noEstaAprendiendo = false;
        char inicialFavorita = 'T', inicialFavorita2 = 'K';
        short sueldoActual = 3000, sueldoActual2 = 2700;
        int horaActual = 20;
        
        int suma = edadAlumno + edadAlumno2;
        System.out.println("La suma de las edades es: ");
        System.out.println(suma);
        System.out.println(edadAlumno + edadAlumno2);
        
        System.out.println("------------------------");
        
        boolean esMayor = edadAlumno < edadAlumno;
        System.out.println("El alumno es mayor si es verdadero: ");
        System.out.println(esMayor);
        
        System.out.println("------------------------");
        
        boolean esDistinto = edadAlumno != edadAlumno2;
        System.out.println("Tienen distintas edades? ");
        System.out.println(esDistinto);
        System.out.println("------------------------");
        System.out.println("La hora actual es:" + horaActual);
        horaActual++;
        System.out.println("La hora actual es:" + horaActual);
        horaActual++;
        System.out.println("La hora actual es:" + horaActual);
        
    }
    
}
