package _05_UML_Basico.Ejercicio07;

public class Motor {

    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo='" + tipo + "', numeroSerie='" + numeroSerie + "'}";
    }
}
