/*
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaintroej13;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector 
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese su cantidad de jugadores en el equipo: ");
        int dim = lector.nextInt();
        String[] Equipo = new String[dim];
    }
    
}
