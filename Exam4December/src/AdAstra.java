import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> products = new ArrayList<>();


        Pattern pattern = Pattern.compile("(#|\\|)(?<name>[A-Za-z ]+)\\1(?<expDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1");
        Matcher matcher = pattern.matcher(input);
        int calories = 0;
        while (matcher.find()) {
            String name = matcher.group("name");
            String date = matcher.group("expDate");
            int cal = Integer.parseInt(matcher.group("calories"));
            String endResult = "Item: " + name + ", Best before: " + date + ", Nutrition: " + cal;
            products.add(endResult);
            calories += cal;


        }
        double days = Math.floor(1.00 * calories / 2000);
        System.out.printf("You have food to last you for: %.0f days!%n", days);


            for (String item : products) {
                System.out.println(item);
            }


    }
}
