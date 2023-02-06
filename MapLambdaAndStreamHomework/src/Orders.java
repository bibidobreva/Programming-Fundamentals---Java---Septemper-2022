import java.util.*;

public class Orders {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> rememberProducts = new LinkedHashMap<>();


        while (!(input = scanner.nextLine()).equals("buy")) {
            String item = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            if(!orders.containsKey(item)){
                orders.put(item,quantity*price);
                rememberProducts.put(item, quantity);

            }else {
                rememberProducts.put(item, rememberProducts.get(item) + quantity);
                orders.put(item, rememberProducts.get(item) * price);
            }


        }
        orders.forEach((key, value) ->
                System.out.printf("%s -> %.2f%n", key, value));


    }
}
