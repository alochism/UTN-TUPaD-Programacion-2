/*

4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final

 */
package _02_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner (System.in);
        
        int precio;
        
        double valorfinal;
        
        String descuento;
        
        char categoria;
       
        
        System.out.print("Ingrese el precio del producto: ");
        
        precio = input.nextInt();
        
        System.out.print("Ingrese la categoría del producto: (A, B o C): ");
        
        categoria = input.next().charAt(0);
        
        if (categoria == 'A'){
            
            valorfinal = precio * 0.9;
            
            descuento = "10%";
            
        } else if (categoria == 'B'){
            
            valorfinal = precio * 0.85;
            
            descuento = "15%";
            
        } else if (categoria == 'C') {
    
            valorfinal = precio * 0.8;
            
            descuento = "20%";
            
        } else {
            
            System.out.println("No se aplican descuentos");
            
            valorfinal = precio;
            
            descuento = "0%";
            
        }
        
        System.out.println("Valor original: " + precio);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.print("Valor con descuento: " + valorfinal);
    }
}

