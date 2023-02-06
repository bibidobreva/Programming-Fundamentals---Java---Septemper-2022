import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());


        double result = divisionFactorials(first, second);
        if (first >= 0 && second >= 0) {
            System.out.printf("%.2f", result);
        }

    }

    public static long factorial(long a) {
        long sum = 1;
        for (long i = a; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }

    public static double divisionFactorials(long a, long b) {
        long first = factorial(a);
        long second = factorial(b);
        return 1.00*first / second;
    }
}
