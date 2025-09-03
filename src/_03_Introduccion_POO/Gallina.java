/*

4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.

*/
package _03_Introduccion_POO;

// Creo la clase Gallina
public class Gallina {
    
    // Atributos privados para mantener el encapsulamiento
    private int idGallina;
    private int edad;            
    private int huevosPuestos;   

    // Getters para ver cada atributo por separado en el main
    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    // Setters para poder setear desde el main
    public void setIdGallina(int nuevoId) {
        if (nuevoId > 0) {
            idGallina = nuevoId;
        }
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            edad = nuevaEdad;
        }
    }

    public void setHuevosPuestos(int nuevoTotal) {
        if (nuevoTotal >= 0) {
            huevosPuestos = nuevoTotal;
        }
    }

    // Aumenta la edad en 1 año
    public void envejecer() {
        edad += 1;
    }

    // Suma un huevo puesto
    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    // Muestra el estado actual de la gallina
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina + "\n" + "Edad: " + edad + "\n" + "Huevos puestos: " + huevosPuestos);
    }
}