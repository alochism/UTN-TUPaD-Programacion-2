/*

5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar 
correctamente. Mostrar el estado al final.

 */
package _03_Introduccion_POO;

public class NaveEspacial {

    //Atributos
    private String nombre;
    private double combustible;

    // Setters y getters
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void setCombustible(int combustible) {
        if (combustible != 0 && combustible <= LIMITE_TANQUE) {
            this.combustible = combustible;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    // Métodos
    // Despegar: para despegar necesita 60 unidades de combustible
    public boolean despegar() {
        if (combustible >= 60) {
            combustible -= 60;
            return true;
        }
        return false;
    }

    // Avanzar calcula si alcanza el combustible para recorrer la distancia que ingresa como argumento. 
    //Para 100 unidades de distancia se necesitan 50 unidades de combusitble
    public double avanzar(double distancia) {
        double necesario = distancia * 0.5;
        if (combustible >= necesario) {
            combustible -= necesario;
            
            return distancia;

        } else {
            return 0;
        }
    }
    // Recarga combustible, tanque máximo: 200 unidades de combustible
    private final int LIMITE_TANQUE = 200;

    public void recargarCombustible(double recarga) {
        if (recarga + combustible >= LIMITE_TANQUE) {
            combustible = LIMITE_TANQUE;
        } else {
            combustible += recarga;
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + "\n" + "Combustible: " + combustible);
    }
}
