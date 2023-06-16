package Entidad;

public class Vehiculo {
    // Siempre los atributos deben ser privados.
    private String marca;
    private int year;
    private String modelo;
    private String tipo;
    public Vehiculo(String marca, int year, String modelo, String tipo) {
        this.marca = marca;
        this.year = year;
        this.modelo = modelo;
        this.tipo = tipo;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
