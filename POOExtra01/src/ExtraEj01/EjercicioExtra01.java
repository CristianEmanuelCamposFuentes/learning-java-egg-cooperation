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


    }
}