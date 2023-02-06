import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());

        String gameName;
        double moneySpend = 0;

        while (!(gameName = scanner.nextLine()).equals("Game Time")) {

            double price = 0;
            if (gameName.equals("OutFall 4")) {
                price = 39.99;
            } else if (gameName.equals("CS: OG")) {
                price = 15.99;
            } else if (gameName.equals("Zplinter Zell")) {
                price = 19.99;
            } else if (gameName.equals("Honored 2")) {
                price = 59.99;
            } else if (gameName.equals("RoverWatch")) {
                price = 29.99;
            } else if (gameName.equals("RoverWatch Origins Edition")) {
                price = 39.99;
            } else {
                System.out.println("Not Found");
                continue;
            }

            if (price > money) {
                System.out.println("Too Expensive");
            } else {
                moneySpend += price;
                money -= price;
                System.out.println("Bought " + gameName);
            }
            if (money == 0) {
                System.out.println("Out of money!");
                break;
            }

        }
        if (money > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",moneySpend,money);
        }

    }
}
