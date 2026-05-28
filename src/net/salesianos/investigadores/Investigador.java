package net.salesianos.investigadores;

public abstract class Investigador {

    protected String nombre;
    protected String especialidad;
    protected double sueldo;

    public Investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String identificacion() {
        return "Nombre: " + nombre +
                ", Especialidad: " + especialidad +
                ", Sueldo: " + sueldo;
    }

    public String hacerCalculoBasico(double a, double b) {
        double suma = a + b;
        double resta = a - b;
        return "Suma: " + suma + ", Resta: " + resta;
    }

    public abstract String estadoDelSueldo();

    public abstract void trabajar();
}
