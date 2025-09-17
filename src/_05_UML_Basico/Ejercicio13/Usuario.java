
package _05_UML_Basico.Ejercicio13;


public class Usuario {
    private String nombre;
    private String mail;

    public Usuario(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", mail=" + mail + '}';
    }
    
    
    
}
