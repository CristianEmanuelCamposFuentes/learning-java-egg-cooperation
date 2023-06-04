/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,

49
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaejaprendextra02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class JavaEjAprendExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==== COMIENZO DEL PROGRAMA ====");// TODO code application logic here
        List<Integer> variables = new ArrayList<>();
        
        variables.add(2);
        variables.add(4);
        variables.add(6);
        variables.add(8);
        
        calculoVariables(variables);
    }
    
    public static void calculoVariables(List<Integer> variables) {
        System.out.println("==== VARIABLES ====");// TODO code application logic here
        
        int variableA = variables.get(0);
        int variableB = variables.get(1);
        int variableC = variables.get(2);
        int variableD = variables.get(3);
        int auxiliar;
        
        System.out.println("Variable A: " + variableA);
        System.out.println("Variable B: " + variableB);
        System.out.println("Variable C: " + variableC);
        System.out.println("Variable D: " + variableD);
        
        int[] ArrayVariables = {variableA,variableB,variableC,variableD};
        cambiosVariables(ArrayVariables);
    }
    
    public static void cambiosVariables(int[] variables) {
        System.out.println("==== ====== ====");
        
        int variableA = variables[0];
        int variableB = variables[1];
        int variableC = variables[2];
        int variableD = variables[3];
        int auxiliar;
        
        // REEMPLAZOS
        auxiliar = variableB;
        variableB = variableC;
        variableC = variableA;
        variableA = variableD;
        variableD = auxiliar;
        
        System.out.println("==== PROCESADO ====");
        System.out.println("Variable A: " + variableA);
        System.out.println("Variable B: " + variableB);
        System.out.println("Variable C: " + variableC);
        System.out.println("Variable D: " + variableD);
        
        
        
    }
}
