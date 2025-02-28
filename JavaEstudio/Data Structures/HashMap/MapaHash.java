import java.util.HashMap;

public class MapaHash {
    public static void main(String[] args) {
        
        //Crear un objeto HashMap
        // HashMap<tipo,tipo> nombre = new HashMap<tipo,tipo>();
        HashMap<String,String> capitalesCiudades = new HashMap<String,String>();

        //Añadir items
        capitalesCiudades.put("Colombia", "Bogota");
        capitalesCiudades.put("Alemania", "Berlin");
        capitalesCiudades.put("Usa", "Washington DC");

        System.out.println(capitalesCiudades);

        //.keySet -- > Da el primer valor
        //.values -- > Da el segundo valor

        for (String i : capitalesCiudades.keySet()) {
            System.out.println("Llave: " + i + " valor: " + capitalesCiudades.get(i));
        } System.out.println(capitalesCiudades.size()); //Tamaño del hash


        //Acceder a un articulo
        capitalesCiudades.get("Alemania");

        //Eliminar un articulo junto a la key
        capitalesCiudades.remove("USA");

        //Eliminar todos 
        capitalesCiudades.clear();

    }
}
