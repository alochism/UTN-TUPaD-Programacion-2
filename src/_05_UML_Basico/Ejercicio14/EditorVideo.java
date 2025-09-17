package _05_UML_Basico.Ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render r1 = new Render(formato);
        System.out.println("El proyecto " + proyecto + " ha sido renderizaco a: " + formato);
    }

}
