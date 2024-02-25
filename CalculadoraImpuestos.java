/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tarea5;

/**
 *
 * @author Aaron
 */
public class CalculadoraImpuestos {
    
// Metodo para calcular impuestos con solo ingresos
    public double calcularImpuestos(int ingresos) {
        return ingresos + 0.15;
    }

// Metodo para calcular impuestos con ingresos y porcentaje de impuestos
    public double calcularImpuestos(double ventas, double porcentajeImpuestos) {
        return ventas * (porcentajeImpuestos / 100);
    }

// Metodo para calcular impuestos con dividendos, porcentaje de impuestos y exención
    public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if (impuestos > exencion) {
            return impuestos - exencion;
        } else {
            return 0;
        }
    }
}
  
