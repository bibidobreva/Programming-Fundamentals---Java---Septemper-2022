import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input;
        while (!(input = scanner.nextLine()).equals("Done")) {
            String command = input.split("\\s+")[0];

            if (command.equals("TakeOdd")) {
                String newPassword = "";
                for (int i = 1; i < password.length(); i += 2) {
                    newPassword += password.charAt(i);
                }
                password = newPassword;
                System.out.println(password);

            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int length = Integer.parseInt(input.split("\\s+")[2]);
                String remove = password.substring(index, index + length);
                password=password.replaceFirst(remove,"");
                System.out.println(password);

            } else if (command.equals("Substitute")) {
                String substring = input.split("\\s+")[1];
                String substitute = input.split("\\s+")[2];
                if(password.contains(substring)){

                    password=password.replaceAll(substring,substitute);
                    System.out.println(password);
                }else {
                    System.out.println("Nothing to replace!");
                }

            }
        }
        System.out.printf("Your password is: %s",password);
    }
}
