import java.util.Date;

public class Alimento extends Producto {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, Date fechaImportacion, String numeroSerie, String fechaCaducidad, int stock) {
        super(nombre, precio, fechaImportacion, numeroSerie, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
