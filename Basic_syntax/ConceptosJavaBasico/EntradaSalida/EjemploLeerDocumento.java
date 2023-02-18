package ConceptosJavaBasico.EntradaSalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EjemploLeerDocumento {

    public static void main(String[] args) {

        // Java te obliga a acerte cargo de estos errores (a usar try catch)
        // Entiendo que FileInputStream es una clase hija de InputStream
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Sergio\\IdeaProjects\\Java syntax\\Basic_syntax\\ConceptosJavaBasico\\EntradaSalida\\fichero.txt");

            try {
                byte[] datos = fichero.readAllBytes();  // Creamos un array de bytes

                for (byte dato : datos) {
                    System.out.print((char)dato);   // Imprimimos todoo el documento
                                                    // print en vez de println (suma salto linea)
                    }

                // Otra forma
                InputStream fichero2 = new FileInputStream("C:\\Users\\Sergio\\IdeaProjects\\Java syntax\\Basic_syntax\\ConceptosJavaBasico\\EntradaSalida\\fichero.txt");
                int datos2 = fichero2.read();
                while (datos2 != -1) {
                    // -1 = end of file
                    System.out.print((char)datos2);
                    datos2 = fichero2.read();


                    }

                } catch (IOException e) {
                System.out.println("El programa da error: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
    }
}
