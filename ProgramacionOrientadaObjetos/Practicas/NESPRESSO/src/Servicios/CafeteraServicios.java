package Servicios;
import Entidades.Cafetera;


public class CafeteraServicios {
    public Cafetera crearCafetera(){
        // Instancia una nueva cafetera vacia
        Cafetera cafeteraNueva = new Cafetera();
        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        cafeteraNueva.setCapacidadMaxima(Leer.nextInt());
        return cafeteraNueva;
    }


    public void llenarCafetera(Cafetera cafetera) {
    cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }


}
