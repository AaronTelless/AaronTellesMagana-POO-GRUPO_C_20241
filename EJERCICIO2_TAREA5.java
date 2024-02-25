/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_tarea5;

/**
 *
 * @author Aaron
 */
public class EJERCICIO2_TAREA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Empleado empleado = new Empleado();

        // calculo de salario
        double salario1 = empleado.calcularSalario(1000);
        double salario2 = empleado.calcularSalario(1200, 200);
        double salario3 = empleado.calcularSalario(1500, 250, 5);

        System.out.println("Salario 1: $" + salario1);
        System.out.println("Salario 2: $" + salario2);
        System.out.println("Salario 3: $" + salario3);
    }
}

