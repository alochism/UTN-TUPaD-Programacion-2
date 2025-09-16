package _05_UML_Basico.Ejercicio05;

// RELACIÓN: Parte de la composición (creada dentro de Computadora)
public class PlacaMadre {

    private  String modelo;
    private  String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{modelo='" + modelo + "', chipset='" + chipset + "'}";
    }
}
