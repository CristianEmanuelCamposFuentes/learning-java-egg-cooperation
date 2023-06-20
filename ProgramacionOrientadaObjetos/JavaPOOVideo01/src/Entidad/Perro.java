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
public class Perro {

    // Atributos de la clase
    public String nombre;
    public int edad;
    private String raza;

    // Metodo Constructor por defecto
    public Perro() {

    }

    // Metodo Constructor con parámetros
    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }


    // ** Setters and Getters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
