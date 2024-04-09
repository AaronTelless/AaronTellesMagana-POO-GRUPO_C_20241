//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Usuarios.Asistente;
import Usuarios.Cliente;
import utils.Rol;

public class Main {
    public static void main (String[] args ){

        Cliente cliente = new Cliente("Cody", "Rhodes","4432198178");
        System.out.println(cliente.mostrarInfo());

    }

}