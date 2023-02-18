package Java_basico.Ejercicio4;

public class Ej4Main {

    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone(300,400, "ijet4900");
        SmartWatch relojito = new SmartWatch(100,200, "sdf345345");

        System.out.println(iphone.toString());
        System.out.println(relojito.toString());
    }

}
