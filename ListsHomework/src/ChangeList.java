import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input;
        while (!(input = scanner.nextLine()).equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Delete")) {
                int num = Integer.parseInt(command[1]);
                numbers.remove(Integer.valueOf(num));

            } else if (command[0].equals("Insert")) {
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                numbers.add(index,number);

            }

        }
        for(int number:numbers){
            System.out.print(number+" ");
        }
    }
}
