package Introduccion_programacion.Ejercicios;

public class Ejercicios_tema_4 {

    public static void main(String[] args){

        var numeroIf = 5;
        if (numeroIf >= 0){
            System.out.println("Mayor que 0");
        }   else {
            System.out.println("Menor que 0");
        }

        var numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile ++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 4);

        var numeroFor = 0;

        for (numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }

        var estacion = "cacahuete";

        switch(estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Eso no es una estacion");
        }
    }
}
