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
        perroCompleta.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del perro: ");
        perroCompleta.setEdad(leer.nextInt());

        leer.nextLine(); // Consumir el carácter de nueva línea, Limpiar el bufer de la memoria

        System.out.println("Ingrese la raza del perro: ");
        perroCompleta.setRaza(leer.nextLine());

        return perroCompleta;
    }

    @Override
    public String toString() {
        return "Mascota: " + "Nombre: "+ crearMascota().getNombre() + "Edad del: " + crearMascota().getEdad() + "Raza:" + crearMascota().getRaza();
    }
}
