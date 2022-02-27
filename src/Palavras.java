import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palavras {

    public static String[] palavrasTxt() throws IOException {
        String token1 = "";
        Scanner inFile1 = new Scanner(new File(System.getProperty("user.dir") + "/src/palavras.txt")).useDelimiter("\n");
        List<String> temps = new ArrayList<String>();
        while (inFile1.hasNext()) {
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();

        String[] tempsArray = temps.toArray(new String[0]);

        return tempsArray;
    }
}