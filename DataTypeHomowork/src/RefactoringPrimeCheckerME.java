import java.util.Scanner;

public class RefactoringPrimeCheckerME {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
            boolean prime = true;
            for (int i = 2; i < currentNumber; i++) {
                if (currentNumber % i == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", currentNumber, prime);
        }
    }
}
