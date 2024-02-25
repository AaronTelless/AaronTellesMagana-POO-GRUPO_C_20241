/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_tarea5;

/**
 *
 * @author Aaron
 */
public class EJERCICIO3_TAREA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        // calculo de impuestos
        double impuestos1 = calculadora.calcularImpuestos(1000);
        double impuestos2 = calculadora.calcularImpuestos(6000, 15.0);
        double impuestos3 = calculadora.calcularImpuestos(2000, 20.0, 500);

        System.out.println("Impuestos 1: $" + impuestos1);
        System.out.println("Impuestos 2: $" + impuestos2);
        System.out.println("Impuestos 3: $" + impuestos3);
    }
}
