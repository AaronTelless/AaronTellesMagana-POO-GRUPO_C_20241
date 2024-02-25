/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tarea5;

/**
 *
 * @author Aaron
 */
public class EJERCICIO1_TAREA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3.0, 6.5);

        // Calculando el area y el perimetro con dobles
        double areaDobles = rectangulo.calcularArea(3.0, 6.5);
        double perimetroDoubles = rectangulo.calcularPerimetro(3.0, 6.5);

        System.out.println("Area (doubles): " + areaDobles);
        System.out.println("Perimetro (doubles): " + perimetroDoubles);

        // Calculando el area y el perimetro con enteros
        int areaEnteros = rectangulo.calcularArea(3, 6);
        int perimetroEnteros = rectangulo.calcularPerimetro(3, 6);

        System.out.println("Area (enteros): " + areaEnteros);
        System.out.println("Perimetro (enteros): " + perimetroEnteros);
    }
}

   
