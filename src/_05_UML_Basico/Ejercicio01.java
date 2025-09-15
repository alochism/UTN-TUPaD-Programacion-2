/*

1. Pasaporte - Foto - Titular
a. Composición: Pasaporte → Foto
b. Asociación bidireccional: Pasaporte ↔ Titular
Clases y atributos:
i. Pasaporte: numero, fechaEmision
ii. Foto: imagen, formato
iii. Titular: nombre, dni
 
 */
package _05_UML_Basico;

public class Ejercicio01 {

    public static void main(String[] args) {
        // Pasaporte crea su propia Foto internamente
        Pasaporte pasaporte = new Pasaporte("AA99999", "09-10-2005", "esteban.jpg", "jpg");

        // Asociación bidireccional: Pasaporte - Titular
        Titular titular = new Titular("Esteban Juvinovich", "30879524");
        titular.setPasaporte(pasaporte);

        // Mostrar relaciones
        System.out.println("Titular: " + titular.getNombre() + ", DNI: " + titular.getDni());
        System.out.println("Pasaporte desde el titular -" + titular.getNombre() + "-  es: " + titular.getPasaporte().getNumero());
        System.out.println("Foto asociada: " + pasaporte.getFoto().getImagen()
                + " (" + pasaporte.getFoto().getFormato() + ")");
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte desde pasaporte es: " + pasaporte.getNumero());

       
    }
}


