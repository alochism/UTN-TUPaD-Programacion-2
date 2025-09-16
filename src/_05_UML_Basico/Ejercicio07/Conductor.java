/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_UML_Basico.Ejercicio07;

/**
 *
 * @author Matias
 */
public class Conductor {

    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarVehiculo() {
        if (vehiculo != null) {
            System.out.println("El conductor " + nombre + " maneja un " + vehiculo.getMotor().getTipo());
        } else {
            System.out.println("El conductor no tiene vehículo asignado.");
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre='" + nombre + "', licencia='" + licencia + "', vehiculo=" + vehiculo.getMotor().getTipo() + '}';
    }
}
