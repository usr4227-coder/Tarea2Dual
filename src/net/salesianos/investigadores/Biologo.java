package net.salesianos.investigadores;

import java.util.ArrayList;
import java.util.Collections;

public class Biologo extends Investigador implements TrabajoDual {

    private ArrayList<String> especimenes;

    public Biologo(String nombre, String especialidad, double sueldo, ArrayList<String> especimenes) {
        super(nombre, especialidad, sueldo);
        this.especimenes = especimenes;
    }

    public ArrayList<String> getEspecimenes() {
        return especimenes;
    }

    public void setEspecimenes(ArrayList<String> especimenes) {
        this.especimenes = especimenes;
    }

    public void anadirEspecimen(String especimen) {
        especimenes.add(especimen);
    }

    @Override
    public void trabajar() {
        if (especimenes.isEmpty()) {
            System.out.println("No hay especímenes para procesar.");
            return;
        }

        Collections.sort(especimenes);
        especimenes.remove(especimenes.size() - 1);
    }

    @Override
    public String estadoDelSueldo() {
        if (sueldo < 1500) {
            return "Sueldo insuficiente. Solicitar aumento.";
        } else {
            return "Sueldo correcto.";
        }
    }

    @Override
    public void trabajoDual() {
        Collections.reverse(especimenes);
    }

}
