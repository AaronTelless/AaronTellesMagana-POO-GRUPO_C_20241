
package ejercicio_libreria;

import java.util.List;
import java.util.Scanner;

public class EJERCICIO_LIBRERIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Libro");
            System.out.println("3. Rentar Libro");
            System.out.println("4. Listar Usuarios con Libros Rentados");
            System.out.println("5. Listar Libros no Rentados");
            System.out.println("6. Listar Libros Rentados");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    scanner.nextLine();
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese la edad del usuario: ");
                    int edadUsuario = scanner.nextInt();
                    Usuario nuevoUsuario = new Usuario(nombreUsuario, edadUsuario);
                    libreria.registrarUsuario(nuevoUsuario);
                    System.out.println("Usuario registrado con exito. ID: " + nuevoUsuario.getId());
                    break;
                case 2:
                    System.out.print("Ingrese el titulo del libro: ");
                    scanner.nextLine();
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de libros: ");
                    int cantidadLibros = scanner.nextInt();
                    Libro nuevoLibro = new Libro(tituloLibro, autorLibro, cantidadLibros);
                    libreria.registrarLibro(nuevoLibro);
                    System.out.println("Libro registrado con exito.");
                    break;
                case 3:
                    System.out.println("Usuarios:");
                    mostrarUsuarios(libreria.getUsuarios());
                    System.out.print("Ingrese el indice del usuario: ");
                    int indiceUsuario = scanner.nextInt();
                    System.out.println("Libros:");
                    mostrarLibros(libreria.getLibros());
                    System.out.print("Ingrese el indice del libro: ");
                    int indiceLibro = scanner.nextInt();
                    Usuario usuarioSeleccionado = libreria.getUsuarios().get(indiceUsuario - 1);
                    Libro libroSeleccionado = libreria.getLibros().get(indiceLibro - 1);
                    libreria.rentarLibro(usuarioSeleccionado, libroSeleccionado);
                    System.out.println("Libro rentado con exito. Cantidad restante: " + libroSeleccionado.getCantidad());
                    break;
                case 4:
                    System.out.println("Usuarios con Libros Rentados:");
                    mostrarUsuarios(libreria.obtenerUsuariosConLibrosRentados());
                    break;
                case 5:
                    System.out.println("Libros no Rentados:");
                    mostrarLibros(libreria.obtenerLibrosNoRentados());
                    break;
                case 6:
                    System.out.println("Libros Rentados:");
                    mostrarLibros(libreria.obtenerLibrosRentados());
                    break;
                case 7:
                    System.out.println("Gracias por usar el sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            System.out.println((i + 1) + ". ID: " + usuario.getId() + ", Nombre: " + usuario.getNombre());
        }
    }

    private static void mostrarLibros(List<Libro> libros) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println((i + 1) + ". " + libro.getNombre() + ", Cantidad disponible: " + libro.getCantidad());
        }
    }
}
