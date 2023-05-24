/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según”
 */
package javaintroej11;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // TODO code application logic here
        String frase;
        do {
            System.out.println("Ingrese la frase a codificar terminada en (.)");
            frase = leer.nextLine();

        } while (!frase.substring(frase.length() - 1).equals("."));

        String nuevaFrase = CodificarFrase(frase.toLowerCase());
        System.out.println("La nueva frase es " + nuevaFrase);
    }

    public static String CodificarFrase(String frase) {
        String aux = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals("a") || frase.substring(i, i + 1).equals("e") || frase.substring(i, i + 1).equals("i")
                    || frase.substring(i, i + 1).equals("o") || frase.substring(i, i+1).equals("u")) {

                switch (frase.substring(i, i + 1)) {
                    case "a":
                        aux += "@";
                        break;
                    case "e":
                        aux += "#";
                        break;
                    case "i":
                        aux += "$";
                        break;
                    case "o":
                        aux += "%";
                        break;
                    case "u":
                        aux += "*";
                        break;
                    default:
                        break;

                }
            }   else{
            	aux += frase.substring(i, i + 1);
            }       
        }
    return aux;
    }
}