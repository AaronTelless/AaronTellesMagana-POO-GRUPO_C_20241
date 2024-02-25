/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_tarea5;

/**
 *
 * @author Aaron
 */
public class Rectangulo {
    double longitud;
    double ancho;

    // Constructor para rectangulo : )
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    // Metodo para calcular el área con enteros
    public int calcularArea(int longitud, int ancho) {
        return longitud * ancho;
    }

    // Metodo para calcular el area con dobles
    public double calcularArea(double longitud, double ancho) {
        return longitud * ancho;
    }

    // Metodo para calcular el perimetro con enteros
    public int calcularPerimetro(int longitud, int ancho) {
        return 2 * (longitud + ancho);
    }

    // Metodo para calcular el perimetro con dobles
    public double calcularPerimetro(double longitud, double ancho) {
        return 2 * (longitud + ancho);
    }
}

