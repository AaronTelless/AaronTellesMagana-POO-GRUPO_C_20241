import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tienda {
    private final String CONTRASENA_SEGURA = "CODYRHODES";
    private ArrayList<Producto> stockProductos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Producto> productosVendidos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void ejecutarPrograma() {
        boolean esContrasenaValida = false;

        do {
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("Ingresa la contraseña");
            String contrasena = scanner.nextLine();

            if (contrasena.equals(CONTRASENA_SEGURA)) {
                esContrasenaValida = true;
                ejecutarMenuSistema();
            } else {
                System.out.println("\nContraseña incorrecta, intenta de nuevo");
            }
        } while (!esContrasenaValida);
    }

    private void ejecutarMenuSistema() {
        int opcion;

        do {
            System.out.println("\n** BIENVENIDO AL SISTEMA DE ABARROTES JOHN CENA **");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Registrar Cliente");
            System.out.println("3. Mostrar Productos");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Eliminar Producto");
            System.out.println("6. Eliminar Cliente");
            System.out.println("7. Realizar compra");
            System.out.println("8. Ver productos vendidos");
            System.out.println("9. Salir");
            System.out.println("Selecciona una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    registrarCliente();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    mostrarClientes();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 6:
                    eliminarCliente();
                    break;
                case 7:
                    realizarCompra();
                    break;
                case 8:
                    mostrarProductosVendidos();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 9);
    }

    private void registrarProducto() {
        System.out.println("Ingrese el tipo de producto a registrar:");
        System.out.println("1. Electrodomestico");
        System.out.println("2. Limpieza");
        System.out.println("3. Belleza");
        System.out.println("4. Alimento");
        int opcionTipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de nextDouble()

        System.out.println("Ingrese la fecha de importación (MM/DD/YYYY):");
        String fechaStr = scanner.nextLine();
        Date fechaImportacion = new Date(fechaStr);

        System.out.println("Ingrese el número de serie:");
        String numeroSerie = scanner.nextLine();

        System.out.println("Ingrese el stock del producto:");
        int stock = scanner.nextInt();
        scanner.nextLine();

        switch (opcionTipo) {
            case 1:
                System.out.println("Ingrese la marca del electrodomestico:");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo del electrodomestico:");
                String modelo = scanner.nextLine();
                Electrodomestico electrodomestico = new Electrodomestico(nombre, precio, fechaImportacion, numeroSerie, marca, modelo, stock);
                stockProductos.add(electrodomestico);
                System.out.println("Electrodomestico registrado con éxito.");
                break;
            case 2:
                System.out.println("Ingrese el tipo de limpieza:");
                String tipoLimpieza = scanner.nextLine();
                Limpieza limpieza = new Limpieza(nombre, precio, fechaImportacion, numeroSerie, tipoLimpieza, stock);
                stockProductos.add(limpieza);
                System.out.println("Producto de limpieza registrado con éxito.");
                break;
            case 3:
                System.out.println("Ingrese el tipo de producto de belleza:");
                String tipoBelleza = scanner.nextLine();
                Belleza belleza = new Belleza(nombre, precio, fechaImportacion, numeroSerie, tipoBelleza, stock);
                stockProductos.add(belleza);
                System.out.println("Producto de belleza registrado con éxito.");
                break;
            case 4:
                System.out.println("Ingrese la fecha de caducidad (MM/DD/YYYY):");
                String fechaCaducidad = scanner.nextLine();
                Alimento alimento = new Alimento(nombre, precio, fechaImportacion, numeroSerie, fechaCaducidad, stock);
                stockProductos.add(alimento);
                System.out.println("Alimento registrado con éxito.");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private void registrarCliente() {
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la dirección del cliente:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, direccion, telefono);
        clientes.add(cliente);
        System.out.println("Cliente registrado con éxito.");
    }

    private void mostrarProductos() {
        if (stockProductos.isEmpty()) {
            System.out.println("No hay productos en stock.");
        } else {
            System.out.println("\nProductos en stock:");
            for (Producto producto : stockProductos) {
                System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio() + " - Stock: " + producto.getStock());
            }
        }
    }

    private void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("\nClientes registrados:");
            for (Cliente cliente : clientes) {
                System.out.println("Nombre: " + cliente.getNombre() + " - Dirección: " + cliente.getDireccion() + " - Teléfono: " + cliente.getTelefono());
            }
        }
    }

    private void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < stockProductos.size(); i++) {
            if (stockProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                stockProductos.remove(i);
                encontrado = true;
                System.out.println("Producto eliminado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado en stock.");
        }
    }

    private void eliminarCliente() {
        System.out.println("Ingrese el nombre del cliente a eliminar:");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                clientes.remove(i);
                encontrado = true;
                System.out.println("Cliente eliminado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }

    private void realizarCompra() {
        System.out.println("Ingrese el nombre del producto que desea comprar:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente que realiza la compra:");
        String nombreCliente = scanner.nextLine();

        boolean productoEncontrado = false;
        for (Producto producto : stockProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto) && producto.getStock() > 0) {
                productoEncontrado = true;
                double precioProducto = producto.getPrecio();
                producto.eliminarStock(1);
                productosVendidos.add(producto);

                System.out.println("Producto: " + nombreProducto + " - Precio: " + precioProducto);
                System.out.println("Precio total de la compra: " + precioProducto);
                System.out.println("Producto '" + nombreProducto + "' comprado por '" + nombreCliente + "'.");
                break;
            }
        }

        if (!productoEncontrado) {
            System.out.println("Producto no encontrado o sin stock disponible.");
        }
    }

    private void mostrarProductosVendidos() {
        if (productosVendidos.isEmpty()) {
            System.out.println("No hay productos vendidos.");
        } else {
            System.out.println("\nProductos vendidos:");
            for (Producto producto : productosVendidos) {
                System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio());
            }
        }
    }
}
