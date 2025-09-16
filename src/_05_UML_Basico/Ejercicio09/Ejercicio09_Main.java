/*

9. CitaMédica - Paciente - Profesional
a. Asociación unidireccional: CitaMédica → Paciente,
b. Asociación unidirecciona: CitaMédica → Profesional
Clases y atributos:
i. CitaMédica: fecha, hora
ii. Paciente: nombre, obraSocial
iii. Profesional: nombre, especialidad

 */
package _05_UML_Basico.Ejercicio09;

public class Ejercicio09_Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Diego Catriel", "ISSN");
        Profesional profesional1 = new Profesional("Gabriela Mieres", "Dermatología");

        // paciente y profesional asignados
        CitaMedica cita1 = new CitaMedica("03-10-2025", "09:30");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        cita1.mostrarDetalle();

        System.out.println("");

        // solo con profesional
        CitaMedica cita2 = new CitaMedica("02-09-2025", "11:00");
        cita2.setProfesional(profesional1);
        cita2.mostrarDetalle();

        System.out.println("");

        // solo con paciente
        Paciente paciente2 = new Paciente("María Suárez", "OSDE");
        CitaMedica cita3 = new CitaMedica("11-04-20254", "14:00");
        cita3.setPaciente(paciente2);
        cita3.mostrarDetalle();

        System.out.println("");

        // sin paciente ni profesional
        CitaMedica cita4 = new CitaMedica("09-09-2025", "15:00");
        cita4.mostrarDetalle();
    }
}
