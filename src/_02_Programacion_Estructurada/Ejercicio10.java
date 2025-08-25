/*

10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60

 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Stock actual
        System.out.print("Ingrese el stock actual del producto: "); 
        int stockActual = input.nextInt();

        // Cantidad vendida
        System.out.print("Ingrese la cantidad vendida: "); 
        int cantidadVendida = input.nextInt();

        // Cantidad recibida
        System.out.print("Ingrese la cantidad recibida: "); 
        int cantidadRecibida = input.nextInt();

        // Llamo al método actualizarStock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

    }

    // Auxiliar para calcular el stock actualizado
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
