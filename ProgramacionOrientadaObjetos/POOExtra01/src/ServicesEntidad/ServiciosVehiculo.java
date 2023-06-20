package ServicesEntidad;

import Entidad.Vehiculo;

import java.util.Scanner;

public class ServiciosVehiculo {
    public Vehiculo crearVehiculo(){
        Scanner lector = new Scanner(System.in).useDelimiter("\n");

        String nuevaMarca = ingresarMarca(lector);
        int nuevoYear = ingresarYear(lector);
        String nuevoModelo = ingresarModelo(lector);
        String nuevoTipo = ingresarTipo(lector);


        return new Vehiculo(nuevaMarca,nuevoYear,nuevoModelo,nuevoTipo);
    }

    private String ingresarTipo(Scanner lector) {
        System.out.println("Ingrese el tipo de vehículo (automovil, motocicleta, bicicleta):");
        String nuevoTipo = lector.nextLine();

        // Validaciones
        if(!nuevoTipo.equalsIgnoreCase("automovil") && !nuevoTipo.equalsIgnoreCase("motocicleta") && !nuevoTipo.equalsIgnoreCase("bicicleta")){
//            throw new IllegalArgumentException("El tipo de vehículo ingresado no es válido");
            System.out.println("El tipo de vehículo ingresado no es válido");
            return ingresarTipo(lector);
        }
        return nuevoTipo;
    }

    private String ingresarModelo(Scanner lector) {
        System.out.println("Ingrese el modelo del vehículo:");
        String nuevoModelo = lector.nextLine();

        if(nuevoModelo == null || nuevoModelo.isEmpty()){
//            throw new IllegalArgumentException("El modelo no puede ser nulo o vacío.");
            System.out.println("El modelo no puede ser nulo o vacío.");
            return ingresarModelo(lector);
        }
        return nuevoModelo;
    }

    private int ingresarYear(Scanner lector) {
        System.out.println("Ingrese el año del vehículo:");
        int nuevoYear = lector.nextInt();
        lector.nextLine(); // Limpiar el buffer del scanner
        // Validaciones
        if(nuevoYear < 1900 || nuevoYear > 2024 ){
//            throw new IllegalArgumentException("El año no debe estar en un rango válido. ");
            System.out.println("El año debe estar en un rango válido.");
            return ingresarYear(lector);
        }
        return nuevoYear;
    }

    private String ingresarMarca(Scanner lector) {
        System.out.println("Ingrese la marca del vehículo:");
        String nuevaMarca = lector.nextLine();

        // Validaciones
        if(nuevaMarca == null || nuevaMarca.isEmpty()){
        //            throw new IllegalArgumentException("La marca no puede ser nula o vacía.");
            System.out.println("La marca no puede ser nula o vacía.");
            return ingresarMarca(lector);
        }
        return nuevaMarca;
    }

    public int moverVehiculo(String tipoVehiculo, int cantidadSegundos){
        int cantidadMetros;
        switch (tipoVehiculo){
            case "automovil":
                cantidadMetros = cantidadSegundos * 3;
                break;
            case "motocicleta":
                cantidadMetros = cantidadSegundos * 2;
                break;
            case "bicicleta":
                cantidadMetros = cantidadSegundos;
                break;
            default:
                cantidadMetros = 0;
                break;
        }
        return cantidadMetros;
    }

    public int frenarVehiculo(String tipoVehiculo, int cantidadMetros){
        if(tipoVehiculo.equals("bicicleta")){
            return cantidadMetros;
        } else {
            cantidadMetros = cantidadMetros + 2;
        }
        return cantidadMetros;
    }
}

