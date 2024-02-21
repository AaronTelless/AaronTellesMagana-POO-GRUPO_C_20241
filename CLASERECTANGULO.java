/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.rectangulo;

/**
 *
 * @author Aaron
 */
public class CLASERECTANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancia de la clase Rectangulo
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        
        // Calcular y mostrar el area del rectángulo
        System.out.println("area del rectangulo: " + rectangulo.calcularArea());
        
        // Calcular y mostrar el perímetro del rectángulo
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}
  
  
