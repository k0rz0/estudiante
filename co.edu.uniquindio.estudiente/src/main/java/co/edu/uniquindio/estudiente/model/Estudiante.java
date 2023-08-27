package co.edu.uniquindio.estudiente.model;

public class Estudiante {

    private String nombre = "";
    private int edad = 0;
    private String correo = "";
    private int semestre = 0;
    private double primeraNota = 0;
    private double segundaNota = 0;
    private double terceraNota = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPrimeraNota() {
        return primeraNota;
    }

    public void setPrimeraNota(double primeraNota) {
        this.primeraNota = primeraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getTerceraNota() {
        return terceraNota;
    }

    public void setTerceraNota(double terceraNota) {
        this.terceraNota = terceraNota;
    }

}
