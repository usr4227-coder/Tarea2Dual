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
        try {
            if (especimenes == null || especimenes.isEmpty()) {
                throw new Exception("La lista de especímenes está vacía.");
            }

            Collections.sort(especimenes);
            especimenes.remove(especimenes.size() - 1);

        } catch (Exception e) {
            System.out.println("Error en Biólogo: " + e.getMessage());
        }
    }

    @Override
    public void trabajoDual() {
        try {
            if (especimenes == null || especimenes.isEmpty()) {
                throw new Exception("No hay especímenes para invertir.");
            }

            Collections.reverse(especimenes);

        } catch (Exception e) {
            System.out.println("Error en trabajo dual del Biólogo: " + e.getMessage());
        }
    }

    @Override
    public String estadoDelSueldo() {
        if (sueldo < 1500) {
            return "Sueldo insuficiente. Solicitar aumento.";
        } else {
            return "Sueldo correcto.";
        }
    }
}
