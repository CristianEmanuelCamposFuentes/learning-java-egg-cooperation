/*
 5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package javaejaprendextra05;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector
        Scanner lector = new Scanner(System.in);
        
        // Iniciar las variables para que las reconozca adentro del bucle do-while
        double importeAPagar;
        char categoria;
        double costoTratamiento;
        
        do {            
            System.out.println("Ingrese la categoria de afiliado: ");
            categoria = lector.next().toUpperCase().charAt(0);
            
            System.out.println("Ingrese el costo del tratamiento: ");
            costoTratamiento = lector.nextDouble();
            
            importeAPagar = calcularImporte(categoria, costoTratamiento);
            
        } while (importeAPagar == 0.0);
        
        System.out.println("==== PROCESADO ====");
        System.out.println("Socio de categoria: " + categoria + ".El importe en efectivo a pagar es: $" + importeAPagar);
    }
    
    public static double calcularImporte(char claseSocio, double costoTratamiento) {
        double importeAPagar;
        
        switch (claseSocio) {
            case 'A':
                importeAPagar = costoTratamiento * 0.5; // 50% de descuento
                break;
            case 'B':
                importeAPagar = costoTratamiento * 0.65; // 35% de descuento
                break;
            case 'C':
                importeAPagar = costoTratamiento; // sin descuento
                break;
            default:
                System.out.println("==== ERROR ====");
                System.out.println("Clase de socio inválida.");
                importeAPagar = 0.0;
                break;
        }
        
        return importeAPagar;
    }
}
