
package _05_UML_Basico.Ejercicio12;


public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    public void mostrarContribuyente(){
        if(contribuyente != null){
            System.out.println("El impuesto de $" + monto + " corresponde a " + contribuyente );
        }
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=$" + monto + '}';
    }
    
    
}
