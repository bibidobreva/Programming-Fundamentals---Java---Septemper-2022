import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();

        validationOfPassword(passwordInput);

    }

    public static boolean passwordLength(String password) {


        if (password.length() <= 10 && password.length() >= 6) {
            return true;
        } else
            return false;
    }

    public static boolean letterAndDigits(String password) {
        boolean isLettersAndDigits=true;
        for (int i = 0; i < password.length(); i++) {

            if ((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                    || (password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
                isLettersAndDigits=true;
            }
            else {
                isLettersAndDigits=false;
                break;
            }
        }
        return isLettersAndDigits;
    }

    public static boolean hasTwoDigits(String password) {
        boolean hasTwoDigits = false;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 48 && password.charAt(i) < 57) {
                count++;
            }
        }
        if (count >= 2) {
            hasTwoDigits = true;
        }
        return hasTwoDigits;
    }

    public static void validationOfPassword(String password) {
        if (letterAndDigits(password) && hasTwoDigits(password) && passwordLength(password)) {
            System.out.println("Password is valid");
        } else {
            if (!passwordLength(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!letterAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasTwoDigits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }
}

