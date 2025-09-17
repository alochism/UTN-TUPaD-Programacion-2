/*

12. Impuesto - Contribuyente - Calculadora
a. Asociación unidireccional: Impuesto → Contribuyente
b. Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
i. Impuesto: monto.
ii. Contribuyente: nombre, cuil.
iii. Calculadora->método: void calcular(Impuesto impuesto)

 */
package _05_UML_Basico.Ejercicio12;

public class Ejercicio12_Main {

    public static void main(String[] args) {
        Contribuyente cont1 = new Contribuyente("Daniel Orozco", "20-35465845-2");
        Impuesto imp1 = new Impuesto(458435.45);
        Calculadora calc1 = new Calculadora();
        calc1.calcular(imp1);
        
        imp1.setContribuyente(cont1);
        imp1.mostrarContribuyente();
    }
    
}
