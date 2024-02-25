/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_tarea5;

/**
 *
 * @author Aaron
 */
public class Empleado {
    
    // Metodo para calcular el salario con solo sueldo base
    public double calcularSalario(double sueldoBase) {
        return sueldoBase;
    }

    // Metodo para calcular el salario con sueldo base y bonificación
    public double calcularSalario(double sueldoBase, double bonificacion) {
        return sueldoBase + bonificacion;
    }

    // Metodo para calcular el salario con sueldo base, bonificación y horas extras
    public double calcularSalario(double sueldoBase, double bonificacion, int horasExtras) {
        return sueldoBase + bonificacion + (horasExtras * 20);
    }
}
