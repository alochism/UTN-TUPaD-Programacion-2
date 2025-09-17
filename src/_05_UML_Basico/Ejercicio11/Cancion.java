
package _05_UML_Basico.Ejercicio11;


public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccinoal

    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    public void mostrarArtista(){
        if (artista != null){
            System.out.println("El autor de " + titulo + " es " + artista.getNombre());
            
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
}
