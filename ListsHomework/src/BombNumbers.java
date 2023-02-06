import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] specialNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bomb = specialNumbers[0];
        int power = specialNumbers[1];
        List<Integer> newList = new ArrayList<>();
        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);


            for (int i = 0; i < numbers.size(); i++) {
                if (i > index + power || i < index - power) {
                    newList.add(numbers.get(i));
                }
            }
            numbers=newList;
            newList=new ArrayList<>();
        }
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
