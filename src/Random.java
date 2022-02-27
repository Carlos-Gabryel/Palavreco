import java.io.IOException;

public class Random {
    public static String escolhePalavra() throws IOException {
        String[] tempsArray = Palavras.palavrasTxt();
        String palavra = tempsArray[(int) (Math.random() * tempsArray.length)];

        return palavra;
    }
}
