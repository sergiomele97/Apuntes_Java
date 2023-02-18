package Java_basico.Ejercicios789;

import ConceptosJavaBasico.NameFormatException;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EjerciciosMain {

    public static void main(String[] args) {

        // Ejercicio 1

        String arraUS[] = {"Hola ", "Mundo ", "que ", "tal \n"};

        for (String palabra : arraUS) {
            System.out.print(palabra);
        }

        // Ejercicio 2

        int arrayBI[][] = {{1,1,2,3},{1,1,2,3},{1,1,2,3}};
        for (int i = 0; i < arrayBI.length; i++) {
            for (int j = 0; j < arrayBI[i].length; j++) {
                System.out.println("i = " + i + " j = " + j + " valor = " + arrayBI[i][j]);
            }
        }

        // Ejercicio 3
        Vector<Integer> vector1 = new Vector();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        vector1.remove(3);
        vector1.remove(2);
        System.out.println(vector1);
        // Ejercicio 4
        // Cuando creamos un vector, por debajo creamos un array de una capacidad determinada
        // Cuando nos pasamos de la capacidad del vector, este crea un array nuevo y copia todos los
        // elementos, una operacion muy costosa computacionalmente. Hay que minimizar el numero de
        // resizes posibles.

        // Ejercicio 5

        List<String> arraylistS4 = new ArrayList<String>();
        arraylistS4.add("Nombre 1");
        arraylistS4.add("Nombre 2");
        arraylistS4.add("Nombre 3");
        arraylistS4.add("Nombre 4");

        List<String> linkedListS4 = new LinkedList<>();

        for (String elemento : arraylistS4){
            linkedListS4.add(elemento);
            System.out.println(elemento);
        }

        // Ejercicio 6

        List<Integer> arraylistInt = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arraylistInt.add(i);
        }

        for (int i = 0; i < arraylistInt.size(); i++) {     // Eliminar pares
            if (arraylistInt.get(i) % 2 == 0){
                arraylistInt.remove(i);
            }
        }
        System.out.println(arraylistInt);

        // Ejercicio 7

        try {
            dividePorCero(7);  // en vez de meter el try catch en la funcion, usamos throws y lo metemos aqui
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        // Ejercicio 8

        copiarArchivo("C:\\Users\\Sergio\\IdeaProjects\\Java syntax\\Basic_syntax\\Apuntes", "outpout.txt");

    }

    public static int dividePorCero (int valor1) throws ArithmeticException{
        throw new ArithmeticException("Esto no puede hacerse");
    }

    public static void copiarArchivo (String fileIn, String fileOut){

        try{
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            // Ahora PrintStream
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
