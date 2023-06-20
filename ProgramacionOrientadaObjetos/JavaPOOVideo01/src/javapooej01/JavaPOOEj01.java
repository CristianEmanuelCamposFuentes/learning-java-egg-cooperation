/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooej01;

import Entidad.Perro;
import Servicio.MascotaService;

/**
 *
 * @author crist
 */
public class JavaPOOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Debemos instanciar un objeto del tipo Servicio
        // Para acceder a sus metodos y poder crear un objeto
        MascotaService mascotaServicio = new MascotaService();

        Perro perro1 = mascotaServicio.crearMascota();

        Perro perro2 = mascotaServicio.crearMascota();

        String p1 = perro1.toString();
        String p2 = perro2.toString();

        System.out.println(p1);
        System.out.println(p2);
    }
    
}
