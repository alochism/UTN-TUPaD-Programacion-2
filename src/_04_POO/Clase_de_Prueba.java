package _04_POO;

public class Clase_de_Prueba {

    public static void main(String[] args) {

        // Instancio varios usando CONSTRUCTOR1
        Empleado emp1 = new Empleado(101, "Juan Domingo", "Programador Junior", 200000);
        Empleado emp2 = new Empleado(112, "Juan Sábado", "Programador Senior", 400000);
        Empleado emp3 = new Empleado(431, "Juan Lunes", "Team Leader", 600000);
        
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        System.out.println("El total de empleados es: " + Empleado.mostrarTotalEmpleados());

        // Instancio varios usando CONSTRUCTOR2
        Empleado emp4 = new Empleado("Juan Martes", "Debugger");
        Empleado emp5 = new Empleado("Juan Miércoles", "RRHH");
        Empleado emp6 = new Empleado("Juan Jueves", "Scrum Leader");
        
        
        System.out.println(emp4);
        System.out.println(emp5);
        System.out.println(emp6);
        
        System.out.println("El total de empleados es: " + Empleado.mostrarTotalEmpleados());
        
        // Uso método para cambiar salario porcentual
        emp1.actualizarSalario(25.0);
        System.out.println("Nuevo salario: " + emp1.getSalario());
        
        // Uso método para cambiar salario monto fijo
        emp5.actualizarSalario(150000);
        System.out.println("Nuevo salario: " + emp5.getSalario());
    }
    
        
}

