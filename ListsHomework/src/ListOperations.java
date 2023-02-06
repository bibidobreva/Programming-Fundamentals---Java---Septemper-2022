import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                int number = Integer.parseInt(command[1]);
                numbers.add(number);
            } else if (command[0].equals("Insert")) {
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                if (index >= numbers.size()||index<0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, number);
                }
            } else if (command[0].equals("Remove")) {
                if(numbers.size()==0){
                    continue;
                }
                int index = Integer.parseInt(command[1]);
                if (index >= numbers.size()||index<0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }
            } else if (command[1].equals("left")) {
                if(numbers.size()<=1){
                    continue;
                }
                int count = Integer.parseInt(command[2]);
                for (int i = 0; i < count; i++) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(first);
                }

            } else if (command[1].equals("right")) {
                if(numbers.size()<=1){
                    continue;
                }
                int count = Integer.parseInt(command[2]);
                for (int i = 0; i < count; i++) {
                    int last = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, last);
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
