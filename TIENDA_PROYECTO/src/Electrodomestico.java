import java.util.Date;

public class Electrodomestico extends Producto {
    private String marca;
    private String modelo;

    public Electrodomestico(String nombre, double precio, Date fechaImportacion, String numeroSerie, String marca, String modelo, int stock) {
        super(nombre, precio, fechaImportacion, numeroSerie, stock);
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
