package _05_UML_Basico.Ejercicio05;

// RELACIÓN: Asociación bidireccional con Computadora
public class Propietario {

    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        String ns = (computadora != null) ? computadora.getNumeroSerie() : "Sin computadora";
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "', nroSerie=" + ns + "}";
    }
}
