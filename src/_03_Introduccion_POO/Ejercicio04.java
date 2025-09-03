/*

4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.

*/
package _03_Introduccion_POO;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        // Instancio las dos gallinas
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        // Muestro estado inicial
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Seteo valores iniciales
        g1.setIdGallina(101);
        g1.setEdad(2);
        g1.setHuevosPuestos(5);

        g2.setIdGallina(202);
        g2.setEdad(1);
        g2.setHuevosPuestos(0);

        // Muestro estado luego de setear
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simulo envejecer y poner huevos
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        // Estado final
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}