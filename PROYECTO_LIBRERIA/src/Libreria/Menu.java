package Libreria;

import Usuarios.Usuario;

import java.util.Scanner;

public class Menu {
    private Libreria libreria = new Libreria();
    private Scanner scanner = new Scanner(System.in);

    public void iniciarSesion() {
        boolean datosCorrectos = false;
        do {
            System.out.println("\nBienvenido al sistema de la biblioteca");
            System.out.println("Para continuar inicia sesion\n");

            System.out.println("Ingresa tu usuario: ");
            String usuario = scanner.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            String contrasena = scanner.nextLine();

            Usuario usuarioActual = libreria.verificarInicioSesion(usuario, contrasena);

            if(usuarioActual != null) {
                datosCorrectos = true;
                seleccionarMenu(usuarioActual);

            }
            else{
                System.out.println("Usuario contraseña incorrecta. Intenta de nuevo");
            }

        } while(!datosCorrectos);

    }

    //FUNCION LAMBDA
    private void seleccionarMenu(Usuario usuario){
        switch (usuario.getRol()){
            case CLIENTE -> mostrarMenuCliente();
            case ASISTENTE -> mostrarMenuAsistente();
            case GERENTE -> mostrarMenuGerente();
        }
    }

    private void mostrarMenuCliente() {
        System.out.println("Bienvenido al sistema del menu del cliente");
        System.out.println("\nLas opciones son las siguientes: ");
        System.out.println("1. Ver libros disponibles");
        System.out.println("2. Consultar rentas");
        System.out.println("N. Cerrar sesión");
        System.out.println("0. Salir");

        String opcion = scanner.nextLine().toUpperCase();

        switch (opcion) {
            case "1":

                break;
            case "2":

                break;
            case "N":
                iniciarSesion();
                break;
            case "0":
                System.out.println("Gracias por usar el sistema. ¡BYE! (Como la cancion de la doble P)");
                break;
            default:
                System.out.println("Opcion inválida. Por favor, seleccione una opción valida.");
                mostrarMenuCliente();
                break;
        }
    }

    private void mostrarMenuAsistente() {
        System.out.println("Bienvenido al sistema del menu del asistente");
        System.out.println("\nLas opciones son las siguientes: ");
        System.out.println("1. Registro de clientes");
        System.out.println("2. Consulta de clientes");
        System.out.println("3. Modificación de clientes");
        System.out.println("4. Eliminación de clientes");
        System.out.println("5. Registro de libros");
        System.out.println("6. Consulta de libros");
        System.out.println("7. Modificación de libros");
        System.out.println("8. Eliminación de libros");
        System.out.println("9. Consultar rentas");
        System.out.println("N. Cerrar sesión");
        System.out.println("0. Salir");

        String opcion = scanner.nextLine().toUpperCase();

        switch (opcion) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            case "7":

                break;
            case "8":

                break;
            case "9":

                break;
            case "N":
                iniciarSesion();
                break;
            case "0":
                System.out.println("Gracias por usar el sistema. ¡BYE!");
                break;
            default:
                System.out.println("Opción invalida. Por favor, seleccione una opcion valida.");
                mostrarMenuAsistente();
                break;
        }
    }

    private void mostrarMenuGerente() {
        System.out.println("Bienvenido al sistema del menu del gerente");
        System.out.println("\nLas opciones son las siguientes: ");
        System.out.println("1. Registro de clientes");
        System.out.println("2. Consulta de clientes");
        System.out.println("3. Modificación de clientes");
        System.out.println("4. Eliminación de clientes");
        System.out.println("5. Registro de libros");
        System.out.println("6. Consulta de libros");
        System.out.println("7. Modificación de libros");
        System.out.println("8. Eliminación de libros");
        System.out.println("9. Registro de asistentes");
        System.out.println("10. Consulta de asistentes");
        System.out.println("11. Modificación de asistentes");
        System.out.println("12. Eliminación de asistentes");
        System.out.println("13. Consultar rentas");
        System.out.println("N. Cerrar sesión");
        System.out.println("0. Salir");

        String opcion = scanner.nextLine().toUpperCase();

        switch (opcion) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            case "7":

                break;
            case "8":

                break;
            case "9":

                break;
            case "10":

                break;
            case "11":

                break;
            case "12":

                break;
            case "13":

                break;
            case "N":
                iniciarSesion();
                break;
            case "0":
                System.out.println("Gracias por usar el sistema. ¡BYE!");
                break;
            default:
                System.out.println("Opción invalida. Por favor, seleccione una opcion valida.");
                mostrarMenuGerente();
                break;
        }
    }
}
