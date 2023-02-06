import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input;
        while (!(input = scanner.nextLine()).equals("Decode")) {
            String command = input.split("\\|")[0];
            if (command.equals("Move")) {
                int endIndex = Integer.parseInt(input.split("\\|")[1]);
                if (endIndex < text.length() && endIndex >= 0) {
                    String letters = text.substring(0, endIndex);
                    if(letters.length()>text.length()){
                        continue;
                    }

                    text = text.replace(0, endIndex, "");
                    text.append(letters);
                }

            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\|")[1]);
                if (index <= text.length() && index >= 0) {
                    String value = input.split("\\|")[2];
                    text.insert(index, value);
                }

            } else if (command.equals("ChangeAll")) {
                String substring = input.split("\\|")[1];
                String replacement = input.split("\\|")[2];
                StringBuilder text1 = new StringBuilder(text.toString().replace(substring, replacement));
                text = text1;

            }

        }
        System.out.println("The decrypted message is: " + text);
    }
}
