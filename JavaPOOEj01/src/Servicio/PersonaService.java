package Servicio;

import Entidad.Persona;

import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona(){
        // Scanner
        Scanner leer = new Scanner(System.in);


        // Instanciamos un objeto persona con sus atributos vacios
        Persona personaCompleta = new Persona();

        // Pedimos al usuario que ingrese la informacion
        // que se alojara en el atributo por consola
        System.out.println("Ingrese el nombre de la persona: ");

        // Utilizamos el objeto para invocar el metodo SET
        // Y con el Scanner recibimos la informacion
        personaCompleta.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona: ");
        personaCompleta.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        personaCompleta.setEdad(leer.nextInt());



        return personaCompleta;
    }
}
