/*
5. Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.
*/


package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args) {
        //Defino el objeto tipo Scanner
           Scanner input = new Scanner(System.in);
         
        //Solicito ingreso de números y se leen con Scanner  
           System.out.println("Ingrese primer número entero: ");
           int num1;
        
           num1 = input.nextInt();
           
           System.out.println("Ingrese segundo número entero: ");
           int num2;
           
           num2 = input.nextInt();
           
           //Realizo operaciones y muestro por pantalla
           System.out.println("a. Suma = " + (num1 + num2));
           System.out.println("b. Resta = " + (num1 - num2));
           System.out.println("a. Multiplicación = " + (num1 * num2));
           System.out.println("a. División = " + (num1 / num2));
        
        
    }
    
}
