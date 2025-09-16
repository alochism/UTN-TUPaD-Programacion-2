package _05_UML_Basico.Ejercicio04;

public class Banco {

    private String nombre;
    private String cuit;
    private TarjetaDeCredito tarjetadecredito; // Agregación

    public Banco(String nombre, String cuit, TarjetaDeCredito tarjetadecredito) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.tarjetadecredito = tarjetadecredito;
    }

    public void mostrarTarjetaDeCredito() {
        if (tarjetadecredito != null) {
            System.out.println("El banco " + nombre + " tiene la tarjeta: " + tarjetadecredito.getNumero());

        } else {
            System.out.println("El banco " + nombre + " no tiene una tarjega asociada.");
        }
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + tarjetadecredito + '}';
    }

}
