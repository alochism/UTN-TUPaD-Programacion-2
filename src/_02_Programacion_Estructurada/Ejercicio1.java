/*
 1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
 */
package _02_Programacion_Estructurada;

//Importo la librería Scanner 
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String [] args) {
        
        // Defino el objeto tipo Scanner
        Scanner input = new Scanner (System.in);
        
        // Defino la variable anio de tipo integer
        int anio;
        
        //Solicito por consola que se ingrese un año
        System.out.println("Ingrese un año: ");
        
        // La variable año se debe leer de lo ingresado por consola
        anio = input.nextInt();
        
        // Uso el método numBisiesto en el main
        if (numBisiesto(anio)){ 
            System.out.println("El número " + anio + " es bisiesto");
            
        } else {
            System.out.println("El número " + anio + " NO es bisiesto");
        }
    }
    
    // Creo un método que calcule si un número ingresado es bisiesto
    public static boolean numBisiesto(int anio){
            
        if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)){
            return true;
        }
        else {
                return false;
        }
    }
}
// Pueba de commit
    

