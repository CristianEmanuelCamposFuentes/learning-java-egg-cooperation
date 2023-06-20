/*
 20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaejaprendizaje20;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector 
        Scanner lector = new Scanner(System.in);

        int[][] matriz = crearMatriz(lector);
        mostrarMatriz(matriz);
        
        boolean esMagico = verificarCuboMagico(matriz);
        System.out.println("====== RESULTADO ======");
        if (esMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    public static int[][] crearMatriz(Scanner lector) {
        int[][] matriz = new int[3][3];

        System.out.println("Ingresar los valores: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean numeroRepetido;
                do {
                    numeroRepetido = false;
                    System.out.println("Valor para el numero [" + (i + 1) + "][" + (j + 1) + "]: ");
                    int num = lector.nextInt();

                    if (num < 1 || num > 9) {
                        // Validacion que este entre 1 y 9
                        System.out.println("Error: Ingrese un valor entre 1 y 9. Ingrese nuevamente.");
                        numeroRepetido = true; // Asi se repite el nuevamente la iteracion
                    } else {
                        // Validacion si se repite
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                if (matriz[k][l] == num) {
                                    System.out.println("Error: El numero ya existe en la matriz, ingrese otro por favor.");
                                    numeroRepetido = true;
                                    break;
                                }
                            }
                            if (numeroRepetido) {
                                break;
                            }
                        }

                    }

                    if (!numeroRepetido) {
                        matriz[i][j] = num;
                    }

                } while (numeroRepetido);
            }

        }
        return matriz;
    }    
        
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("====== SU MATRIZ ======");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print("|" + elemento + "|");
            }
            System.out.println("");
                    
        }
    }

    public static boolean verificarCuboMagico(int[][] matriz) {
        int sumaTotal = sumaFila(matriz, 0);
        
        // Verificar cada fila si su suma es igual a la suma Total
        
        for (int i = 0; i < 3; i++) {
            if(sumaFila(matriz, i) != sumaTotal) {
                return false;
            }
        }
        
        // Verificar cada columna si su suma es igual a la suma Total
        for (int i = 0; i < 3; i++) {
            if(sumaColumna(matriz, i) != sumaTotal) {
                return false;
            }
        }
        
        // Verificar cada una de las diagonales
        int sumaDiagonal1 = sumaDiag1(matriz);
        int sumaDiagonal2 = sumaDiag2(matriz);
        
        if(sumaDiagonal1 != sumaTotal ||sumaDiagonal2 != sumaTotal ){
            return false;
        }
        
        // Si todo esta Ok, entonces es magico
        return true;
    }
    
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        System.out.println("==============================");
        System.out.println("Suma de cada fila:");

        for (int i = 0; i < 3; i++) {
            suma += matriz[fila][i];
            System.out.println("Fila " + (i + 1) + ": " + suma);
        }

        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        System.out.println("==============================");
        System.out.println("Suma de cada columna:");
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][columna];
            System.out.println("Columna " + (i + 1) + ": " + suma);
        }

        return suma;
    }

    public static int sumaDiag1(int[][] matriz) {
        int suma = 0;
        System.out.println("==============================");
        System.out.println("Suma de cada diagonal:");
        

        for (int i = 0; i < 3; i++) {
            suma += matriz[i][i];
            System.out.println("Diagonal 1: " + suma);
        }

        return suma;
    }

    public static int sumaDiag2(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += matriz[i][2 - i];
            System.out.println("Diagonal 2: " + suma);
        }

        return suma;
    }
    
}
