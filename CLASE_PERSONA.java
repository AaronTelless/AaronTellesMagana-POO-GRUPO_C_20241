/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_persona;

/**
 *
 * @author Aaron
 */
public class CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Crear instancias de la clase Persona
        Persona persona1 = new Persona("Randy", 30, "Femenino");
        Persona persona2 = new Persona("Cody", 25, "Masculino");
        Persona persona3 = new Persona("John", 40, "No binario");
        
// Mostrar los atributos de las instancias
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Genero: " + persona1.getGenero());
        
        System.out.println("\nPersona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Genero: " + persona2.getGenero());
        
        System.out.println("\nPersona 3:");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        System.out.println("Genero: " + persona3.getGenero());
    }
}
    
    

