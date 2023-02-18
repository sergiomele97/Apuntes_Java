package ConceptosJavaBasico.EntradaSalida;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintStreamMain {

    public static void main(String[] args) {

        try{
            InputStream in = new FileInputStream("C:\\Users\\Sergio\\IdeaProjects\\Java syntax\\Basic_syntax\\ConceptosJavaBasico\\EntradaSalida\\fichero.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            // Ahora PrintStream
            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
