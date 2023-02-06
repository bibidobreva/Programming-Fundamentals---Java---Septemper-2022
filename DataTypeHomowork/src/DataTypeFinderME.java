import java.util.Scanner;

public class DataTypeFinderME {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String data;
        while (!(data = scanner.nextLine()).equals("END")) {

        Scanner input = new Scanner(data);
            if (input.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", data);
            } else if (input.hasNextInt()) {
                System.out.printf("%s is integer type%n", data);
            } else if (data.length() == 1) {
                System.out.printf("%s is character type%n", data);
            } else if (input.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", data);
            } else if (input.hasNextLine()) {
                System.out.printf("%s is string type%n", data);
            }


        }
    }
}

