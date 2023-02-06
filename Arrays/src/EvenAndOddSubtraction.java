import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int even = 0;
        int odd=0;

        for(int item: numbers){
            if(item%2==0){
                even+=item;
            }else {
                odd+=item;
            }
        }
        int diff = even-odd;
        System.out.println(diff);
    }
}
