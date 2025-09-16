/*

10. CuentaBancaria - ClaveSeguridad - Titular
a. Composición: CuentaBancaria → ClaveSeguridad
b. Asociación bidireccional: CuentaBancaria ↔ Titular
Clases y atributos:
i. CuentaBancaria: cbu, saldo
ii. ClaveSeguridad: codigo, ultimaModificacion
iii. Titular: nombre, dni.

 */
package _05_UML_Basico.Ejercicio10;

public class Ejercicio10_Main {

    public static void main(String[] args) {
        // Se crea la cuenta con su clave (composición)
        CuentaBancaria cuenta1 = new CuentaBancaria("32400145678823", 154000.50, "6892", "12-03-2025");

        // Se crea el titular y se asocia la cuenta (bidireccional)
        Titular titular1 = new Titular("Magalí Ordóñez", "27320144");
        titular1.setCuenta(cuenta1);

        System.out.println("");

        // Muestro datos desde cuenta
        cuenta1.mostrarDatos();

        System.out.println("");

        // Valioacceso desde Titular hacia Cuenta (bidireccionalidad)
        if (titular1.getCuenta() != null) {
            System.out.println("CBU desde el titular: " + titular1.getCuenta().getCbu());
        } else {
            System.out.println("El titular no tiene cuenta asignada");
        }

        System.out.println("");

        // Compruebocomposición: la clave no puede existir fuera de la cuenta
        if (cuenta1 != null && cuenta1.getClave() != null) {
            System.out.println("Clave de seguridad embebida: " + cuenta1.getClave().getCodigo());
        } else {
            System.out.println("La cuenta no contiene clave (esto no debería pasar)");
        }

        System.out.println("");

        // Muestro titular asociado desde la cuenta
        if (cuenta1.getTitular() != null) {
            System.out.println("Titular asignado: " + cuenta1.getTitular().getNombre());
        } else {
            System.out.println("No hay titular asignado a la cuenta");
        }
    }
}
