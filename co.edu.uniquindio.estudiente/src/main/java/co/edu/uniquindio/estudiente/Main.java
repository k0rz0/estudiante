package co.edu.uniquindio.estudiente;

import co.edu.uniquindio.estudiente.model.Estudiante;

public class Main {
    public static void main(String[] args) {

        //Creación de estudiantes
        Estudiante estudiante0 = new Estudiante();
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        //Inicializamos los estudiantes
        inicializarEstudiantes(estudiante0, estudiante1, estudiante2);

        //Se calcula el promedio de las notas de los estudiantes
        double promedioEstudiante0 = calcularDefinitivaEstudiante(estudiante0.getPrimeraNota(), estudiante0.getSegundaNota(), estudiante0.getTerceraNota());
        double promedioEstudiante1 = calcularDefinitivaEstudiante(estudiante1.getPrimeraNota(), estudiante2.getSegundaNota(), estudiante1.getTerceraNota());
        double promedioEstudiante2 = calcularDefinitivaEstudiante(estudiante2.getPrimeraNota(), estudiante2.getSegundaNota(), estudiante2.getTerceraNota());

        double promedioCurso = calcularPromedioCurso(promedioEstudiante0, promedioEstudiante1, promedioEstudiante2);
        double promedioEdad = calcularPromedioEdad(estudiante0.getEdad(), estudiante1.getEdad(), estudiante2.getEdad());
        double promedioNota1 = calcularPromedioNota1(estudiante0.getPrimeraNota(), estudiante1.getPrimeraNota(), estudiante2.getPrimeraNota());

    }

    private static void inicializarEstudiantes(Estudiante estudiante0, Estudiante estudiante1, Estudiante estudiante2) {

        estudiante0.setNombre("Juan");
        estudiante0.setEdad(17);
        estudiante0.setCorreo("juan@mail.com");
        estudiante0.setSemestre(3);
        estudiante0.setPrimeraNota(3);
        estudiante0.setSegundaNota(3.5);
        estudiante0.setTerceraNota(4.5);

        estudiante1.setNombre("Maria");
        estudiante1.setEdad(15);
        estudiante1.setCorreo("pepita@mail.com");
        estudiante1.setSemestre(1);
        estudiante1.setPrimeraNota(2);
        estudiante1.setSegundaNota(2.5);
        estudiante1.setTerceraNota(4.5);

        estudiante2.setNombre("Pepe");
        estudiante2.setEdad(20);
        estudiante2.setCorreo("pepe@mail.com");
        estudiante2.setSemestre(4);
        estudiante2.setPrimeraNota(4);
        estudiante2.setSegundaNota(2.5);
        estudiante2.setTerceraNota(4.5);

    }

    private static double calcularDefinitivaEstudiante(double primeraNota, double segundaNota, double terceraNota) {
        return (primeraNota + segundaNota + terceraNota) / 3;
    }

    private static double calcularPromedioCurso(double promedioEstudiante0, double promedioEstudiante1, double promedioEstudiante2) {
        return (promedioEstudiante0 + promedioEstudiante1 + promedioEstudiante2) / 3;
    }

    private static double calcularPromedioEdad(double promedioEstudiante0, double promedioEstudiante1, double promedioEstudiante2) {
        return (promedioEstudiante0 + promedioEstudiante1 + promedioEstudiante2) / 3;
    }

    private static double calcularPromedioNota1(double primeraNota0, double primeraNota1, double primeraNota2) {
        return (primeraNota0 + primeraNota1 + primeraNota2) / 3;
    }
}