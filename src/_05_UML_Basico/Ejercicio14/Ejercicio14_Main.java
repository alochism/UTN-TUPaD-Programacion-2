/*

14. EditorVideo - Proyecto - Render
a. Asociación unidireccional: Render → Proyecto
b. Dependencia de creación: EditorVideo.exportar(String, Proyecto)
c. Clases y atributos:
i. Render: formato.
ii. Proyecto: nombre, duracionMin.
iii. EditorVideo->método: void exportar(String formato, Proyecto proyecto)

 */
package _05_UML_Basico.Ejercicio14;

public class Ejercicio14_Main {

    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("La casa del árbol", 120.8);
        EditorVideo e1 = new EditorVideo();
        e1.exportar("MP4", p1);

        e1.exportar("MP5", p1);
    }

}
