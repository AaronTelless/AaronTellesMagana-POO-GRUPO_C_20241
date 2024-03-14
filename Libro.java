/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_libreria;

import java.util.Random;

public class Libro {
    private int _id;
    private String nombre;
    private String autor;
    private int cantidad;
    private boolean rentado;

    public Libro(String nombre, String autor, int cantidad) {
        this._id = generarIdAleatorio();
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
        this.rentado = false;
    }

    private int generarIdAleatorio() {
        Random random = new Random();
        return random.nextInt(1000); // Genera un número aleatorio entre 0 y 999
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }
    
    public void rentar() {
        if (cantidad > 0) {
            cantidad--;
            rentado = true;
        } else {
            System.out.println("El libro " + nombre + " ya no está disponible.");
        }
    }

    public void devolver() {
        cantidad++;
        rentado = false;
    }
}
