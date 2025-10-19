package _06_Colecciones;

public class Ejercicio1_Main {

    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // Creo 5 productos con distintas categorías y precios
        Producto p1 = new Producto("P-001", "Mate de metal", 3500.0, 25, CategoriaProducto.HOGAR);
        Producto p2 = new Producto("P-002", "Campera softshell", 42750.0, 0, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P-003", "Yerba  500g", 1850.0, 40, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("P-004", "Auriculares Motorola", 29990.0, 10, CategoriaProducto.ELECTRONICA);

        // uso del constructor sobrecargado (cantidad=0)
        Producto p5 = new Producto("P-005", "Sábanas 2 plazas", 2750.0, CategoriaProducto.HOGAR);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        //Listo todos los productos
        inv.listarProductos();

        //Busco un producto por ID y mostrar detalles
        System.out.println("\nBUSCANDO PRODUCTO P-003...");
        Producto encontrado = inv.buscarProductoPorId("P-003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el producto.");
        }

// Filtro productos por categoría
        inv.filtrarPorCategoria(CategoriaProducto.HOGAR);

// Elimino un producto por su ID y listar los productos restantes
        inv.eliminarProducto("P-002");
        inv.listarProductos();

// Actualizo el stock de un producto existente
        inv.actualizarStock("P-005", 18);

        //Muestro todo el stock
        int total = inv.obtenerTotalStock();
        System.out.println("\nTotal de unidades en stock: " + total);

//Producto con más stock
        Producto top = inv.obtenerProductoConMayorStock();
        if (top != null) {
            System.out.println("Producto con mayor stock:");
            top.mostrarInfo();
        } else {
            System.out.println("Inventario vacío.");
        }
// Filtro productos por preico
        inv.filtrarProductosPorPrecio(1000, 3000);

// Muestro categorías disponibles
        inv.mostrarCategoriasDisponibles();

        System.out.println("\nTotal de productos creados: " + Producto.getTotalCreados());
        System.out.println("Precio con IVA de P-003: $" + p3.precioConIva());

    }
}
