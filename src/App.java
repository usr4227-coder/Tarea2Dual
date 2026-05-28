import net.salesianos.investigadores.Matematico;
import net.salesianos.investigadores.Biologo;
import net.salesianos.investigadores.Quimico;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Matematico m = new Matematico(
            "Alexis",
            "Álgebra",
            1700,
            new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            }
        );

        ArrayList<String> listaBio = new ArrayList<>();
        listaBio.add("perenquén");
        listaBio.add("baifo");
        listaBio.add("lince");
        listaBio.add("guirre");

        Biologo b = new Biologo(
            "Santi",
            "Zoología",
            1400,
            listaBio
        );

        Quimico q = new Quimico(
            "Fernando",
            "Toxicología",
            1800,
            20
        );

        m.trabajar(2);
        b.trabajar();
        q.trabajar();

        q.setEspecimenesBiologo(b.getEspecimenes());
        b.trabajoDual();
        q.trabajoDual();

        m.trabajar(-5);
        b.getEspecimenes().clear();
        b.trabajar();
        q.setEspecimenesBiologo(null);
        q.trabajoDual();

        System.out.println("Matriz del matemático:");
        for (int[] fila : m.getResultadosActuales()) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("\nEspecímenes del biólogo:");
        System.out.println(b.getEspecimenes());

        System.out.println("\nNivel de toxicidad del químico:");
        System.out.println(q.getNivelToxicidad());

        System.out.println("\nEstado del sueldo:");
        System.out.println("Matemático: " + m.estadoDelSueldo());
        System.out.println("Biólogo: " + b.estadoDelSueldo());
        System.out.println("Químico: " + q.estadoDelSueldo());
    }
}
