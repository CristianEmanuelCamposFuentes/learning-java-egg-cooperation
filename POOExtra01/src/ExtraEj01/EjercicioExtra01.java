package ExtraEj01;

import Entidad.Vehiculo;
import ServicesEntidad.ServiciosVehiculo;

public class EjercicioExtra01 {
//    Ejercicio 1
//    Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
//    automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:

//    Moverse: Es la cantidad de metros que avanzará por segundo.
//    Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
//    más metros.
//
//    Referencias:
//    Un automóvil avanza 3 metros por segundo.
//    Una motocicleta avanza 2 metros por segundo.
//    Una bicicleta avanza 1 metro por segundo.
//
//    Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
//    pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
//    vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
//    avanzó.
//
    public static void main(String[] args) {
        // Crear instancia para poder utilizar la Clase ServiciosVechiculo y sus metodos
        ServiciosVehiculo SV = new ServiciosVehiculo();

        Vehiculo vehiculo1 = SV.crearVehiculo();
        System.out.println("Vehiculo creado: \n" + vehiculo1.toString());

        Vehiculo vehiculo2 = SV.crearVehiculo();
        System.out.println("Vehiculo creado: \n" + vehiculo2.toString());

        Vehiculo vehiculo3 = SV.crearVehiculo();
        System.out.println("Vehiculo creado: \n" + vehiculo3.toString());

        System.out.println("\n Vehículos creados: \n" + vehiculo1.toString() + "\n" + vehiculo2.toString() + "\n" + vehiculo3.toString()+ "\n");

        // ** PRIMERA PARTE DEL EJERCICIO
        // Ingresar diferentes tiempos para las pruebas
        int tiempo5Segundos = 5;
        int tiempo10Segundos = 10;
        int tiempo1Minutos = 60;

        //Avance de los vehiculos despues de 5 segundos
        int avanceVehiculo1_5Segundos = SV.moverVehiculo(vehiculo1.getTipo(), tiempo5Segundos);
        System.out.println("Avance del vehiculo 1 despues de 5 segundos: " + avanceVehiculo1_5Segundos + " metros.");

        int avanceVehiculo2_5Segundos = SV.moverVehiculo(vehiculo2.getTipo(), tiempo5Segundos);
        System.out.println("Avance del vehiculo 2 despues de 5 segundos: " + avanceVehiculo2_5Segundos + " metros.");

        int avanceVehiculo3_5Segundos = SV.moverVehiculo(vehiculo3.getTipo(), tiempo5Segundos);
        System.out.println("Avance del vehiculo 3 despues de 5 segundos: " + avanceVehiculo3_5Segundos + " metros."+ "\n");

        // Avance de los vehiculos despues de 10 segundos
        int avanceVehiculo1_10Segundos = SV.moverVehiculo(vehiculo1.getTipo(), tiempo10Segundos);
        System.out.println("Avance del vehiculo 1 despues de 10 segundos: " + avanceVehiculo1_10Segundos + " metros.");

        int avanceVehiculo2_10Segundos = SV.moverVehiculo(vehiculo2.getTipo(), tiempo10Segundos);
        System.out.println("Avance del vehiculo 2 despues de 10 segundos: " + avanceVehiculo2_10Segundos + " metros.");

        int avanceVehiculo3_10Segundos = SV.moverVehiculo(vehiculo3.getTipo(), tiempo10Segundos);
        System.out.println("Avance del vehiculo 3 despues de 10 segundos: " + avanceVehiculo3_10Segundos + " metros."+ "\n");

        // Avance de los vehiculos despues de 1 minuto
        int avanceVehiculo1_1Minutos = SV.moverVehiculo(vehiculo1.getTipo(), tiempo1Minutos);
        System.out.println("Avance del vehiculo 1 despues de 1 minuto: " + avanceVehiculo1_1Minutos + " metros.");

        int avanceVehiculo2_1Minutos = SV.moverVehiculo(vehiculo2.getTipo(), tiempo1Minutos);
        System.out.println("Avance del vehiculo 2 despues de 1 minuto: " + avanceVehiculo2_1Minutos + " metros.");

        int avanceVehiculo3_1Minutos = SV.moverVehiculo(vehiculo3.getTipo(), tiempo1Minutos);
        System.out.println("Avance del vehiculo 3 despues de 1 minuto: " + avanceVehiculo3_1Minutos + " metros."+ "\n");


        // ** SEGUNDA PARTE
        // Ingreso de los 5 minutos del avance antes de frenar
        int tiempo5Minutos = 300;

        //Avance y frenado de los vehiculos despues de 5 minutos
        int [] avanceFrenadoVehiculos = new int[3];

        for (int i = 0; i < 3; i++){
            Vehiculo vehiculo = null;

            switch (i){
                case 0:
                    vehiculo = vehiculo1;
                    break;
                case 1:
                    vehiculo = vehiculo2;
                    break;
                case 2:
                    vehiculo = vehiculo3;
                    break;
            }

            int avanceVehiculo = SV.moverVehiculo(vehiculo.getTipo(), tiempo5Minutos);
            avanceFrenadoVehiculos[i] = SV.frenarVehiculo(vehiculo.getTipo(), avanceVehiculo);
        }
    // Mostrar el avance del vehiculo despues de frenar a los 5 minutos
        System.out.println("Avance despues de recorrer 5 minutos y frenar: ");
        for (int i = 0; i < 3; i++){
            String vehiculoNombre = "Vehiculo " + (i + 1);
            System.out.println(vehiculoNombre + ": " + avanceFrenadoVehiculos[i] + " metros.");
        }
    }
}