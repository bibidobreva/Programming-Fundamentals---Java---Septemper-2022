import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while(!(input = scanner.nextLine()).equals("end")){

            char [] word = input.toCharArray();
            String reversed = "";
            for (int i = word.length-1; i >=0; i--) {

                reversed+=word[i];
            }

            System.out.printf("%s = %s%n",input,reversed);
        }
    }
}
