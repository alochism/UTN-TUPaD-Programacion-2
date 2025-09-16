
package _05_UML_Basico.Ejercicio08;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma;  // Composición

    public Documento(String titulo, String contenido, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha); // Composición: se crea dentro del constructor
    }

    public void asociarUsuario(Usuario usuario) {
        if (firma != null) {
            firma.setUsuario(usuario);
        }
    }

    public void mostrarDetalle() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        if (firma != null) {
            System.out.println("Firma Digital: " + firma.getCodigoHash() + " (Fecha: " + firma.getFecha() + ")");
            if (firma.getUsuario() != null) {
                System.out.println("Firmado por: " + firma.getUsuario().getNombre() + " - Email: " + firma.getUsuario().getEmail());
            } else {
                System.out.println("Usuario no asignado a la firma.");
            }
        } else {
            System.out.println("No tiene firma digital.");
        }
    }
}