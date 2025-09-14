/*
Sistema de Gestión de Empleados
Modelar una clase Empleado que represente a un trabajador en una empresa.
Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso
de atributos aplicando encapsulamiento y métodos estáticos para llevar control de los
objetos creados.
CLASE EMPLEADO
Atributos:
● int id: Identificador único del empleado.
● String nombre: Nombre completo.
● String puesto: Cargo que desempeña.
● double salario: Salario actual.
● static int totalEmpleados: Contador global de empleados creados.
 */
package _04_POO;

public class Empleado {

    private int id; //Identificador únioo del empleado.
    private String nombre; //Nombre complet
    private String puesto; //Cargo que desempeña.
    private double salario; //Salario actual.
   

    // Atributo de clase
    private static int totalEmpleados = 0;  //Contador de empleados creados.
    private static final int SALARIO_BASE = 500000;
    // CONTADOR de id
    private static int siguienteId = 100;

    // CONSTRUCTOR 1 Recibe todos los atributos como parámetros e incrementa la cantidad de Empleados
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        if (id >= siguienteId) {
            siguienteId = id + 1;
        }
    }

    // CONSTRUCTOR 2 Recibe solo nombre y puesto, asigna id automáticos y salario por defecto. Incrementa # Empleados
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.salario = SALARIO_BASE;
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = siguienteId++;
    }

    // MÉTODO Actualizar Salario
    public void actualizarSalario(double porcentaje) {
        if (porcentaje != 0) {
            this.salario = this.salario + (this.salario * (porcentaje / 100.0));
        }
    }

    // MÉTODO 2 Actualizar Salario
    public void actualizarSalario(int valorFijo) {
        if (valorFijo != 0) {
            this.salario = this.salario + valorFijo;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    // MÉTODO mostrarTotalEmpleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;

    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
