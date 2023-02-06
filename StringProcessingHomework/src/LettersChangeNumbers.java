import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double endSum = 0;

        String[] input = scanner.nextLine().split("\\s+");
        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            double sum = 0;
            double num = Double.parseDouble(current.substring(1, current.length() - 1));
            if (isUppercase(current.charAt(0))) {
                sum += num / alphabetNum(current.charAt(0));
            } else {
                sum += num * alphabetNum(current.charAt(0));
            }

            if (isUppercase(current.charAt(current.length() - 1))) {
                sum -= alphabetNum(current.charAt(current.length() - 1));
            } else {
                sum += alphabetNum(current.charAt(current.length() - 1));
            }
            endSum += sum;

        }
        System.out.printf("%.2f",endSum);


    }

    static int alphabetNum(char someChar) {
        int count = 0;
        String character = someChar + "";
        for (int i = 'a'; i <= character.toLowerCase().charAt(0); i++) {
            count++;
        }
        return count;
    }

    static boolean isUppercase(char a) {
        if (a >= 65 && a <= 90) {
            return true;
        } else {
            return false;
        }
    }
}
