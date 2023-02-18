package ConceptosJavaBasico.POObjetos;

public class PolimorfismoMain {

    public static void main(String[] args) {


        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        // polimorfismo: lo tratamos con un nivel de abstraccion mas alto

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof Coche){     // palabra reservada "isntaceof"
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico){     // palabra reservada "isntaceof"
            System.out.println("coche electrico");
        }

        // El polimorfismo nos permite trabajar con todos los subtipos de coches por igual
        // Nos hara falta para generar un array de diferentes tipos de coches
    }
}
