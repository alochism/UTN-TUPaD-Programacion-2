/*

4. TarjetaDeCrédito - Cliente - Banco
a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
b. Agregación: TarjetaDeCrédito → Banco
Clases y atributos:
i. TarjetaDeCrédito: numero, fechaVencimiento
ii. Cliente: nombre, dni
iii. Banco: nombre, cuit

 */
package _05_UML_Basico.Ejercicio04;

public class Ejercicio04_Main {

    public static void main(String[] args) {
        TarjetaDeCredito visa = new TarjetaDeCredito("1234-5645", "22/05/2028");
        Banco banco1 = new Banco("Banco Nación", "18-3214532-9", visa);
        Cliente cliente1 = new Cliente("Roberto Stich", "27444111");

        cliente1.setTarjetadecredito(visa);

        banco1.mostrarTarjetaDeCredito();

        System.out.println(visa);
        System.out.println(banco1);
        System.out.println(cliente1);

        Banco banco2 = new Banco("Banco Nación", "18-3214532-9", null);

        System.out.println(banco2);
    }
}
