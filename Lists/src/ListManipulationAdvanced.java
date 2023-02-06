import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!(input = scanner.nextLine()).equals("end")) {

            String[] command = input.split(" ");

            if (command[0].equals("Contains")) {
                int num = Integer.parseInt(command[1]);
                if (numbers.contains(num)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (command[0].equals("Print")) {

                if (command[1].equals("odd")) {

                    for (int item : numbers) {
                        if (item % 2 != 0) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println("");
                } else {
                    for (int item : numbers) {
                        if (item % 2 == 0) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println("");
                }

            } else if (command[0].equals("Get")) {
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println(sum);
            } else if (command[0].equals("Filter")) {
                String condition = command[1];
                int number = Integer.parseInt(command[2]);

                List<Integer> newList = removeWithCondition(numbers, condition, number);
                for (int item : newList) {
                    System.out.print(item + " ");
                }
                System.out.println("");

            }

        }

    }

    public static List<Integer> removeWithCondition(List<Integer> numbers, String condition, int num) {

        if (condition.equals("<=")) {
            numbers.removeIf(e -> e > num);
        } else if (condition.equals(">=")) {
            numbers.removeIf(e -> e < num);
        } else if (condition.equals(">")) {
            numbers.removeIf(e -> e <= num);
        } else if (condition.equals("<")) {
            numbers.removeIf(e -> e >= num);
        }


        return numbers;
    }
}
