/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotarea6;

/**
 *
 * @author Aaron
 */
public class EJERCICIOTAREA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Crear un producto con constructor que inicializa todos los atributos
        Producto producto1 = new Producto("Muñeca Inflable", 23.5, 300);

        // Crear un producto con constructor que establece el stock en 0 por defecto
        Producto producto2 = new Producto("Terreneitor", 20.75);

        // Acceder a los metodos getter para obtener información de los productos
        System.out.println("Producto 1:");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());

        System.out.println("\nProducto 2:");
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Stock: " + producto2.getStock());

        // Modificar el stock de los productos utilizando los métodos adicionales
        producto1.aumentarStock(50);
        producto2.reducirStock(10);

        // Imprimir la informacion actualizada de los productos
        System.out.println("\nDespues de modificar el stock:");
        System.out.println("Producto 1 - Stock: " + producto1.getStock());
        System.out.println("Producto 2 - Stock: " + producto2.getStock());
    }
}
