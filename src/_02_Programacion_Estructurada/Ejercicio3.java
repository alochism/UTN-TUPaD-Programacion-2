/*
 3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String [] args){
            
            Scanner input = new Scanner (System.in);
            
            int edad;
            
            System.out.print("Ingrese su edad: ");
            
            edad = input.nextInt();
            
            if (edad < 12){
                System.out.println("Niño");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("Adolescente");
            } else if (edad > 17 && edad <= 59) {
                System.out.println("Adulto");
            } else if (edad > 59) {
                System.out.println("Mayor");
            }
        }
}
