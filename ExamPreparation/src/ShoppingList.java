import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shopping = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input;
        while (!(input = scanner.nextLine()).equals("Go Shopping!")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            if(command.equals("Urgent")){
                String item = commands[1];
                if(!shopping.contains(item)){
                    shopping.add(0,item);
                }
            } else if (command.equals("Unnecessary")) {
                String item = commands[1];
                if(shopping.contains(item)){
                    shopping.remove(item);
                }
            } else if (command.equals("Correct")) {
                String oldItem = commands[1];
                String newItem = commands[2];
                if(shopping.contains(oldItem)){
                    int indexOld = shopping.indexOf(oldItem);
                    shopping.set(indexOld,newItem);
                }

            }else if(command.equals("Rearrange")){
                String item = commands[1];
                if(shopping.contains(item)){
                    shopping.remove(item);
                    shopping.add(item);
                }
            }

        }
        System.out.println(shopping.toString().replaceAll("[\\[\\]]",""));
    }
}
