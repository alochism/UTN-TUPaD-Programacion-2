package _05_UML_Basico.Ejercicio07;

public class Vehiculo {

    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public void mostrarMotor() {
        if (motor != null) {
            System.out.println("El vehículo " + modelo + " tiene motor " + motor.getTipo());
        } else {
            System.out.println("El vehículo no tiene motor asignado.");
        }
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente='" + patente + "', modelo='" + modelo + "', motor=" + motor + ", conductor=" + conductor.getNombre() + '}';
    }
}


