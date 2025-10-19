package _06_Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Altas
    public void agregarProfesor(Profesor p) {
        System.out.println("Sumo un profesor: " + p.getNombre());
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        System.out.println("Sumo un curso: " + c.getCodigo() + " - " + c.getNombre());
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // Listados
    public void listarProfesores() {
        System.out.println("\nProfesores en " + nombre + ":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos en " + nombre + ":");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Búsquedas simples
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    // Asignar profesor a curso (setProfesor del curso)
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        System.out.println("Asigno profesor " + idProfesor + " al curso " + codigoCurso);
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p); // sincroniza ambos lados
        } else {
            System.out.println("No encuentro profesor o curso para asignar.");
        }
    }

    // Bajas con mantenimiento de la relación
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            System.out.println("Elimino el curso " + codigo);
            // Rompo relación con su profesor si la hubiera
            if (c.getProfesor() != null) {
                c.setProfesor(null); // esto lo quita de la lista del profe
            }
            cursos.remove(c);
        } else {
            System.out.println("No encuentro el curso " + codigo + " para eliminar.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            System.out.println("Elimino al profesor " + p.getNombre());
            // Dejo profesor = null en todos los cursos que dictaba
            // (copio a lista auxiliar para evitar modificar mientras recorro)
            List<Curso> aux = new ArrayList<>(p.getCursos());
            for (Curso c : aux) {
                c.setProfesor(null);
            }
            profesores.remove(p);
        } else {
            System.out.println("No encuentro el profesor " + id + " para eliminar.");
        }
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("\nReporte: cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}
