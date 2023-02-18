package ConceptosJavaBasico;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try {
            leerNombres();  // en vez de meter el try catch en la funcion, usamos throws y lo metemos aqui
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que lee nombres de consola y verifica que tengan longitud igual o mayor que 8
     * caracteres
     * @throws NameFormatException
     */
    private static void leerNombres() throws NameFormatException { // indicamos que el metodo lanza una excepcion
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }   // throw sin s lanza la excepcion
        }
    }
}
