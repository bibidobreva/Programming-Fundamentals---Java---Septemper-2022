import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        int numberGuest = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberGuest; i++) {
            String[] guestComing = scanner.nextLine().split(" ");
            if (guestComing[2].equals("going!")) {
                if (names.contains(guestComing[0])) {
                    System.out.println(guestComing[0] + " is already in the list!");
                } else {
                    names.add(guestComing[0]);
                }
            } else {
                if (names.contains(guestComing[0])) {
                    names.remove(guestComing[0]);
                } else {
                    System.out.println(guestComing[0] + " is not in the list!");
                }
            }

        }
        for (String name : names){
            System.out.println(name);
        }
    }
}
