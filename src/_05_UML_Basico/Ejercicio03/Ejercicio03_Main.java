/*

3.Libro - Autor - Editorial
a. Asociación unidireccional: Libro → Autor
b. Agregación: Libro → Editorial
Clases y atributos:
i. Libro: titulo, isbn
ii. Autor: nombre, nacionalidad
iii. Editorial: nombre, direccion

 */
package _05_UML_Basico.Ejercicio03;

public class Ejercicio03_Main {

    public static void main(String[] args) {
        Libro l1 = new Libro("El hombre que calculaba", "654354354654", null);
        Editorial e1 = new Editorial("La Flor", "Calle Corrientes 390");
        Autor a1 = new Autor("Juan Escritor", "Argentino");

        System.out.println(l1);
        System.out.println(e1);
        System.out.println(a1);

        System.out.println("");
        l1.setAutor(a1);
        l1.setEditorial(e1);
        System.out.println(l1);

        Editorial e2 = new Editorial("Gamma", "Juan B. Justo 122");
        Libro l2 = new Libro("Dos caminos", "999555444999", e2);
        Autor a2 = new Autor("Daniel Gomez", "Uruguayo");
        
        System.out.println("");
        System.out.println(l2);
        l2.setAutor(a2);
        System.out.println("");
        System.out.println(l2);
        System.out.println("");
        
        l1.mostrarAutor();
        l2.mostrarEditorial();
    }
}
