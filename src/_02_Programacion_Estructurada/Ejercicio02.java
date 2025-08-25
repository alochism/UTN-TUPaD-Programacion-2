/*

2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12

 */
package _02_Programacion_Estructurada;

// Importo librería Scanner
    import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        int num1;
        int num2;
        int num3;
        
        System.out.println("Ingrese tres números enteros: ");
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        if ((num1 > num2) && (num1 > num3)){
            System.out.println(num1 + " es el mayor de los tres números");
        } else if ((num2 > num1) && (num2 > num3)){
            System.out.println(num2 + " es el mayor de los tres números");
        } else {
            System.out.println(num3 + " es el mayor de los tres números");
        }
        
    }
    
}
