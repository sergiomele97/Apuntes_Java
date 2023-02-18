package ConceptosJavaBasico.Syntaxis;

public class SobrecargaFunciones {

    public static void main(String[] args) {

    }


    private static void holaMundo(){ // Esta para es la signatura de la funcion
        System.out.println("Hola mundo"); // Esta otra es la implementacion o cuerpo
    }

    private static void holaMundo(String name) {  // Sobrecarga: mismo nombre pero tienen distintos parametros
        System.out.println("hola " + name);
    }

    // El constructor es un metodo especialo que nos permite creas objetos de una clase

}

