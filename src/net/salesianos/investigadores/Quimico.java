package net.salesianos.investigadores;

import java.util.ArrayList;

public class Quimico extends Investigador implements TrabajoDual {

    private int nivelToxicidad;
    private ArrayList<String> especimenesBiologo;

    public Quimico(String nombre, String especialidad, double sueldo, int nivelToxicidad) {
        super(nombre, especialidad, sueldo);
        this.nivelToxicidad = nivelToxicidad;
    }

    public int getNivelToxicidad() {
        return nivelToxicidad;
    }

    public void setNivelToxicidad(int nivelToxicidad) {
        this.nivelToxicidad = nivelToxicidad;
    }

    public void setEspecimenesBiologo(ArrayList<String> especimenes) {
        this.especimenesBiologo = especimenes;
    }

    @Override
    public void trabajar() {
        nivelToxicidad += 10;
    }

    @Override
    public String estadoDelSueldo() {
        if (sueldo < 2000) {
            return "Sueldo insuficiente. Solicitar aumento.";
        } else {
            return "Sueldo correcto.";
        }
    }

    @Override
    public void trabajoDual() {
        if (especimenesBiologo == null || especimenesBiologo.isEmpty()) {
            System.out.println("No hay especímenes para trabajo dual.");
            return;
        }

        especimenesBiologo.sort((a, b) -> Integer.compare(a.length(), b.length()));
        especimenesBiologo.remove(especimenesBiologo.size() - 1);
    }

}
