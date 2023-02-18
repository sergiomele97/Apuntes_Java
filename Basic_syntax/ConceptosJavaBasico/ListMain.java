package ConceptosJavaBasico;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {       // List es una interfaz

        List<String> nombres = new ArrayList<>(); // Lista dinamica de Strings

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        List<Cocheee> coches = new ArrayList<>();
        coches.add(new Cocheee("honda"));
        coches.add(new Cocheee("polo"));

    }
}
