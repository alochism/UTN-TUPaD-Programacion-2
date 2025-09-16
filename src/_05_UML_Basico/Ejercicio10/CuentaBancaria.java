
package _05_UML_Basico.Ejercicio10;


public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;     // Composición
    private Titular titular;          // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion); // Composición
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public void mostrarDatos() {
        System.out.println("Cuenta CBU: " + cbu + " - Saldo: $" + saldo);
        System.out.println("Clave: " + clave.getCodigo() + " (última modificación: " + clave.getUltimaModificacion() + ")");
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")");
        } else {
            System.out.println("Titular no asignado");
        }
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public String getCbu() {
        return cbu;
    }
    
}
