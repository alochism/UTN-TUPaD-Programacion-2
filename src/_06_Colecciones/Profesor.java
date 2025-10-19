package _06_Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    // Atributos
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters mínimos
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }

    // Agrego un curso y sincronizo el otro lado
    public void agregarCurso(Curso c) {
        System.out.println("Sumo un curso a " + this.nombre + ": " + c.getCodigo());
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        // Si el curso no me tiene asignado, lo sincronizo
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    // Quito un curso y sincronizo el otro lado
    public void eliminarCurso(Curso c) {
        System.out.println("Elimino el curso " + c.getCodigo() + " de " + this.nombre);
        if (cursos.contains(c)) {
            cursos.remove(c);
        }
        // Si el curso todavía me señala, lo dejo sin profesor
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    // Listo los cursos del profesor
    public void listarCursos() {
        System.out.println("Cursos de " + this.nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    // Muestro info resumida
    public void mostrarInfo() {
        System.out.println("Profesor {id='" + id + "', nombre='" + nombre +
                "', especialidad='" + especialidad + "', cursos=" + cursos.size() + "}");
    }
}
