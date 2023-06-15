/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooej01;

import Entidad.Persona;
import Servicio.PersonaService;

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
        // Para acceder a sus metodos
        PersonaService persServicio = new PersonaService();

        // Instanciacion utilizando el constructor por parametros
//        Persona terceraPersona = persServicio.crearPersona();
//
//        System.out.println(terceraPersona.getApellido());
//        System.out.println(terceraPersona.getNombre());
//        System.out.println(terceraPersona.getEdad());
//
        Persona taba = new Persona("Taba", "Campos", 30);

        System.out.println(taba.getApellido());
        System.out.println(taba.getNombre());
        System.out.println(taba.getEdad());
    }
    
}
