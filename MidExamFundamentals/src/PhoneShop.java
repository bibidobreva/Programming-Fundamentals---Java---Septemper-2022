import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String input;
        while(!(input=scanner.nextLine()).equals("End")){
            String[] commands = input.split(" - ");
            String command = commands[0];
            if(command.equals("Add")){
                 String item = commands[1];
                 if(!phones.contains(item)){
                     phones.add(item);
                 }
                
            } else if (command.equals("Remove")) {
                 String item = commands[1];
                 if(phones.contains(item)){
                     phones.remove(item);
                 }
                
            } else if (command.equals("Bonus phone")) {
                String[]oldNew = commands[1].split(":");
                String oldPhone = oldNew[0];
                String newPhone = oldNew[1];
                if(phones.contains(oldPhone)){
                    int indexNew = phones.indexOf(oldPhone)+1;
                    phones.add(indexNew,newPhone);
                }
                
            } else if (command.equals("Last")) {
                String last = commands[1];
                if(phones.contains(last)){
                    phones.remove(last);
                    phones.add(last);
                }
            }
        }
        System.out.println(phones.toString().replaceAll("[\\[\\]]",""));
    }
}
