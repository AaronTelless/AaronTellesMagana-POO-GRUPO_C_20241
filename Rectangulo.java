/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.rectangulo;

/**
 *
 * @author Aaron
 */
public class Rectangulo {
    double ancho;
    double altura;
    
    // Constructor
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    // Metodo para calcular el area del rectangulo
    public double calcularArea() {
        return ancho * altura;
    }
    
    // Metodo para calcular el perimetro del rectangulo
    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }
}
