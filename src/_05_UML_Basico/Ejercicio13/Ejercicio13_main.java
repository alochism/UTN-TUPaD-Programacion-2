/*

13. GeneradorQR - Usuario - CódigoQR
a. Asociación unidireccional: CódigoQR → Usuario
b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i. CodigoQR: valor.
ii. Usuario: nombre, email.
iii. GeneradorQR->método: void generar(String valor, Usuario usuario)

 */
package _05_UML_Basico.Ejercicio13;


public class Ejercicio13_main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Daniel Vis", "danivis@gmail.com");
        GeneradorQR qr1 = new GeneradorQR();
        qr1.generar("esto es un código QR", u1);
    
        System.out.println(u1);
    }
    
    
}
