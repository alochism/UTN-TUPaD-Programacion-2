
package _05_UML_Basico.Ejercicio09;


public class CitaMedica {

    private String fecha;
    private String hora;
    private Paciente paciente;         // Asociación unidireccional
    private Profesional profesional;   // Asociación unidireccional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void mostrarDetalle() {
        System.out.println("Cita médica para el día " + fecha + " a las " + hora);
        
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.getNombre() + " - Obra social: " + paciente.getObraSocial());
        } else {
            System.out.println("Paciente no asignado");
        }

        if (profesional != null) {
            System.out.println("Profesional: " + profesional.getNombre() + " - Especialidad: " + profesional.getEspecialidad());
        } else {
            System.out.println("Profesional no asignado");
        }
    }
}