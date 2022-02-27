import java.io.IOException;
import java.util.Scanner;

public class Verifica {
    public static String verifica() throws IOException {
        String palavra = Random.escolhePalavra();
        String tentativa = Input.userInput();
        int tentativas = QuantidadeTentativas.qntTentativas();

        while(!tentativa.equals(palavra) && tentativas > 0) {
            if (tentativa.length() != 5) {                
                continue;
            }
            for(int i = 0; i < palavra.length(); i++) {
                boolean estaCerto = false;
                for(int j = 0; j < palavra.length(); j++) {
                    if(tentativa.charAt(i) == palavra.charAt(i)) {
                        tentativa = "C";
                        System.out.print("C");
                        estaCerto = true;

                        break;
                    }
                    if (tentativa.charAt(i) == palavra.charAt(j)) {
                        System.out.print("Q");
                        estaCerto = true;

                        break;
                    }
                }
                if (!estaCerto) {
                    System.out.print("X");
                }
            }
        }
        return tentativa;
    }
}
