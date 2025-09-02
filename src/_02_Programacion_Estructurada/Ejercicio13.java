/*

13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99

 */
package _02_Programacion_Estructurada;

public class Ejercicio13 {

    public static void main(String[] args) {

        System.out.println("Precios originales: ");

        double[] precios = {45.5, 88.9, 23.0, 12.0, 7.9};

        arrayRecursivo(precios, 0);

        // Modifico posición 2 (tercer precio)
        precios[2] = 999.99;

        System.out.println("Precios modificados: ");
        arrayRecursivoModificado(precios, 0);

    }

    // Función recursiva mostrando precios originales
    static void arrayRecursivo(double[] precios, int i) {

        // Caso base
        if (i == precios.length) {
            return;

        }
        System.out.println("Precio: $" + precios[i]);

        // Recursividad
        arrayRecursivo(precios, i + 1);
    }

    static void arrayRecursivoModificado(double[] precios, int i) {

        // Caso base
        if (i == precios.length) {
            return;

        }
        System.out.println("Precio: $" + precios[i]);

        // Recursividad
        arrayRecursivoModificado(precios, i + 1);
    }
}
