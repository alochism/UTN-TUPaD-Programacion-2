/*
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío 
(Nacional o Internacional) y el peso del paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo 
del producto con el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. 
Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingresa el precio del producto
        System.out.print("Ingrese el precio del producto: ");

        double precioProducto = input.nextDouble();

        // Ingresa el peso del producto
        System.out.print("Ingrese el peso del producto: ");

        double pesoProducto = input.nextDouble();

        // Ingresa la zona
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");

        // Uso next en vez de nextLine ya que por el nextDouble anterior quedaría un "enter" cargado, para evitar que lo lea el nextLine uso solo next
        String zona = input.next();

        // Guardo el return de Auxiliar 1 en variable
        double costoEnvio = calcularCostoEnvio(pesoProducto, zona);

        System.out.println("El costo del envío es: " + costoEnvio);

        // Guardo el return de Auxiliar 2 en variable
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El total a pagar es: " + totalCompra);

    }

    // Auxiliar1 para calcular el envío
    public static double calcularCostoEnvio(double pesoProducto, String zona) {
        double costoZona;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoZona = 5.0;

        } else {
            costoZona = 10.0;
        }

        return costoZona * pesoProducto;

    }

    // Auxiliar2 para calcular el costo total
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {

        return precioProducto + costoEnvio;
    }
}
