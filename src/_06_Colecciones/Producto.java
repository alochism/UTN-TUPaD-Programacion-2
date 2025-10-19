package _06_Colecciones;

public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor completo
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;               
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        totalCreados++;
    }

    // Constructor sobrecargado: por defecto cantidad = 0
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria); // encadenamiento con this()
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    // Método pedido
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    // toString para lectura
    @Override
    public String toString() {
        return "Producto {"
                + "id='" + id + '\''
                + ", nombre='" + nombre + '\''
                + ", precio=$" + precio
                + ", cantidad=" + cantidad
                + ", categoria=" + categoria + " (" + categoria.getDescripcion() + ")"
                + '}';
    }

    // Setter para modificar el stock
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // --- estáticos ---
    private static int totalCreados = 0;            
    public static final double IVA = 0.21;           

    

// método estático de consulta
public static int getTotalCreados() {
        return totalCreados;
    }

// método de instancia que usa la constante estática
    public double precioConIva() {
        return this.precio * (1 + IVA);
    }

}
