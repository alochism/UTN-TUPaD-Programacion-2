/*

11. Reproductor - Canción - Artista
a. Asociación unidireccional: Canción → Artista
b. Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos:
i. Canción: titulo.
ii. Artista: nombre, genero.
iii. Reproductor->método: void reproducir(Cancion cancion)

 */
package _05_UML_Basico.Ejercicio11;


public class Ejercicio11_Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Hush");
        Artista art1 = new Artista("Deep Purple", "Rock");
        Reproductor rep = new Reproductor();
        rep.reproducir(cancion);
        
        cancion.setArtista(art1);
        cancion.mostrarArtista();
        
    }
    
    }
    
    

    

