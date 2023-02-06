import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleLetter(input);

    }

    public static void middleLetter(String text) {
        if (text.length() % 2 == 0) {
            int middle = text.length() / 2;
            String middleLetters = text.charAt(middle-1)+"" + text.charAt(middle)+"";
            System.out.println(middleLetters);
        }
        else {
            int middle = text.length()/2;
            String middleLetter = text.charAt(middle)+"";
            System.out.println(middleLetter);
        }
    }
}
