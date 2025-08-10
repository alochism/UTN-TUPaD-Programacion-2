/*
4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego 
los muestre en pantalla. Usa Scanner para capturar los datos.
*/


package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String [] args) {
           //Defino el objeto tipo Scanner
           Scanner input = new Scanner(System.in);
           
           //Solicito que se ingrese nombre
            System.out.println("Ingrese su nombre: ");
            String nombre;
                        
            nombre = input.nextLine();
            
            //Solicito que se ingresen edad
            System.out.println("Ingrese su edad: ");
            int edad;
            edad = input.nextInt();
           
            //Imprimo por pantalla los datos ingresados
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su edad es: " + edad + " años");
            


            
    }
            
    
}
