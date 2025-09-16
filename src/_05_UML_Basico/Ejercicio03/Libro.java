package _05_UML_Basico.Ejercicio03;

public class Libro {

    private String titulo;
    private String isbn;
    private Editorial editorial; // Agregación
    private Autor autor; // Asociación 1 a 1 unidireccional

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void mostrarEditorial() {
        if (editorial != null) {
            System.out.println("El libro " + titulo + " pertenece a la editorial " + editorial.getNombre());
        } else {
            System.out.println("El libro " + titulo + " no pertenece a ninguna editorial");
        }

    }

    public void mostrarAutor() {
        if(autor != null){
            System.out.println("El libro " + titulo + " fue escrito por " + autor.getNombre());
        }else {
            System.out.println("El libro no tiene autor asignado");
        }
       

    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo: " + titulo + ", isbn: " + isbn + ", editorial: " + editorial + ", autor: " + autor + '}';
    }
    

}
