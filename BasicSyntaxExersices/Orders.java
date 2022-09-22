import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i =0; i<n;i++){
            double price = 0;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            price=(day*capsuleCount)*pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
            sum+=price;
        }
        System.out.printf("Total: $%.2f",sum);
    }
}
