import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        double sum = 0;
        System.out.println("Bought furniture:");
        while (!(input = scanner.nextLine()).equals("Purchase")) {

            Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Z]*+[a-z]*)<<(?<price>\\d+[.]?\\d+?)!(?<quantity>\\d+)\\b");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));


                sum += price * quantity;
                System.out.println(furniture);
            }

        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
