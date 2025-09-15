/*

2. Celular - Batería - Usuario
a. Agregación: Celular → Batería
b. Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i. Celular: imei, marca, modelo
ii. Batería: modelo, capacidad
iii. Usuario: nombre, dni

 */
package _05_UML_Basico.Ejercicio02;

public class Ejercicio02_Main {

    public static void main(String[] args) {
        Bateria bata1 = new Bateria("BAT001", 4000.0);
        Usuario usuario1 = new Usuario("Juan Chapan", "34320104");
        Celular celu1 = new Celular(77849, "Motorola", "Edge30", bata1);

        System.out.println("Batería 1: " + bata1.getModelo() + ", capacidad de " + bata1.getCapacidad());
        System.out.println("Usuario 1: " + usuario1.getNombre() + ", DNI " + usuario1.getDni());
        System.out.println("Celular 1: " + celu1.getMarca() + " " + celu1.getModelo() + ", Imei: " + celu1.getImei());

        usuario1.setCelular(celu1);
        celu1.setBateria(bata1);

        // Muestro relaciones
        // Asociación 1 a 1
        System.out.println("El usaurio " + celu1.getUsuario().getNombre() + ", DNI: " + celu1.getUsuario().getDni() + ", tiene un celular marca " + usuario1.getCelular().getMarca());

        // Agregación
        celu1.mostrarBateria();
        
        celu1 = null;
        System.out.println("Bateria " + bata1.getModelo() + " siguie existiendo");

    }

}
