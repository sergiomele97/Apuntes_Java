package Java_basico;

import java.util.Scanner;

public class EjercicioTema3 {
 // Hola
    public static void main(String[] args) {
        String texto = "";
        Scanner sc = new Scanner(System.in);

        while(true){
            texto = texto.concat(sc.nextLine());
            System.out.println(texto);

        }
    }
}
