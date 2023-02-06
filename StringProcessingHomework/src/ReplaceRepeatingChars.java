import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String repeat = "";
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String current = input.charAt(i) + "";
            if (!current.equals(repeat)) {
                newWord.append(current);
            }
            repeat = current;
        }
        System.out.println(newWord);
    }
}
