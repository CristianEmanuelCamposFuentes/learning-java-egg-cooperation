package ServicesEntidad;

import Entidad.Vehiculo;

import java.util.Scanner;

public class ServiciosVehiculo {
    public Vehiculo crearVehiculo(String nuevaMarca, int nuevoYear, String nuevoModelo, String nuevoTipo){
        Scanner lector = new Scanner(System.in).useDelimiter("\n");


        return new Vehiculo(nuevaMarca,nuevoYear,nuevoModelo,nuevoTipo);
    }
}
