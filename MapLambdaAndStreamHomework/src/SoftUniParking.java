import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingList = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s++")[0];
            String name = input.split("\\s++")[1];



            if (command.equals("register")) {
                String carNumber = input.split("\\s++")[2];
                if (parkingList.containsKey(name)) {

                    System.out.printf("ERROR: already registered with plate number %s%n", parkingList.get(name));

                } else {
                    parkingList.put(name, carNumber);
                    System.out.printf("%s registered %s successfully%n", name, carNumber);
                }
            } else if (command.equals("unregister")) {
                if (!parkingList.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else {
                    parkingList.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }

        }
        parkingList.forEach((key, value) ->
                System.out.printf("%s => %s%n", key, value));
    }
}
