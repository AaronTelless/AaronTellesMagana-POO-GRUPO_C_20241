package libreria;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import libros.LibroAccion;
import libros.LibroComedia;
import libros.LibroTerror;
import libros.constants.ClasificacionLibro;
import libros.constants.Genero;
import libros.constants.TerrorSubgenero;
import libros.utils.LibroSerializer;
import usuarios.Asistente;
import usuarios.Cliente;
import usuarios.Gerente;
import usuarios.Usuario;
import libros.Libro;
import usuarios.utils.Rol;
import usuarios.utils.UsuarioSerializer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Libreria {

    // HashMap
    public static final HashMap<Rol, ArrayList<Usuario>> usuarios = new HashMap<Rol, ArrayList<Usuario>>();
    public static final HashMap<Genero, ArrayList<Libro>> libros = new HashMap<Genero, ArrayList<Libro>>();


    public Libreria (boolean inicializarDatos) {
        if (inicializarDatos) {
            inicializarHashMapsUsuarios();
            inicializarHashMapsLibros();
        }
    }

    public Libreria () { }

    private void inicializarHashMapsUsuarios() {
        usuarios.put(Rol.GERENTE, new ArrayList<Usuario>());
        usuarios.put(Rol.ASISTENTE, new ArrayList<Usuario>());
        usuarios.put(Rol.CLIENTE, new ArrayList<Usuario>());

        usuarios.get(Rol.GERENTE).add(new Gerente("Aaron", "Telles","2005/10/01" ,"4432198178", 9500, "TEMA050110HMNLGRA3",  "AaronSex", "Gearsofwar2331"));
        usuarios.get(Rol.ASISTENTE).add(new Asistente("Juan", "Rivera", "2000/12/09","4433210999", 1500, "JUANITO3444332", "juan123", "12345"));
        usuarios.get(Rol.CLIENTE).add(new Cliente("Bri", "Ortiz", "2005/10/10", "45446546546", "BRI_23", "12345678"));
    }

    private void inicializarHashMapsLibros() {
        libros.put(Genero.TERROR, new ArrayList<>());
        libros.put(Genero.ACCION, new ArrayList<>());
        libros.put(Genero.COMEDIA, new ArrayList<>());

        libros.get(Genero.COMEDIA).add(new LibroComedia("Chupa El Perro","German Garmendia", "Pepsi", "09-08-2007",1200,  34));
        libros.get(Genero.ACCION).add(new LibroAccion("El Negociador", "Arturo Elias Ayub", "Coca Cola", "19-12-2000", 1500, 90, ClasificacionLibro.C));
        libros.get(Genero.TERROR).add(new LibroTerror("LA LA LAND", "Emma Stone", "TELLES", "10-01-2016", 1200, 80, TerrorSubgenero.PSICOLOGICO));
    }

    public static void guardarUsuarioEnJSON() { UsuarioSerializer.serialize(usuarios); }

    public static void guardarLibroEnJSON() { LibroSerializer.serialize(libros);
    }

    public Usuario verificarInicioSesion(String nombreUsuario, String contrasena) {
        for (Map.Entry<Rol, ArrayList<Usuario>> entry : usuarios.entrySet()) {
            for (Usuario usuario : entry.getValue()) {
                if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                    return usuario;
                }
            }
        }
        return null;
    }

    public static void registrarCliente() {
        Cliente.registrarCliente();
    }

    public static void mostrarClientes() {
        Cliente.mostrarCliente();
    }

    public static void modificarCliente() {
        Cliente.modificarCliente();
    }

    public static void eliminarClientes() {
        Cliente.eliminarClientes();
    }

    public static void registrarAsistente() {
        Asistente.registrarAsistente();
    }

    public static void mostrarAsistentes() {
        Asistente.mostrarAsistentes();
    }

    public static void modificarAsistente() {

    }

    public static void eliminarAsistentes() {
        Asistente.eliminarAsistentes();
    }

    public static void registrarGerente() {
        Gerente.registrarGerente();
    }

    public static void mostrarGerentes() {
        Gerente.mostrarGerentes();
    }

    public static void modificarGerente() {

    }

    public static void eliminarGerentes() {
        Gerente.eliminarGerentes();
    }


    public static void registrarLibroTerror() {
        LibroTerror.registrarLibro();
    }

    public static void registrarLibroAccion() {
        LibroAccion.registrarLibro();
    }

    public static void registrarLibroComedia() {
        LibroComedia.registrarLibro();
    }

    public static void eliminarLibroTerror() {
        LibroTerror.eliminarLibroTerror();
    }

    public static void eliminarLibroAccion() {
        LibroAccion.eliminarLibroAccion();
    }

    public static void eliminarLibroComedia() {
        LibroComedia.eliminarLibroComedia();
    }

    public static void mostrarLibroTerror() {
        LibroTerror.menuMostrarLibroTerror();
    }

    public static void mostrarLibroAccion() {
        LibroAccion.menuMostrarLibroAccion();
    }

    public static void mostrarLibroComedia() {
        LibroComedia.menuMostrarLibroComedia();
    }
}