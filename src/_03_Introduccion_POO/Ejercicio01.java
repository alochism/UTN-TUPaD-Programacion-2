/*

1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.

 */
package _03_Introduccion_POO;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Instancio el primer objeto de la clase Estudiante
        Estudiante es1 = new Estudiante();

        // Muestro la información y luego seteo los nuevos parámetros mediante los métodos creados
        es1.mostrarInfo();
        es1.setNombre("Juan");
        es1.setApellido("Palotes");
        es1.setCurso("7° B");
        es1.setCalificacion(7.9);

        // Muestor la información nuevamente para ver los cambios
        es1.mostrarInfo();

        // Subo y bajo la calificación y se muestra por consola
        es1.subirCalificacion(2);
        System.out.println("Calificación subida: " + es1.getCalificacion());

        es1.bajarCalificacion(5);
        System.out.println("Calificación bajada: " + es1.getCalificacion());

        es1.mostrarInfo();
    }

}
