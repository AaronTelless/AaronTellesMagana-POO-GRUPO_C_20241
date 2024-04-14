import java.util.Date;

public class Limpieza extends Producto {
    private String tipo;

    public Limpieza(String nombre, double precio, Date fechaImportacion, String numeroSerie, String tipo, int stock) {
        super(nombre, precio, fechaImportacion, numeroSerie, stock);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
