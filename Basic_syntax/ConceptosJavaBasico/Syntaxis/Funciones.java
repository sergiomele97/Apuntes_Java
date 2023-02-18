package ConceptosJavaBasico.Syntaxis;

public class Funciones {


    public static void main(String[] args) {

        holaMundo();
        holaHola("Sergio"); // Argumento
        System.out.println(devolverHolaMundo());


    }   // "Static" indica que pertenece a la clase, es decir que no hay que crear un objeto para invocarlos
        // Otro modificador es protected: Solo las clases Hijas del paquete pueden usar la funcion
    protected static void holaMundo() {
        System.out.println("Hola mundo desde un metodo");   // método en POO y funcion en no orientada a objetos

    }   // privado, solo puede ser invocado desde dentro de la clase

    private static String devolverHolaMundo(){  // private indica el ambito de la funcion

        return "pepinillos";
    }

    private static void holaHola(String name){  // Parametro
        System.out.println("hola " + name);
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}
