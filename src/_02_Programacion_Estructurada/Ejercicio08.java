/*

Funciones:
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto 
en un e-commerce. 

La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = 
PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, 
llama al método y muestra el precio final.

Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0

 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pb;
        double impuesto;
        double descuento;

        System.out.print("Ingrese el precio base del producto: ");
        pb = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = input.nextDouble();

        // Llamo al método calcularPrecioFinal
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(pb, impuesto, descuento));

    }

    public static double calcularPrecioFinal(double pb, double impuesto, double descuento) {

        double pf = pb + (pb * (impuesto / 100)) - (pb * (descuento / 100));

        return pf;

    }
}
