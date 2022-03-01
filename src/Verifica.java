import java.io.IOException;

public class Verifica {
    public static String verifica(String palavra) throws IOException {
        
        String tentativa = "";
        int tentativas = QuantidadeTentativas.qntTentativas();

        while (!tentativa.equals(palavra) && tentativas > 0) {
             tentativa = Input.userInput();
            if (tentativa.length() != 5) {
                System.out.println("A Palavra tem que conter 5 letras");
                continue;
            }
            for (int i = 0; i < 5; i++) {
                boolean estaCerto = false;
                for (int j = 0; j < 5; j++) {
                    if (tentativa.charAt(i) == palavra.charAt(i)) {
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
            tentativas--;
        }
        return tentativa;

    }

}
