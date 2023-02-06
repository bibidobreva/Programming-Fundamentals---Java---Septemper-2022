import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        boolean isValid = true;
        while (isValid) {


            int cardFirst = first.get(0);
            int cardSecond = second.get(0);

            if (cardFirst > cardSecond) {
                first.add(cardFirst);
                first.add(cardSecond);
                first.remove(0);
                second.remove(0);
            } else if (cardSecond > cardFirst) {
                second.add(cardSecond);
                second.add(cardFirst);
                second.remove(0);
                first.remove(0);
            } else if (cardSecond == cardFirst) {
                second.remove(0);
                first.remove(0);
            }
            if(first.size()==0){
                isValid=false;
            } else if (second.size()==0) {
                isValid=false;
            }

        }
        if (first.size() > second.size()) {
            int sum = 0;
            for (int numbers : first) {
                sum += numbers;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            int sum = 0;
            for (int numbers : second) {
                sum += numbers;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
