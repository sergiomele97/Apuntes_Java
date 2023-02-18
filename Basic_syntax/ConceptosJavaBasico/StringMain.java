package ConceptosJavaBasico;

public class StringMain {

    public static void main(String[] args) {

        // La clase String

        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subString(1,5)
            trim()
            equals()
            compareTo
         */

        String mensaje = "  Hola mundo  ";
        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        mensajeMAY = mensajeMAY.trim(); // elimina espacios laterales

        String otro = "HOLA MUNDO";
        if (mensajeMAY.equals(otro)){
            System.out.println("verdadero");
        }

    }
}
