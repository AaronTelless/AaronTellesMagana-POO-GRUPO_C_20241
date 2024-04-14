import java.util.Date;

public class Producto {
    private String nombre;
    private double precio;
    private Date fechaImportacion;
    private String numeroSerie;
    private int stock;

    public Producto(String nombre, double precio, Date fechaImportacion, String numeroSerie, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaImportacion = fechaImportacion;
        this.numeroSerie = numeroSerie;
        this.stock = stock;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaImportacion() {
        return fechaImportacion;
    }

    public void setFechaImportacion(Date fechaImportacion) {
        this.fechaImportacion = fechaImportacion;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println(cantidad + " unidades de " + this.nombre + " agregadas al stock.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }


    public void eliminarStock(int cantidad) {
        if (cantidad > 0 && cantidad <= this.stock) {
            this.stock -= cantidad;
            System.out.println(cantidad + " unidades de " + this.nombre + " eliminadas del stock.");
        } else {
            System.out.println("La cantidad no es válida o supera el stock disponible.");
        }
    }
}
