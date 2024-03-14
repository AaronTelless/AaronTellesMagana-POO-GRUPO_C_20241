/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Usuario {
    private int id;
    private String nombre;
    private int edad;
    private List<Libro> librosRentados;

    public Usuario(String nombre, int edad) {
        this.id = generarIdAleatorio();
        this.nombre = nombre;
        this.edad = edad;
        this.librosRentados = new ArrayList<>();
    }

    private int generarIdAleatorio() {
        Random random = new Random();
        return random.nextInt(1000); // Genera un número aleatorio entre 0 y 999
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Libro> getLibrosRentados() {
        return librosRentados;
    }

    public void setLibrosRentados(List<Libro> librosRentados) {
        this.librosRentados = librosRentados;
    }

    public void rentarLibro(Libro libro) {
        librosRentados.add(libro);
        libro.rentar();
    }

    public void devolverLibro(Libro libro) {
        librosRentados.remove(libro);
        libro.devolver();
    }
}
