/*
 
5. Computadora - PlacaMadre - Propietario
a. Composición: Computadora → PlacaMadre
b. Asociación bidireccional: Computadora ↔ Propietario
Clases y atributos:
i. Computadora: marca, numeroSerie
ii. PlacaMadre: modelo, chipset
iii. Propietario: nombre, dni

 */
package _05_UML_Basico.Ejercicio05;

public class Ejercicio05_Main {

    public static void main(String[] args) {

        Propietario p1 = new Propietario("Lucía Tevez", "31672540");
        Computadora c1 = new Computadora("Asus", "CMP-LM5928", "ASUS PRIME X570-P", "X570");

        // Bidireccional: enlazar en un solo lado alcanza
        p1.setComputadora(c1);

        // Mostrar relaciones
        System.out.println(p1);
        System.out.println(c1);
        c1.mostrarPlacaMadre();

        // Composición: si pierdo la referencia a c1, la PlacaMadre queda inalcanzable desde acá
        c1 = null;
        if (c1 == null) {
            System.out.println("Computadora no disponible, no puedo acceder a la placa madre desde aquí.");
        }

    }
}
