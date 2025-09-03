/*

5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar 
correctamente. Mostrar el estado al final.
 
 */
package _03_Introduccion_POO;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Instancio
        NaveEspacial ne1 = new NaveEspacial();
        System.out.println("Instancia inicial:");
        ne1.mostrarEstado();
        ne1.setNombre("Futurama");
        ne1.setCombustible(50);
        System.out.println("\nInstancia seteada:");
        ne1.mostrarEstado();

        // LLamo a la función Intento Despegar
        System.out.println("\nPrimer intento de despegue y avance 100 unidades:");
        intentoDespegue(ne1);

        // Recargo combustible
        ne1.recargarCombustible(10);
        System.out.println("\nSegundo intento de despegue y avance 100 unidades:");
        intentoDespegue(ne1);

        // Recargo combustible
        ne1.recargarCombustible(100);
        System.out.println("\nTercer intento de despegue y avance 100 unidades:");
        intentoDespegue(ne1);
        
         // Recargo combustible
        ne1.recargarCombustible(1000);
        System.out.println("\nCuarto intento de despegue y avance 100 unidades:");
        intentoDespegue(ne1);

    }

    // Intento despegar y si despega intenta avanzar 100 unidades
    public static void intentoDespegue(NaveEspacial ne1) {
        if (ne1.despegar()) {
            System.out.println("Despegue exitoso!");
            // Intento avanzar distancia 100
            // Genero variable para que indique cuanto avanzó
            double recorrido = ne1.avanzar(100); // 
            if (recorrido > 0) {
                System.out.println("La nave avanzó " + recorrido + "unidades");

            } else {
                System.out.println("Combustible insuficiente para avanzar.");
            }
        } else {
            System.out.println("Error. Faltan " + (60 - ne1.getCombustible()) + "unidades de combustible para despegar");
        }

        ne1.mostrarEstado();
    }
}
