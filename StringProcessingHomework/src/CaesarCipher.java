import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int current = input.charAt(i)+3;
            char messageChar = (char)current;


            message.append(messageChar);
        }

        System.out.println(message);
    }
}
