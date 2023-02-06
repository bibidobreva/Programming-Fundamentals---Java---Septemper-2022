import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                coffeePrice(quantity);
                break;
            case"water":
                waterPrice(quantity);
                break;
            case "coke":
                cokePrice(quantity);
                break;
            case "snacks":
                snacksPrice(quantity);
                break;
        }


    }

    public static void coffeePrice(int quantity) {
        double price = quantity * 1.50;
        System.out.printf("%.2f",price);
    }

    public static void waterPrice(int quantity) {
        double price = quantity * 1.00;
        System.out.printf("%.2f",price);
    }

    public static void cokePrice(int quantity) {
        double price = quantity * 1.40;
        System.out.printf("%.2f",price);
    }

    public static void snacksPrice(int quantity) {
        double price = quantity * 2.00;
        System.out.printf("%.2f",price);
    }

}
