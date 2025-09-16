/*

7. Vehículo - Motor - Conductor
a. Agregación: Vehículo → Motor
b. Asociación bidireccional: Vehículo ↔ Conductor
Clases y atributos:
i. Vehículo: patente, modelo
ii. Motor: tipo, numeroSerie
iii. Conductor: nombre, licencia

*/

package _05_UML_Basico.Ejercicio07;

public class Ejercicio07_Main {

    public static void main(String[] args) {
        // Motor: Agregación
        Motor motor1 = new Motor("Diesel 2.0", "TD-87435");

        // Vehículo
        Vehiculo vehiculo1 = new Vehiculo("ADX753", "Toyota SW4", motor1);

        // Conductor: Asociación bidireccional
        Conductor conductor1 = new Conductor("Emanuel Ricci", "F83292818");

        // Enlazo la relación bidireccional
        vehiculo1.setConductor(conductor1);

        // Validaciones de relaciones
        System.out.println(vehiculo1); // Debería mostrar el conductor y el motor
        System.out.println(conductor1); // Debería mostrar el vehículo

        vehiculo1.mostrarMotor();
        conductor1.mostrarVehiculo();
    }
}