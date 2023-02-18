package ConceptosJavaBasico.EntradaSalida;

import java.io.IOException;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos numeros: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(("Enteros son: " + a + b ));


        } catch (Exception e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
    }
}
