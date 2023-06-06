/*
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package javaejaprendextra12;


/**
 *
 * @author crist
 */
public class JavaEjAprendExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====== CONTADOR ======");
        // Tres bucles para los 3 valores posibles.
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    // String.valueOf para pasar int a String.
                    String contador = String.valueOf(i) + "-" + String.valueOf(j) + "-" + String.valueOf(k);
                    // .replace(valorbuscado, valorNuevo)
                    contador = contador.replace("3", "E");
                    System.out.println(contador);
                }
            }
        }
        System.out.println("====== FIN DEL CONTADOR ======");
    }

}
