package _05_UML_Basico.Ejercicio04;

public class Cliente {

    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetadecredito; // Asociación 1 a 1 bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;

    }

    public void setTarjetadecredito(TarjetaDeCredito tarjetadecredito) {
        this.tarjetadecredito = tarjetadecredito;
        if (tarjetadecredito != null && tarjetadecredito.getCliente() != this) {
            tarjetadecredito.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetadecredito() {
        return tarjetadecredito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre= " + nombre + ", dni= " + dni + "}";
    


    }
}

