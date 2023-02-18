package Java_basico.Ejercicios789;

public class Ejercicios789 {

    public static void main(String[] args) {

        System.out.println(reverse("Hola mundo"));

    }

    public static String reverse(String texto){
        String reversed = "";
        for (int i = texto.length() - 1; i >= 0; i--){
            reversed = reversed + texto.charAt(i);
        }
        return reversed;
    }
}
