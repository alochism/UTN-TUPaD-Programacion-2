/*

7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. 
Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que 
ingrese un valor válido.
Ejemplo de entrada/salida:
Ingrese una nota (0-10): 15
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente.

 */

package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Ingrese una nota (0-10): ");
        num = input.nextInt();

        if (num < 0 || num > 10) {
            do {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
                System.out.print("Ingrese una nota (0-10): ");
                num = input.nextInt();

            } while (num < 0 || num > 10);

        }

        System.out.println("Nota guardada correctamente.");

    }

}
