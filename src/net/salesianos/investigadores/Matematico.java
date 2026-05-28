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
        try {
            if (numero < 0) {
                throw new Exception("No se puede multiplicar por un número negativo.");
            }

            for (int i = 0; i < resultadosActuales.length; i++) {
                for (int j = 0; j < resultadosActuales[i].length; j++) {
                    resultadosActuales[i][j] *= numero;
                }
            }

        } catch (Exception e) {
            System.out.println("Error en Matemático: " + e.getMessage());
        }
    }

    public void trabajar(int[][] matriz) {
        try {
            if (matriz == null) {
                throw new Exception("La matriz recibida es nula.");
            }

            if (matriz.length != resultadosActuales.length ||
                    matriz[0].length != resultadosActuales[0].length) {
                throw new Exception("Las matrices no tienen el mismo tamaño.");
            }

            for (int i = 0; i < resultadosActuales.length; i++) {
                for (int j = 0; j < resultadosActuales[i].length; j++) {
                    resultadosActuales[i][j] += matriz[i][j];
                }
            }

        } catch (Exception e) {
            System.out.println("Error en Matemático: " + e.getMessage());
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
