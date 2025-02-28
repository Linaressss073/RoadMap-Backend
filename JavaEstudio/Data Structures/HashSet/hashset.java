import java.util.HashSet;

public class hashset {
    
    //HashSet es una colección de artículos donde cada artículo es único

    public static void main(String[] args) {
        
        //Crear HashSet
        //HashSet<tipo> nombre = new HashSet<tipo>();

        HashSet<Integer> numeros = new HashSet<Integer>();

        //Añadir articulos
        numeros.add(4);
        numeros.add(2);
        numeros.add(7);


        //Comprobar si existe un articulo
        System.out.println(numeros.contains(4)); //Devuelve true o false

        //Eliminar un articulo
        numeros.remove(0);

        //Saber tamaño del HashSet
        System.out.println("El tamaño del HashSet es: " + numeros.size());

        for (Integer i : numeros) {
            System.out.println("Dato: " + i );
        }

        //Condicionales
        for (int i = 1; i <= 10; i++) {
            if (numeros.contains(i)) {
                System.out.println(i + " Encontrado en el set");
            } else {
                System.out.println(i + " no encontrado en el set");
            }
        }


    }
    
}
