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

    public void setEspecimenesBiologo(ArrayList<String> especimenesBiologo) {
        this.especimenesBiologo = especimenesBiologo;
    }

    @Override
    public void trabajar() {
        nivelToxicidad += 10;
    }

    @Override
    public void trabajoDual() {
        try {
            if (especimenesBiologo == null || especimenesBiologo.isEmpty()) {
                throw new Exception("El químico no tiene especímenes asignados.");
            }

            especimenesBiologo.sort((a, b) -> Integer.compare(a.length(), b.length()));
            especimenesBiologo.remove(especimenesBiologo.size() - 1);

        } catch (Exception e) {
            System.out.println("Error en trabajo dual del Químico: " + e.getMessage());
        }
    }

    @Override
    public String estadoDelSueldo() {
        if (sueldo < 2000) {
            return "Sueldo insuficiente. Solicitar aumento.";
        } else {
            return "Sueldo correcto.";
        }
    }
}
