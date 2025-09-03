/*

1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.

 */
package _03_Introduccion_POO;

// Creo la clase Estudiante
public class Estudiante {

    // Creo los parámetros de la clase con los modificadores de acceso como privados para que no se pueda modificar si no es mediante un método
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Genero los getters para poder ver cada atributo por separado en el main
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Genero los setters para poder setear cada atributo por separado en el main
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            nombre = nuevoNombre;
        }

    }

    public void setApellido(String nuevoApellido) {
        if (nuevoApellido != null) {
            apellido = nuevoApellido;
        }
    }

    public void setCurso(String nuevoCurso) {
        if (nuevoCurso != null) {
            curso = nuevoCurso;
        }
    }

    public void setCalificacion(double nuevaCalificacion) {
        if (nuevaCalificacion != 0) {
            calificacion = nuevaCalificacion;
        }

    }

    // Creo el método para que muestre toda la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Curso: " + curso + "\n" + "Calificación" + calificacion);
    }

    // Creo el método para que suba la calificación 
    public void subirCalificacion(double num) {
        if (num >= 0) {
            calificacion += num;

        }
    }

    // Creo el método para que baje la calificación
    public void bajarCalificacion(double num) {
        if (num >= 0) {
            calificacion -= num;
        }
    }

}
