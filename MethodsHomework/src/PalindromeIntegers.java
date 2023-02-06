import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (!(input = scanner.nextLine()).equals("END")) {

            if (isNumPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean isNumPalindrome(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (b.equals(a)) {
            return true;
        } else return false;
    }
}
