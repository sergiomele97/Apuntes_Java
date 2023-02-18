package ConceptosJavaBasico;

public class TryCatchMain {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;
        } catch (Exception e){    // e = objeto excepcion
            e.printStackTrace();
            System.out.println("Excepcion es: " + e.getClass());
            // printeamos el fallo
        } finally{                          // Cerramos recursos
            System.out.println("Cierre de recursos");

        }


        System.out.println("fin");
    }
}
