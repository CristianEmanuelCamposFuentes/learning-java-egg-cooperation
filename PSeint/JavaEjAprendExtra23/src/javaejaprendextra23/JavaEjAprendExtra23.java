/*
23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package javaejaprendextra23;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] palabras = new String[5];
        
        // Leer las palabras del usuario
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            palabras[i] = scanner.nextLine();
            
            // Validar longitud de la palabra
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese la palabra " + (i+1) + ": ");
                palabras[i] = scanner.nextLine();
            }
        }
        
        char[][] sopaLetras = crearSopaLetras(palabras);
        
        // Imprimir la sopa de letras
        System.out.println("Sopa de Letras:");
        for (char[] fila : sopaLetras) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    
    public static char[][] crearSopaLetras(String[] palabras) {
        char[][] sopaLetras = new char[20][20];
        
        // Rellenar la sopa de letras con números aleatorios
        for (char[] fila : sopaLetras) {
            for (int j = 0; j < fila.length; j++) {
                fila[j] = (char) (Math.random() * 10 + '0'); // Generar un número aleatorio del 0 al 9
            }
        }
        
        // Elegir una fila aleatoria para colocar las palabras
        int fila = (int) (Math.random() * 20);
        
        // Colocar las palabras en la fila seleccionada
        int columna = 0;
        for (String palabra : palabras) {
            while (columna + palabra.length() > sopaLetras[fila].length) {
                fila = (int) (Math.random() * 20); // Seleccionar una nueva fila si no hay suficiente espacio
                columna = 0;
            }
            for (int i = 0; i < palabra.length(); i++) {
                sopaLetras[fila][columna + i] = palabra.charAt(i);
            }
            fila = (int) (Math.random() * 20);
            columna += palabra.length() + 1; // Dejar un espacio entre palabras
        }
        
        return sopaLetras;
    }
}
