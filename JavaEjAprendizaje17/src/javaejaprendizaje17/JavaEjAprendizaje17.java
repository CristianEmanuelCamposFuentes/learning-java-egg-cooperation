/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaejaprendizaje17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendizaje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Lector
        Scanner lector = new Scanner(System.in);
        int min = 1, max = 99999;
        
        
        System.out.println("Ingrese la dimension: ");
        int dim = lector.nextInt();
        
        int[] vector = crearVectorAleatorio(dim, min, max );
        contabilizar(vector, dim);
    }
    
    
    public static int[] crearVectorAleatorio(int dimension, int minimo, int maximo ){
        Random random = new Random();
        int[] vector = new int[dimension];
        
        for (int i = 0; i < dimension; i++) {
            vector[i] = random.nextInt(maximo - minimo + 1)+ minimo;
        }
        
        System.out.println("=== === VECTOR === ===");
        for (int elemento : vector) {
            System.out.print("|" + elemento + "|");
        }
        System.out.println("");
        return vector;
    }
    
    public static void contabilizar(int[] vectorAnalizado, int dimension ){
        
        //int[] vector = new int[dimension];
        int unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        for (int i = 0; i < vectorAnalizado.length; i++) {
            int numeroActual = vectorAnalizado[i];
            int digitosNumeroActual = contarDigitos(numeroActual);
            switch(digitosNumeroActual){
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;    
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
                default: 
                    System.out.println("Cantidad incorrecta.");
            }
        }
        System.out.println("=== === RESULTADO === ===");
        System.out.println("Cantidad de numeros de 1 digito: " + unDigito);
        System.out.println("Cantidad de numeros de 2 digitos: " + dosDigitos);
        System.out.println("Cantidad de numeros de 3 digitos: " + tresDigitos);
        System.out.println("Cantidad de numeros de 4 digitos: " + cuatroDigitos);
        System.out.println("Cantidad de numeros de 5 digitos: " + cincoDigitos);
    }
    
    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
    
}
