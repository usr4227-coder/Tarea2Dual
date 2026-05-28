package net.salesianos.investigadores;

public class Quimico extends Investigador {

    private int nivelToxicidad;

    public Quimico(String nombre, String especialidad, double sueldo, int nivelToxicidad) {
        super(nombre, especialidad, sueldo);
        this.nivelToxicidad = nivelToxicidad;
    }

}
