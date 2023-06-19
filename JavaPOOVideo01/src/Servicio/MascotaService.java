package Servicio;

import Entidad.Perro;

import java.util.Scanner;

public class MascotaService {

    public Perro crearMascota(){
        // Scanner
        Scanner leer = new Scanner(System.in);


        // Instanciamos un objeto persona con sus atributos vacios
        Perro perroCompleta = new Perro();

        // Pedimos al usuario que ingrese la informacion
        // que se alojara en el atributo por consola
        System.out.println("Ingrese el nombre del perro: ");

        // Utilizamos el objeto para invocar el metodo SET
        // Y con el Scanner recibimos la informacion
        perroCompleta.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        perroCompleta.setEdad(leer.nextInt());

        System.out.println("Ingrese la raza de la persona: ");
        perroCompleta.setRaza(leer.next());

        return perroCompleta;
    }

    @Override
    public String toString() {
        return "Mascota: " + "Nombre: "+ crearMascota().getNombre() + "Edad del: " + crearMascota().getEdad() + "Raza:" + crearMascota().getRaza();
    }
}
