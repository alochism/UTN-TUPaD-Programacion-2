package _05_UML_Basico.Ejercicio02;

public class Celular {

    private int imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(int imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }

    }

    public void mostrarBateria() {
        if (bateria != null) {
            System.out.println("El celular " + modelo + " tiene una batería " + bateria.getModelo());
        } else {
            System.out.println("El celular " + modelo + " no tiene una batería incluída.");
        }

    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

}
