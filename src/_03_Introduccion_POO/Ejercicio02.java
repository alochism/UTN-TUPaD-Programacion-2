/*

2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.

 */
package _03_Introduccion_POO;

public class Ejercicio02 {

    // Instancio la mascota
    public static void main(String[] args) {

        Mascota masc1 = new Mascota();
        masc1.mostrarInformacion();
        masc1.setNombre("Milo");
        masc1.setEspecie("Callejero");
        masc1.setEdad(4.5);

        masc1.mostrarInformacion();

        // Simulo paso del tiempo con el método correspondiente
        masc1.pasanAños(3);
        masc1.mostrarInformacion();

        // Pruebo la validación, no pueden pasar años negativos
        masc1.pasanAños(-2);
        masc1.mostrarInformacion();

    }

}
