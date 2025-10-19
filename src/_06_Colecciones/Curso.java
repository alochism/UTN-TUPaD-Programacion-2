package _06_Colecciones;

public class Curso {
    // Atributos
    private String codigo;
    private String nombre;
    private Profesor profesor; // 1 profesor responsable

    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters mínimos
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Asigno/cambio profesor y sincronizo ambos lados
    public void setProfesor(Profesor p) {
        // Si no hay cambio, no hago nada
        if (this.profesor == p) {
            return;
        }

        // Si tenía profesor previo, me quito de su lista
        if (this.profesor != null) {
            // Uso el getter para acceder a la lista y removerme
            if (this.profesor.getCursos().contains(this)) {
                this.profesor.getCursos().remove(this);
            }
        }

        // Actualizo mi referencia
        this.profesor = p;

        // Si tengo nuevo profesor, me aseguro de estar en su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
        
    }

    // Muestra datos del curso
    public void mostrarInfo() {
        String nomProf = (profesor != null) ? profesor.getNombre() : "sin profesor";
        System.out.println("Curso {codigo='" + codigo + "', nombre='" + nombre +
                "', profesor='" + nomProf + "'}");
    }
}
