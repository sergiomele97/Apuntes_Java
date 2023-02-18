package Java_basico.Ejercicio4;

public class SmartPhone extends SmartDevice{

    public SmartPhone(double peso, double precio, String procesador) {
        super(peso, precio, procesador);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "peso=" + peso +
                ", precio=" + precio +
                ", procesador='" + procesador + '\'' +
                '}';
    }
}
