/*
EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package javaintroej14;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaIntroEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector 
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese su cantidad de jugadores en el equipo: ");
        int dim = lector.nextInt();
        String[] Equipo = new String[dim];
        
        String[] nombres = {"Cristian", "Emanuel", "Cintia", "Anahi"};
        
        for (int i = 0; i < Equipo.length; i++) {
            
            // Validacion por si la cantidad de jugadores es mayor a los anotados.
            
            if( i < nombres.length){
                Equipo[i] = nombres[i];
            } else {
            // Otra opcion viable es reemplazar esta linea por un continue, para no imprimir.
                Equipo[i] = "Sin nombre";
            }
        }
        System.out.println("Equipo completo: ");
        for(String jugador: Equipo){
            System.out.println("Jugador : " + jugador);
        }
    }
    
}
