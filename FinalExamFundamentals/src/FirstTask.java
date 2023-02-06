import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String input;
        while (!(input = scanner.nextLine()).equals("Done")) {
            String command = input.split("\\s+")[0];

            if (command.equals("Change")) {
                String character = input.split("\\s+")[1];
                String replacement = input.split("\\s+")[2];
                if (text.contains(character)) {
                    text = text.replace(character, replacement);
                }
                System.out.println(text);

            } else if (command.equals("Includes")) {
                String substring = input.split("\\s+")[1];
                if (text.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.equals("End")) {
                String substring = input.split("\\s+")[1];
                String endSub = text.substring(text.length()  - substring.length());
                if (substring.equals(endSub)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.equals("Uppercase")) {
                text = text.toUpperCase();
                System.out.println(text);

            } else if (command.equals("FindIndex")) {
                String charGiven = input.split("\\s+")[1];
                if (text.contains(charGiven)) {
                    int index = text.indexOf(charGiven);
                    System.out.println(index);
                }

            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int count = Integer.parseInt(input.split("\\s+")[2]);
                text = text.substring(startIndex, startIndex + count);
                System.out.println(text);
            }


        }

    }
}
