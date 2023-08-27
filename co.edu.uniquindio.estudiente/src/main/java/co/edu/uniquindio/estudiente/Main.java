package co.edu.uniquindio.estudiente;

import co.edu.uniquindio.estudiente.model.Estudiante;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        gestionEstudiante();
    }

    private static void gestionEstudiante(){
        //Creación de estudiantes
        Estudiante estudiante0 = new Estudiante();
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        //Setear los estudiantes
        setearEstudiantes(estudiante0, estudiante1, estudiante2);

        //Se calcula el promedio de las notas de los estudiantes
        DecimalFormat df = new DecimalFormat("#.0");
        double promedioEstudiante0 = calcularDefinitivaEstudiante(estudiante0.getPrimeraNota(), estudiante0.getSegundaNota(), estudiante0.getTerceraNota());
        System.out.println("Promedio Estudiante 0: "+ df.format(promedioEstudiante0));
        double promedioEstudiante1 = calcularDefinitivaEstudiante(estudiante1.getPrimeraNota(), estudiante2.getSegundaNota(), estudiante1.getTerceraNota());
        System.out.println("Promedio Estudiante 1: "+ df.format(promedioEstudiante1));
        double promedioEstudiante2 = calcularDefinitivaEstudiante(estudiante2.getPrimeraNota(), estudiante2.getSegundaNota(), estudiante2.getTerceraNota());
        System.out.println("Promedio Estudiante 2: "+ df.format(promedioEstudiante2));

        //Se calcula el promedio de las notas del curso
        double promedioCurso = calcularPromedioCurso(promedioEstudiante0, promedioEstudiante1, promedioEstudiante2);
        System.out.println("\nEl promedio del curso es de : "+ df.format(promedioCurso));

        //Se calcula el promedio de edad del curso
        double promedioEdad = calcularPromedioEdad(estudiante0.getEdad(), estudiante1.getEdad(), estudiante2.getEdad());
        System.out.println("\nEl promedio de la edad del curso es de : "+ df.format(promedioEdad));

        //Se calcula el promedio de las primeras notas del curso
        double promedioNota1 = calcularPromedioNota1(estudiante0.getPrimeraNota(), estudiante1.getPrimeraNota(), estudiante2.getPrimeraNota());
        System.out.println("\nEl promedio de la primera nota del curso es de : "+ df.format(promedioNota1));

        //Se calcula la nota mayor de los estudiantes y la mayor del curso
        double notaMayor1 = obtenerNotaMayor(estudiante0.getPrimeraNota(),estudiante0.getSegundaNota(),estudiante0.getTerceraNota());
        double notaMayor2 = obtenerNotaMayor(estudiante1.getPrimeraNota(),estudiante1.getSegundaNota(),estudiante1.getTerceraNota());
        double notaMayor3 = obtenerNotaMayor(estudiante2.getPrimeraNota(),estudiante2.getSegundaNota(),estudiante2.getTerceraNota());
        double notaMayorCurso = obtenerNotaMayor(notaMayor1, notaMayor2, notaMayor3);
        System.out.println("\nLa nota mayor del curso es de: "+ notaMayorCurso);

        //Se calcula la nota menor de los estudiantes y la menor del curso
        double notaMenor1 = obtenerNotaMenor(estudiante0.getPrimeraNota(),estudiante0.getSegundaNota(),estudiante0.getTerceraNota());
        double notaMenor2 = obtenerNotaMenor(estudiante1.getPrimeraNota(),estudiante1.getSegundaNota(),estudiante1.getTerceraNota());
        double notaMenor3 = obtenerNotaMenor(estudiante2.getPrimeraNota(),estudiante2.getSegundaNota(),estudiante2.getTerceraNota());
        double notaMenorCurso = obtenerNotaMenor(notaMenor1, notaMenor2, notaMenor3);
        System.out.println("\nLa nota menor del curso es de: "+ notaMenorCurso+"\n");

        System.out.println("La nota minima para aprobar es de: 3.5");
        //Se calcula si los estudiantes aprobaron o reabroparon
        String estadoEstudiante0 = validarAprobacion(promedioEstudiante0);
        System.out.println("El estado del estudiante 1 es: "+estadoEstudiante0);
        String estadoEstudiante1 = validarAprobacion(promedioEstudiante1);
        System.out.println("El estado del estudiante 2 es: "+estadoEstudiante1);
        String estadoEstudiante2 = validarAprobacion(promedioEstudiante2);
        System.out.println("El estado del estudiante 3 es: "+estadoEstudiante2);

        //Se calcula el promedio de estudiantes aprobados
        System.out.println("\nEl portaje de aprobacion del grupo fue de "+df.format(calcularPromedioAprobados(estadoEstudiante0,estadoEstudiante1,estadoEstudiante2))+"%");

        //Se calcula el promedio de estudiantes reprobados
        System.out.println("\nEl portaje de reprobacion del grupo fue de "+df.format(calcularPromedioReprobados(estadoEstudiante0,estadoEstudiante1,estadoEstudiante2))+"%");

        //Se obtiene el estudiante donde todas las notas sean mayor o igual a 4
        Estudiante estudianteNotasMayor4 = obtenerEstudianteNotasMayor4(estudiante0, estudiante1, estudiante2);
        if (estudianteNotasMayor4 == null){
            System.out.println("\nNingun estudiante tiene todas sus notas igual o mayor a 4\n");
        } else {
            System.out.println("\nEl estudiante "+estudianteNotasMayor4.getNombre()+" saco todas sus notas igual o mayor a 4\n");
        }

        //Imprimir nota mayor de cada estudiante
        System.out.println("La nota mayor de estudiante 1 es de: "+notaMayor1);
        System.out.println("La nota mayor de estudiante 2 es de: "+notaMayor2);
        System.out.println("La nota mayor de estudiante 3 es de: "+notaMayor3);
    }

    private static void setearEstudiantes(Estudiante estudiante0, Estudiante estudiante1, Estudiante estudiante2) {

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
    
    private static double obtenerNotaMayor(double primeraNota, double segundaNota, double terceraNota){
        double notaMayor = 0;
        if (primeraNota>notaMayor){
            notaMayor = primeraNota;
        }
        if (segundaNota>notaMayor) {
            notaMayor = segundaNota;
        }
        if (terceraNota>notaMayor) {
            notaMayor = terceraNota;
        }
        return notaMayor;
    }

    private static double obtenerNotaMenor(double primeraNota, double segundaNota, double terceraNota){
        double notaMenor = 5;
        if (primeraNota<notaMenor){
            notaMenor = primeraNota;
        }
        if (segundaNota<notaMenor) {
            notaMenor = segundaNota;
        }
        if (terceraNota<notaMenor) {
            notaMenor = terceraNota;
        }
        return notaMenor;
    }

    private static String validarAprobacion(double promedioEstudiante){
        String aprobo = "";
        if (promedioEstudiante>=3.5){
            aprobo = "Aprobado";
        } else {
            aprobo = "Reprobado";
        }
        return aprobo;
    }

    private static double calcularPromedioAprobados(String estudiante1, String estudiante2, String estudiante3){
        int aprobados = 0;
        if (estudiante1.equalsIgnoreCase("Aprobado")){
            aprobados += 1;
        }
        if (estudiante2.equalsIgnoreCase("Aprobado")){
            aprobados += 1;
        }
        if (estudiante3.equalsIgnoreCase("Aprobado")){
            aprobados += 1;
        }
        return (double) aprobados /3*100;
    }

    private static double calcularPromedioReprobados(String estudiante1, String estudiante2, String estudiante3){
        int reprobados = 0;
        if (estudiante1.equalsIgnoreCase("Reprobado")){
            reprobados += 1;
        }
        if (estudiante2.equalsIgnoreCase("Reprobado")){
            reprobados += 1;
        }
        if (estudiante3.equalsIgnoreCase("Reprobado")){
            reprobados += 1;
        }
        return (double) reprobados /3*100;
    }
    private  static  Estudiante obtenerEstudianteNotasMayor4(Estudiante estudiante0, Estudiante estudiante1, Estudiante estudiante2){
        Estudiante estudiante = null;
        if (estudiante0.getPrimeraNota()>=4 && estudiante0.getSegundaNota()>=4 && estudiante0.getTerceraNota()>=4){
            estudiante = estudiante0;
        }
        if (estudiante1.getPrimeraNota()>=4 && estudiante1.getSegundaNota()>=4 && estudiante1.getTerceraNota()>=4){
            estudiante = estudiante1;
        }
        if (estudiante2.getPrimeraNota()>=4 && estudiante2.getSegundaNota()>=4 && estudiante2.getTerceraNota()>=4){
            estudiante = estudiante2;
        }
        return estudiante;
    }
}