package ConceptosJavaBasico.POObjetos;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo"; // tipo_de_dato identificador = valor asignado


                                                            // Objeto = instancia de una clase

        CocheElectrico cocheElectrico1 = new CocheElectrico("motorazoloco");

        System.out.println(cocheElectrico1);

        CocheElectrico cocheElectrico2 = new CocheElectrico("motorazoooo", "rojo", "honda", "civic", 2430.45, 5.4);

        System.out.println(cocheElectrico2);
    }
}
