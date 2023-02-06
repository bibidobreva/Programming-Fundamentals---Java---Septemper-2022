import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char fist = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        betweenTwoSymbols(fist, second);
    }

    public static void betweenTwoSymbols(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                char current = (char) i;
                System.out.print(current + " ");
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                char current = (char) i;
                System.out.print(current + " ");
            }

        }
    }
}
