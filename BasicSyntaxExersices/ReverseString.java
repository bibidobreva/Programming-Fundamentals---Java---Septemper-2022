import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int length = text.length();
        String reverse = "";

        for(int i = (length-1);i>=0;i--){
            char letter = text.charAt(i);
            reverse+=letter;
        }
        System.out.println(reverse);
    }
}
