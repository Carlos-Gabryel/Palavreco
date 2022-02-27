import java.util.Scanner;

public class Input {
    public static String userInput() {
        Scanner input = new Scanner(System.in);
        String tentativa = "";
        tentativa = input.nextLine();
        return tentativa;
    }
}
