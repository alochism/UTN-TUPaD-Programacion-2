package _05_UML_Basico.Ejercicio05;

// RELACIONES:
// - Composición con PlacaMadre (se crea adentro, no hay setPlacaMadre)
// - Asociación bidireccional con Propietario (setters sincronizados)
public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // composición
    private Propietario propietario;      // asociación bidireccional

    // Composición: creo la PlacaMadre adentro
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    // Validación simple de null para mostrar info
    public void mostrarPlacaMadre() {
        if (placaMadre != null) {
            System.out.println("Computadora " + marca + " (" + numeroSerie + ") usa " + placaMadre);
        } else {
            System.out.println("Computadora " + marca + " sin placa madre (inconsistente).");
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    @Override
    public String toString() {
        String nom = (propietario != null) ? propietario.getNombre() : "Sin propietario";
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie
                + "', placaMadre=" + placaMadre + ", propietario=" + nom + "}";
    }
}
