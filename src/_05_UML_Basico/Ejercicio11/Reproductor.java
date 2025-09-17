package _05_UML_Basico.Ejercicio11;

public class Reproductor {

    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Se está reproduciendo: " + cancion.getTitulo());
        } else {
            System.out.println("No hay canción para reproducir");
        }

    }
}
