/*
 8. Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el usuario.
b. Modifica el código para usar double en lugar de int y compara los resultados.
 */


package _01_Introduccion_a_Java;

//Importo Scanner ya que se necesita para poder leer lo ingresado por el usuario
        
        import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String [] args){
        
        //Creo el OBJETO input de tipo Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        
        //Defino laa variable num1 e indico que la lea por consola
        int num1;
        num1 = input.nextInt();
        
        System.out.print("Ingrese otro número: ");
        
        //Defino laa variable num2 e indico que la lea por consola
        int num2;
        num2 = input.nextInt();
        
        //Defino la variable division y le asigno la división entre los valores ingresados por consola
        int division;
        division = num1 / num2;
        
        //Muestro el resultado de la división usando int
        System.out.println("El resultado de dividir " + (num1) + " por " + (num2) + " utilizando el método int es " + (division));
        
        //Cambio la variable de int a double usando el casting
        
        double division2;
        
        division2 = (double) num1 / num2;
        
        //Muestro el resultado de la división usando double
        System.out.println("El resultado de dividir " + (num1) + " por " + (num2) + " utilizando el método double es " + (division2));
        
    }
}
