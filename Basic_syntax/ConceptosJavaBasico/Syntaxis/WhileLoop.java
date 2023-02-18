package ConceptosJavaBasico.Syntaxis;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;

        while(count < 10){  // A veces se usan bucles infinitos, como cuando se espera un input del usuario
            System.out.println("Hola " + count);

            if(count == 5){
                break;   // Rompe el flujo de ejecucion
            }
            if(count == 6){
                continue;   // Continue hace que salte a la siguiente iteracion
            }
            count++;

        }
    }
}
