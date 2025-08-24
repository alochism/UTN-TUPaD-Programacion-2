/*
 6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, 
negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
 */

package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Contadores
        int contpos = 0; // Contador positivos
        int contneg = 0; // Contador negativos
        int contcero = 0; // Contador ceros

        // Números ingresados
        int num;
        
        
        // Utilizo el ciclo for para ingresar los números y contarlos
        for (int cont = 1; cont < 11; cont++) {

            System.out.print("Ingrese el número " + cont + ": ");
            num = input.nextInt();

            if (num > 0) {
                contpos++;
            } else if (num == 0) {
                contcero++;
            } else {
                contneg++;
            }

        }
        System.out.println("Resultados:\nPositivos: " + contpos + "\nNegativos: " + contneg + "\nCeros: " + contcero);
    }
}
