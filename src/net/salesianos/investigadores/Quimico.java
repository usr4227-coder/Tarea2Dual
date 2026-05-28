package net.salesianos.investigadores;

public class Quimico extends Investigador {

    private int nivelToxicidad;

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
}
