package net.salesianos.investigadores;

import java.util.ArrayList;

public class Biologo extends Investigador {

    private ArrayList<String> especimenes;

    public Biologo(String nombre, String especialidad, double sueldo, ArrayList<String> especimenes) {
        super(nombre, especialidad, sueldo);
        this.especimenes = especimenes;
    }

}
