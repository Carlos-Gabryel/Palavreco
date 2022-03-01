import java.util.Scanner;

public class Input {
    public static String userInput() {
        System.out.println("\nDigite uma palava de até 5 caracteres");
        Scanner input = new Scanner(System.in);
        String tentativa = "";
        tentativa = input.nextLine();
        return tentativa;
    }
}
