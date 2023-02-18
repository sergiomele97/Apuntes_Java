package ConceptosJavaBasico.Syntaxis;

public class SwitchCase {

    public static void main(String[] args) {


        String weather = "sunny";

        switch (weather) {

            case "sunny":
                System.out.println("El tiempo es soleado");
                break; // Hay que romper el flujo de ejecucion o ejecuta all despes del primer "acierto"
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:    // Es una buena practica crear un caso predefinido
                System.out.println("No se ha podido identificar el clima");
                break;

        }
    }
}
