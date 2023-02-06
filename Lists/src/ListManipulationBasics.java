import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!(input = scanner.nextLine()).equals("end")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(command[1]);
                    numbers.add(numToAdd);

                    break;
                case "Remove":
                    int numRemove = Integer.parseInt(command[1]);
                    numbers.remove(Integer.valueOf(numRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(command[1]);
                    numbers.remove(indexRemove);
                    break;
                case "Insert":
                    int number = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    numbers.add(index, number);
                    break;
            }


        }
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}
