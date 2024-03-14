
package ejercicio_libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Usuario> usuarios;
    private List<Libro> libros;

    public Libreria() {
        this.usuarios = new ArrayList<>();
        this.libros = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> obtenerUsuariosConLibrosRentados() {
        List<Usuario> usuariosConLibrosRentados = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (!usuario.getLibrosRentados().isEmpty()) {
                usuariosConLibrosRentados.add(usuario);
            }
        }
        return usuariosConLibrosRentados;
    }

    public List<Libro> obtenerLibrosNoRentados() {
        List<Libro> librosNoRentados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isRentado()) {
                librosNoRentados.add(libro);
            }
        }
        return librosNoRentados;
    }

    public List<Libro> obtenerLibrosRentados() {
        List<Libro> librosRentados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isRentado()) {
                librosRentados.add(libro);
            }
        }
        return librosRentados;
    }

    public void rentarLibro(Usuario usuario, Libro libro) {
        if (libros.contains(libro)) {
            usuario.rentarLibro(libro);
            System.out.println("Libro " + libro.getNombre() + " rentado por " + usuario.getNombre());
        } else {
            System.out.println("El libro " + libro.getNombre() + " no está disponible.");
        }
    }
}

