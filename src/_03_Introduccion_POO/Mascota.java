/*

2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.

 */
package _03_Introduccion_POO;

public class Mascota {

    private String nombre;
    private String especie;
    private double edad;

   
    // Genero los setters para poder instanciar la mascota
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            nombre = nuevoNombre;
        }
    }

    public void setEspecie(String nuevaEspecie) {
        if (nuevaEspecie != null) {
            especie = nuevaEspecie;
        }
    }

    public void setEdad(double nuevaEdad) {
        if (nuevaEdad != 0) {
            edad = nuevaEdad;
        }
    }
    
    // Método para paso de los años
    public void pasanAños(double num) {
        if (num > 0) {
            edad += num;

        }
    }
    
    // Método para mostrar toda la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + "\n" + "Especie: " + especie + "\n" + "Edad: " + edad);
    }
}
