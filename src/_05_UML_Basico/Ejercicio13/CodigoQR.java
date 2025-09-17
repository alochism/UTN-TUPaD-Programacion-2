
package _05_UML_Basico.Ejercicio13;


public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void mostrarUsuario(){
        if (usuario != null){
            System.out.println(usuario.getNombre() + " tiene asociado el QR " + valor);
        }
    }

    public String getValor() {
        return valor;
    }
    
}
