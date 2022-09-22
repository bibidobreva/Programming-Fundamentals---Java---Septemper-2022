import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int num = username.length();
        String password = "";

        for (int i = (num - 1); i >= 0; i--) {
            password += username.charAt(i);
        }

        String pass;
        int timeTry = 0;

        while (!(pass = scanner.nextLine()).equals(password)) {

            timeTry++;
            if (timeTry >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }

        if (pass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
