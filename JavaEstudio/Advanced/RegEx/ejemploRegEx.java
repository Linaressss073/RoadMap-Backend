import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejemploRegEx {
    public static void main(String[] args) {
        
        Pattern patron = Pattern.compile("hola mundo" , Pattern.CASE_INSENSITIVE);
        Matcher matcher = patron.matcher("Visita mi Pagina");

        boolean matchEncontrado = matcher.find();

        if (matchEncontrado) {
            System.out.println("Match encontrado");
        } else {
            System.out.println("Match no encontrado");
        }

        //More documentation on https://www.w3schools.com/java/java_regex.asp

    }
}
