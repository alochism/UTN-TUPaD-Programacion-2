/*

6. Reserva - Cliente - Mesa
a. Asociación unidireccional: Reserva → Cliente
b. Agregación: Reserva → Mesa
Clases y atributos:
i. Reserva: fecha, hora
ii. Cliente: nombre, telefono
iii. Mesa: numero, capacidad

*/
package _05_UML_Basico.Ejercicio06;

public class Ejercicio06_Main {

    public static void main(String[] args) {
        // Tercera opción pensada
        Cliente cliente1 = new Cliente("Carolina Olmos", "2994553302");
        Mesa mesa1 = new Mesa(7, 4);
        Reserva reserva1 = new Reserva("2025-09-22", "21:00", mesa1);

        reserva1.setCliente(cliente1);

        reserva1.mostrarDetalle();
        System.out.println("");
        
        // Reserva sin mesa
        Cliente cliente2 = new Cliente("Luisina Bertorello", "2995012999");
        Reserva reserva3 = new Reserva("2025-09-24", "22:00", null);
        reserva3.setCliente(cliente2);
        reserva3.mostrarDetalle();

        System.out.println("");

        // Reserva sin cliente ni mesa
        Reserva reserva4 = new Reserva("2025-09-25", "19:00", null);
        reserva4.mostrarDetalle();
    }
}
