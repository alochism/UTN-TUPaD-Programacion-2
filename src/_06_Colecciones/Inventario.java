package _06_Colecciones;

import java.util.ArrayList;

public class Inventario {

    // Atributo
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar Productos
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    // Listar productos
    public void listarProductos() {
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Buscar por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p; // devuelve el objeto encontrado
            }
        }
        return null; // si no lo encuentra
    }

    // Eliminar producto por ID
    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto eliminado: " + encontrado.getNombre());
        } else {
            System.out.println("No se encontró un producto con ID: " + id);
        }
    }

    // Actualizar stock 
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            encontrado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado de " + encontrado.getNombre() + " a " + nuevaCantidad);
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }

    // Filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS DE LA CATEGORÍA: " + categoria + " ---");
        boolean alguno = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("No hay productos en esa categoría.");
        }
    }
    //Total de unidades en stock (suma de cantidades)

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }
    
    // Filtrar productos por precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n--- PRODUCTOS CON PRECIO ENTRE $" + min + " y $" + max + " ---");
        boolean alguno = false;

        
        if (min > max) {
            double aux = min;
            min = max;
            max = aux;
        }

        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio >= min && precio <= max) {
                p.mostrarInfo();
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }

    // Mostrar categorías disponibles y su descripción
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.getDescripcion());
        }
    }

}

