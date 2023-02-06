import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        int sum = 0;

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(firstChar<secondChar){
                if(current>firstChar&&current<secondChar){
                    sum+=current;
                }
            } else if (secondChar>firstChar) {
                if(current>secondChar&&current<firstChar){
                    sum+=current;
                }
            }
        }
        System.out.println(sum);
    }
}
