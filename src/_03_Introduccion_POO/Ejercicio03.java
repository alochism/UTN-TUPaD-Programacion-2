/*

3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar 
la información final.

 */
package _03_Introduccion_POO;

public class Ejercicio03 {

    public static void main(String[] args) {
        // Instancio e imprimo valores
        Libro lib1 = new Libro();
        
        lib1.mostrarInfo();
        lib1.setTitulo("100 Años de Soledad");
        lib1.setAutor("Gabriel García Márquez");
        lib1.setAñoPublicacion(1967);
        
        lib1.mostrarInfo();
        
        // Valor de año inválido
        lib1.setAñoPublicacion(-200);
        lib1.mostrarInfo();
        
        // Valor de año válido
        lib1.setAñoPublicacion(2025);
        lib1.mostrarInfo();
    }
}
