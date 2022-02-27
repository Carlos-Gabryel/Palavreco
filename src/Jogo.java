import java.io.IOException;

public class Jogo {
    public static void main(String[] args) throws IOException {
       String tentativa = Input.userInput();
        String teste = Verifica.verifica();
        System.out.println(teste);
        System.out.println(tentativa);
    }
    
}
