import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int count = 0;
        long quantity = 0;
        String resource = "";

        LinkedHashMap<String, Long> mine = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("stop")) {
            count++;

            if (count % 2 == 0) {
                quantity = Long.parseLong(input);
                if (mine.containsKey(resource)) {
                    mine.put(resource, mine.get(resource) + quantity);
                } else {
                    mine.putIfAbsent(resource, quantity);
                }


            } else {
                resource = input;
            }


        }

        for (Map.Entry<String, Long> entry : mine.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
