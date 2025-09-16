/*

8. Documento - FirmaDigital - Usuario
a. Composición: Documento → FirmaDigital
b. Agregación: FirmaDigital → Usuario
Clases y atributos:
i. Documento: titulo, contenido
ii. FirmaDigital: codigoHash, fecha
iii. Usuario: nombre, email

 */
package _05_UML_Basico.Ejercicio08;

public class Ejercicio08_Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Lautaro Ciriaco", "lciriaco@mail.com");
        Documento documento1 = new Documento("Contrato de servicios", "Contenido legal del contrato...", "A1B2C3D4E5", "01-01-2025");

        documento1.asociarUsuario(usuario1);  // Asocia el usuario a través de la firma

        documento1.mostrarDetalle();

        System.out.println("");

        // Documento sin usuario
        Documento documento2 = new Documento("Acta", "Acta de reunión...", "Z9Y8X7W6V5", "02-09-2025");
        documento2.mostrarDetalle();
    }
}