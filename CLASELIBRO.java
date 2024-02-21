/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.libro;

/**
 *
 * @author Aaron
 */
public class CLASELIBRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase Libro
        Libro libro1 = new Libro();
        
        // Mostrar los atributos del primer libro
        System.out.println("Información del primer libro:");
        libro1.mostrarInformacion();
        
        // Crear tres instancias más de la clase Libro
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        
        // Modificar los atributos de los libros
        libro2.titulo = "Cien anioos de soledad";
        libro2.autor = "Gabriel Garcia Marquez";
        libro2.anioPublicacion = 1967;
        
        libro3.titulo = "1984";
        libro3.autor = "George Orwell";
        libro3.anioPublicacion = 1949;
        
        libro4.titulo = "Harry Potter y la piedra filosofal";
        libro4.autor = "J.K. Rowling";
        libro4.anioPublicacion = 1997;
        
        // Mostrar los atributos de los libros modificados
        System.out.println("\nInformación de los libros modificados:");
        System.out.println("Libro 2:");
        libro2.mostrarInformacion();
        
        System.out.println("\nLibro 3:");
        libro3.mostrarInformacion();
        
        System.out.println("\nLibro 4:");
        libro4.mostrarInformacion();
    }
}
   
  
