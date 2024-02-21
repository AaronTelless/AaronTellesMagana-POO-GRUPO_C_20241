/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.libro;

/**
 *
 * @author Aaron
 */
public class Libro {
    // Atributos con valores iniciales
    String titulo = "El nombre del viento";
    String autor = "Patrick Rothfuss";
    int anioPublicacion = 2007;
    
    // Método para mostrar los atributos del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }
}
