import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(e->e<0);
        Collections.reverse(numbers);
        if(numbers.size()==0){
            System.out.println("empty");
        }else {
            for (int num: numbers){
                System.out.print(num+" ");
            }
        }

    }
}
