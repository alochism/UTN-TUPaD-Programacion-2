package _05_UML_Basico.Ejercicio02;

public class Bateria {

    private String modelo;
    private double capacidad;

    public Bateria(String modelo, double capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    

}
