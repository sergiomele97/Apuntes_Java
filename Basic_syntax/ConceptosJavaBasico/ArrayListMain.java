package ConceptosJavaBasico;

import java.util.ArrayList;

public class ArrayListMain {
        // Es una lista dinamica; Es parecida pero no igual a un vector

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        System.out.println("contenido: " + lista);
        lista.remove("ElementoB");
        lista.remove(0);
        System.out.println("contenido: " + lista);

        // No se puede modificar en paralelo un arraylist
        // No es thread safe, un vector si seria thread safe.

        System.out.println(lista.get(0));

        // Diferencias con linkedList
        // ArrayList es mas rapido para buscar y almacenar datos
        // LinkedList es mas rapida para modificar datos
        // ArrayList deriva de la clase List
        // Linked List implemente 2 interfaces: DEKE y LIST
        // Podemos crear una linkedlist partiendo de un ArrayList


        // La interfaz List la implementan: Arraylist, vector y linkedlist
    }
}
