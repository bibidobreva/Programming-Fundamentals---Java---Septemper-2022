import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



        int evenSum =0;
        for (int i = 0; i <numbers.length ; i++) {
            int currNum = numbers[i];
            if(currNum%2==0){
                evenSum+=currNum;
            }


        }
        System.out.println(evenSum);

    }
}
