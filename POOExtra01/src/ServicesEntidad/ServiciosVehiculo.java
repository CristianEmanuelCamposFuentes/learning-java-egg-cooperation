package ServicesEntidad;

import Entidad.Vehiculo;

import java.util.Scanner;

public class ServiciosVehiculo {
    public Vehiculo crearVehiculo(String nuevaMarca, int nuevoYear, String nuevoModelo, String nuevoTipo){
        /* SI QUIERO INGRESAR
        Scanner lector = new Scanner(System.in).useDelimiter("\n");*/

        // Validaciones
        if(nuevaMarca == null || nuevaMarca.isEmpty()){
            throw new IllegalArgumentException("La marca no puede ser nula o vacía.");
        }

        if(nuevoModelo == null || nuevoModelo.isEmpty()){
            throw new IllegalArgumentException("El modelo no puede ser nulo o vacío.");
        }

        if(nuevoYear < 1900 || nuevoYear > 2024 ){
            throw new IllegalArgumentException("El año no debe estar en un rango válido. ");
        }

        if(!nuevoTipo.equalsIgnoreCase("automovil") && !nuevoTipo.equalsIgnoreCase("motocicleta") && !nuevoTipo.equalsIgnoreCase("bicicleta")){
            throw new IllegalArgumentException("El tipo de vehículo ingresado no es válido");
        }

        return new Vehiculo(nuevaMarca,nuevoYear,nuevoModelo,nuevoTipo);
    }
}
