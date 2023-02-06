import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input;
        while (!(input=scanner.nextLine()).equals("Craft!")){
            String [] commands = input.split(" - ");
            String command = commands[0];
            if(command.equals("Collect")){
                String item = commands[1];
                if(!journal.contains(item)){
                    journal.add(item);
                }

                
            } else if (command.equals("Drop")) {
                String item = commands[1];
                if (journal.contains(item)) {
                    journal.remove(item);
                }
                
            } else if (command.equals("Combine Items")) {
                String items = commands[1];
                String oldItem = items.split(":")[0];
                String newItem = items.split(":")[1];
                if(journal.contains(oldItem)){
                    int oldIndex = journal.indexOf(oldItem);
                    journal.add(oldIndex+1,newItem);
                }
                
            } else if (command.equals("Renew")) {
                String item = commands[1];
                if(journal.contains(item)){
                    journal.remove(item);
                    journal.add(item);
                }
            }


        }
        System.out.println(journal.toString().replaceAll("[\\[\\]]",""));
    }
}
