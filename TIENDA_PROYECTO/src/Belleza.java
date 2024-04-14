import java.util.Date;

public class Belleza extends Producto {
    private String tipoProducto;

    public Belleza(String nombre, double precio, Date fechaImportacion, String numeroSerie, String tipoProducto, int stock) {
        super(nombre, precio, fechaImportacion, numeroSerie, stock);
        this.tipoProducto = tipoProducto;
    }


    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
