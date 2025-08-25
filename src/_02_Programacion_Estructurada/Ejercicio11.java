/*

11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0

 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio11 {

    // Variable global de descuento
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        
        // Defino el objeto Scanner
        Scanner input = new Scanner(System.in);

        // Solicito el precio del producto
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Llamo al método que calcula y muestra el descuento especial
        calcularDescuentoEspecial(precio);

          }

    // Método que usa la variable global para aplicar el descuento
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local que guarda el valor del descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        // Calculo el precio final con descuento
        double precioFinal = precio - descuentoAplicado;

        // Muestro los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}


