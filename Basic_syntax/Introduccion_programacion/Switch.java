package Introduccion_programacion;

public class Switch {

    public static void main(String[] args){

        var estacion = "VERANO";

        switch(estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion);
        }


        var hoy_es = "MARTES";

        switch(hoy_es){

            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es laborable");
                break;
            default:
                System.out.println("Hoy no es laborable");
                break;
        }

    }
}
