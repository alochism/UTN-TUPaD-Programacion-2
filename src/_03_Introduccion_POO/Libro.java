/*

3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar 
la información final.

 */
package _03_Introduccion_POO;

public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Getters y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    // Método set con validacion de año de publicación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2025) {
            this.añoPublicacion = añoPublicacion;
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Año de Publicaicón: " + añoPublicacion);
    }

}
