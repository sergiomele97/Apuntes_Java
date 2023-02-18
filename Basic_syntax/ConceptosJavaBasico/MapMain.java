package ConceptosJavaBasico;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {    // Como un diccionario de python


        Map<String, String> personas = new HashMap<>();     // Definir el mapa

        // No podemos tener una clave duplicada

        personas.put("12345678H", "Nombre Apellido 1");
        personas.put("12345673H", "Nombre Apellido 2");
        personas.put("12345672H", "Nombre Apellido 3");
        personas.put("12345679H", "Nombre Apellido 3");
        personas.replace("12345679H", "Nombre Apellido 3");  // replace: si no existe la clave, no hace nada

        System.out.println(personas);

        for(String key : personas.keySet()) {      // keySet
            System.out.println(key);
        }

        for(String value : personas.values()) {     // values
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()){     // entrySet
            System.out.println(pair.getKey() + " " + pair.getValue());
       }
        System.out.println(personas.get("12345678H"));
    }
}
