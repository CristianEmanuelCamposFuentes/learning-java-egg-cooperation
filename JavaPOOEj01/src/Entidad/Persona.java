/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author crist
 */
public class Persona {

    // Atributos de la clase
    public String nombre;
    public String apellido;
    public int edad;

    // Metodo Constructor por defecto
    public Persona() {

    }

    // Metodo Constructor con parámetros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

}
