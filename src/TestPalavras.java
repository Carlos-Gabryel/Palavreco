import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPalavras {
    public static void testePalavras(String[] args) throws FileNotFoundException {
        String token = "";
        Scanner palavras = new Scanner(new File(System.getProperty("user.dir") + "/src/palavras.txt")).useDelimiter("\n");

        List<String> temps = new ArrayList<String>();
        while (palavras.hasNext()) {
            token = palavras.next();
            temps.add(token);
        }
        palavras.close();

        String[] tempsArray = temps.toArray(new String[0]);

        for(int i = 1; i < tempsArray.length; i++) {
            System.out.println(tempsArray[i]);
        }
    }
}