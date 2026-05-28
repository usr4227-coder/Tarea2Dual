package net.salesianos.investigadores;

public class Matematico extends Investigador {

    private int[][] resultadosActuales;

    public Matematico(String nombre, String especialidad, double sueldo, int[][] resultadosActuales) {
        super(nombre, especialidad, sueldo);
        this.resultadosActuales = resultadosActuales;
    }

    public int[][] getResultadosActuales() {
        return resultadosActuales;
    }

    public void setResultadosActuales(int[][] resultadosActuales) {
        this.resultadosActuales = resultadosActuales;
    }

    public void trabajar(int numero) {
        for (int i = 0; i < resultadosActuales.length; i++) {
            for (int j = 0; j < resultadosActuales[i].length; j++) {
                resultadosActuales[i][j] *= numero;
            }
        }
    }

    public void trabajar(int[][] matriz) {
        for (int i = 0; i < resultadosActuales.length; i++) {
            for (int j = 0; j < resultadosActuales[i].length; j++) {
                resultadosActuales[i][j] += matriz[i][j];
            }
        }
    }

    @Override
    public void trabajar() {
        System.out.println("El matemático necesita un parámetro para trabajar (entero o matriz).");
    }

    @Override
    public String estadoDelSueldo() {
        if (sueldo < 1800) {
            return "Sueldo insuficiente. Solicitar aumento.";
        } else {
            return "Sueldo correcto.";
        }
    }
}
