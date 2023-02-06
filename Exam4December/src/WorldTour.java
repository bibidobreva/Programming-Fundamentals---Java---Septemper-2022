import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input;
        while (!(input = scanner.nextLine()).equals("Travel")) {
            String command = input.split(":")[0];

            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(input.split(":")[1]);
                String string = input.split(":")[2];
                if (index < text.length() && index >= 0) {


                    String one = text.substring(0, index);
                    String last = text.substring(index);
                    if (index == 0) {
                        text = string + last;
                    } else if (index == text.length() - 1) {
                         one = text.substring(0, index+1);
                        text = one + string;
                    } else {

                        text = one + string + last;
                    }

                }
                System.out.println(text);

            } else if (command.equals("Remove Stop")) {
                int start = Integer.parseInt(input.split(":")[1]);
                int end = Integer.parseInt(input.split(":")[2]);
                if (start < text.length() && start >= 0 && end + 1 < text.length()&& end>=0) {
                    String first = text.substring(0, start);
                    String second = text.substring(end + 1);

                    if (end + 1 == text.length() - 1) {
                        text = first;
                    } else if (start == 0) {
                        text = second;
                    } else {
                        text = first + second;
                    }


                }
                System.out.println(text);

            } else if (command.equals("Switch")) {
                String old = input.split(":")[1];
                String newStr = input.split(":")[2];
                if (!old.equals(newStr)) {
                    text = text.replaceAll(old, newStr);
                }
                System.out.println(text);

            }
        }
        System.out.println("Ready for world tour! Planned stops: " + text);
    }
}
