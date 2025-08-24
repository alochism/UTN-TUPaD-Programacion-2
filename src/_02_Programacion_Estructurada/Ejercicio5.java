/*
 5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta
que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio5 {

// Defino la constante de corte del ciclo while
    static final int CORTE = 0;

    public static void main(String[] args) {

        // Defino la variable donde se irán sumando los valores pares
        int pares = 0;

        // Defino e inicializo la variable donde irán ingresando números por consola. Inicializa con 1 para no cambiar el resultado de la suma y para poder usar el while teniendo un caso para comparar.
        int num;
        Scanner input = new Scanner(System.in);
        
        // Solicito el primer valor para poder compararlo en el ciclo while
        System.out.print("Ingrese un número (0 para terminar): ");
        num = input.nextInt();

        // Armo el ciclo while de sumas
        while (num != CORTE) {
            if (num % 2 == 0) {
                pares += num;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            num = input.nextInt();

        }
        System.out.println("La suma de los números pares es: " + pares);
    }
}      
