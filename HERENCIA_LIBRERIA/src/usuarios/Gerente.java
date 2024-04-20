package usuarios;
import usuarios.utils.Rol;
import java.time.LocalDate;

public class Gerente extends Usuario {

    private double sueldo;
    private String INE;
    private LocalDate fechaInicio;

    public Gerente(String nombre, String apellido, String telefono, double sueldo,String INE,String nombreUsuario, String contrasena) {
        super(nombre, apellido, telefono, Rol.GERENTE, nombreUsuario, contrasena);
        this.sueldo = sueldo;
        this.INE = INE;
        this.fechaInicio = LocalDate.now();
    }

    @Override
    public String toString() {
        return String.format("%s , fecha inicio: %s, INE: %s, Sueldo de: %f", super.toString(), fechaInicio, INE, sueldo);
    }
}
