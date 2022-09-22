import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        int KB = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += (mouse + headset + keyboard);
                KB++;
                if (KB != 0 && KB % 2 == 0) {
                    sum += display;
                }
                continue;
            }
            if (i % 2 == 0) {
                sum += headset;
            }
            if (i % 3 == 0) {
                sum += mouse;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", sum);

    }
}
