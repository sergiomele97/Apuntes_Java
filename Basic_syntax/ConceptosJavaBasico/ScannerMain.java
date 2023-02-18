package ConceptosJavaBasico;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce un nombre");
        String nombre = scanner.nextLine();

        System.out.println(nombre);
    }
}
