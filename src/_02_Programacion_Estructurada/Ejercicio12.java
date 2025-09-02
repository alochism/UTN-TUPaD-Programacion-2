/*

12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
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
Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.
✔ Recorrido del array con for-each para mostrar valores.
✔ Modificación de un valor en un array mediante un índice.
✔ Reimpresión del array después de la modificación.

 */
package _02_Programacion_Estructurada;


public class Ejercicio12 {

public static void main(String[] args){
    
    double[] precios = {45.5, 88.9, 23.0, 12.0, 7.9};
    
    // Precios Originales
    System.out.println("Precios origniales: ");    
    for (int i = 0; i < precios.length; i++){
        System.out.println("Precio: $" + precios[i] );
    }
    
    // Precio 3 (cuarto valor) modificado
    
    precios[3] = 999.9;
    System.out.println("Precios modificados:");
     for (int i = 0; i < precios.length; i++){
        System.out.println("Precio: $" + precios[i] );
    }
}
        
}
