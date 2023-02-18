package ConceptosJavaBasico;
import java.util.Arrays;    // tenemos que importar la clase Arrays

public class IntroArrays {

    // Un array puede tener tantas dimensiones como sean necesarias

    public static void main(String[] args) {

        int[] notas1 = new int[3]; // Un array de notas con valores enteros y 10 posiciones
        int[] notas2 = {8, 10, 5, 9, 8, 7, 6, 7, 7, 8};

        notas1[0] = 8;
        notas1[1] = 7;
        notas1[2] = 8;

        System.out.println(notas1[0]);

        for(int i = 0; i < notas1.length; i++) {
            System.out.println(notas1[i]);
        }

        for(int item:notas1) {
            System.out.println(item);
        }

        Arrays.binarySearch(notas1, 9); // Te busca las posciones donde haya el valor 9
        Arrays.sort(notas1);
        Arrays.equals(notas1, notas2);
    }

    int[][] arrayBi = new int[4][4];
    int arrayBidi[][] = {
            { 1, 2, 2, 2}, { 1, 2, 3, 3}
    };
}
