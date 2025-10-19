package _06_Colecciones;

public class Ejercicio2_Main {
    public static void main(String[] args) {
        System.out.println("== Comienzo del ejercicio Universidad / Profesor / Curso ==");

        // Creo al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P-01", "Juan A", "Programación");
        Profesor prof2 = new Profesor("P-02", "Juan B", "Sistemas");
        Profesor prof3 = new Profesor("P-03", "María A", "Bases de Datos");

        Curso c1 = new Curso("PRG1", "Progra 1");
        Curso c2 = new Curso("PRG2", "Progra 2");
        Curso c3 = new Curso("SIS1", "Sistemas 1");
        Curso c4 = new Curso("BD1",  "BD 1");
        Curso c5 = new Curso("RED1", "Redes 1");

        // Agrego profesores y cursos a la universidad
        Universidad uni = new Universidad("UTN - Demo");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asigno profesores a cursos usando asignarProfesorACurso
        uni.asignarProfesorACurso("PRG1", "P-01"); // Juan A
        uni.asignarProfesorACurso("PRG2", "P-01"); // Juan A
        uni.asignarProfesorACurso("SIS1", "P-02"); // Juan B
        uni.asignarProfesorACurso("BD1",  "P-03"); // María A
        uni.asignarProfesorACurso("RED1", "P-02"); // Juan B

        // Listo cursos con su profesor y profesores con sus cursos
        System.out.println("\n--- Listo cursos con su profesor ---");
        uni.listarCursos();
        System.out.println("\n--- Listo profesores con sus cursos ---");
        uni.listarProfesores();

        // Cambio el profesor de un curso y verifico sincronización
        System.out.println("\nCambio el profesor de PRG2 a María A (P-03)");
        uni.asignarProfesorACurso("PRG2", "P-03");
        // Verifico si el curso muestra nuevo profesor y las listas quedan bien
        uni.listarCursos();
        uni.listarProfesores();

        // Remuevo un curso y confirmo que ya no aparece en la lista del profesor
        System.out.println("\nRemuevo el curso SIS1");
        uni.eliminarCurso("SIS1");
        uni.listarProfesores(); // Juan B debería tener uno menos

        // Remuevo un profesor y dejo profesor=null en los cursos que dictaba
        System.out.println("\nRemuevo al profesor Juan A (P-01)");
        uni.eliminarProfesor("P-01");
        uni.listarCursos(); // Los cursos de Juan A quedan sin profesor

        // Muestro reporte: cantidad de cursos por profesor
        uni.reporteCursosPorProfesor();

        System.out.println("== Fin del ejercicio ==");
    }
}
