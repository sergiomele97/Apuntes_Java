package ConceptosJavaBasico;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        // Son como un array pero podemos no darles un tamaño inicial
        // Un vector es un array dinámico (parece un objeto de mayor nivel de abstracción)

        Vector <Integer> vector1 = new Vector();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        System.out.println("datos del vector: " + vector1);

        vector1.remove(1);
        System.out.println("datos del vector: " + vector1);

        System.out.println("Vector tamano " + vector1.size() + " y capacidad: " + vector1.capacity());
        // Cuando creamos un vector, por debajo creamos un array de una capacidad determinada
        // Cuando nos pasamos de la capacidad del vector, este crea un array nuevo y copia todos los
        // elementos, una operacion muy costosa computacionalmente. Hay que minimizar el numero de
        // resizes posibles.

        Vector vector2 = new Vector(20, 16);
        vector2.add(1);
        vector2.add(1);
        vector2.trimToSize();
        System.out.println(vector2.size());

        System.out.println(vector1.get(1));
    }
}
