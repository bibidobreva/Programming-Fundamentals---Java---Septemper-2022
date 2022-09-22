import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins;
        double sum = 0;
        while (!(coins = scanner.nextLine()).equals("Start")) {
            double coin = Double.parseDouble(coins);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);

            }

        }

        String drink;
        while (!(drink = scanner.nextLine()).equals("End")) {
            double price = 0;
            if (drink.equals("Nuts")) {
                price = 2.0;
            } else if (drink.equals("Water")) {
                price = 0.70;
            } else if (drink.equals("Crisps")) {
                price = 1.5;
            } else if (drink.equals("Soda")) {
                price = 0.8;
            } else if (drink.equals("Coke")) {
                price = 1.0;
            } else {
                System.out.println("Invalid product");
                continue;
            }

            sum -= price;
            if (sum >= 0) {
                System.out.printf("Purchased %s%n", drink);
            } else {
                System.out.println("Sorry not enough money");
                sum += price;
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
