package ConceptosJavaBasico;

import java.math.BigDecimal;

public class BigDecimalMain {

    public static void main(String[] args) {
        // No usar los tipo de dato float or double con datos financieros, no son precisos

        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);
        // No es preciso

        // En vez de eso usamos la clase BigDecimal

        BigDecimal valorA = new BigDecimal(0.1);
        // Es un numero enorme
        // Tienen metodos especificos para manipularla
        // Solo puedes operar un BigDecimal contra otro BigDecimal

        BigDecimal valorB = new BigDecimal(4);
        valorA.multiply(valorB);
        System.out.println(valorA);

        // No es un problema de Java, es un problema de al computacion en general
    }
}
