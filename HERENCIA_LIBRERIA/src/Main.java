import libreria.Libreria;
import libreria.Menu;
import usuarios.Cliente;
import usuarios.Usuario;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarSesion();

    }
}

//Cliente cliente = new Cliente("Pedro", "Perez", "4434654654");
//System.out.println(cliente.mostrarInfo());
//System.out.println(cliente.toString());