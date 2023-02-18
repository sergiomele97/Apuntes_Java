package ConceptosJavaBasico.Syntaxis;

public class Variables_tipos_datos {

    public static void main(String[] args) {

        // tipo identificador = 30;
        // tipo identificador;
        // identificador = 30

        // enteros
        byte number1 = 1; // 1 byte
        short number2 = 2;  // 2 bytes
        int number3 = 3; // 4 bytes
        long number4 = 4; // 8 bytes

        // punto flotante
        float decimal1 = 4.9f; // la f es para indicar el tipo de dato
        double decimal = 9.99d; // lo mismo y tienen mas capacidad

        // caracter
        char caracter1 = 'a';

        // booleanos
        boolean verdadero = true; // en naranja son "palabras reservadas"

        // Hasta aquí tipos primitivos, no pueden ser nulos


        // cadenas de texto (tipo clase, fijarse que String ya empieza con mayúscula)
        String nombre = "Alan";

        //tipos envoltorio

        Integer numero = null;
        Long numero2 = 2L;
    }

}
