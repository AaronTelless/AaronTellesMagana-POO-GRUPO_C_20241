/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotarea6;

/**
 *
 * @author Aaron
 */
public class Producto {
   
    private String nombre;
    private double precio;
    private int stock;

    // Constructor que inicializa todos los atributos del producto
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Constructor que establece el stock en 0 por defecto
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    // Getters y setters para todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede ser nulo papito");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Metodo para aumentar el stock del producto
    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        } else {
            System.out.println("La cantidad a aumentar debe ser mayor que cero.");
        }
    }

    // Metodo para reducir el stock del producto
    public void reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= this.stock) {
            this.stock -= cantidad;
        } else {
            System.out.println("La cantidad a reducir debe ser mayor que cero y menor o igual al stock actual.");
        }
    }
}
