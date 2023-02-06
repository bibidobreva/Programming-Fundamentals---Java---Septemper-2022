import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input;
        double sum = 0;
        while (!(input = scanner.nextLine()).equals("end of shift")) {
            Pattern pattern = Pattern.compile
                    ("%(?<name>[A-Z][a-z]*)%[^|.$%]*<(?<product>\\w+)>[^|.$%]*\\|(?<quantity>\\d+)\\|[^|.$%]*?(?<price>[0-9]+\\.?[0-9]*)\\$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                double priceToPay = Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
                sum += priceToPay;
                System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"), priceToPay);
            }
        }
        System.out.printf("Total income: %.2f",sum);
    }
}
