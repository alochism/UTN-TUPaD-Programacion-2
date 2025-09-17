
package _05_UML_Basico.Ejercicio13;


public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
       CodigoQR qr1 = new CodigoQR(valor);
        System.out.println("QR: " + qr1.getValor() + " y pertenece al usuario: " + usuario.getNombre());
    }
    
}
