package _05_UML_Basico.Ejercicio06;

public class Reserva {

    private String fecha;
    private String hora;
    private Mesa mesa;        // Agregación
    private Cliente cliente;  // Asociación unidireccional

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarDetalle() {
        System.out.println("Reserva para el día " + fecha + " a las " + hora);
        if (mesa != null) {
            System.out.println("Mesa Nº " + mesa.getNumero() + " (Capacidad: " + mesa.getCapacidad() + ")");
        } else {
            System.out.println("Sin mesa asignada");
        }

        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre() + " - Tel: " + cliente.getTelefono());
        } else {
            System.out.println("Cliente no asignado");
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
}
