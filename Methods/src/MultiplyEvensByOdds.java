import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        String numberString = number+"";
        int[] numbers = Arrays.stream(numberString.split("")).mapToInt(Integer::parseInt).toArray();
        getMultiplyOfEvenAndOdd(numbers);


    }
    public static int evenSum(int[] even){
        int sum = 0;
        for(int i = 0; i <even.length;i++ ){
            if(even[i]%2==0){
                sum+=even[i];
            }
        }
        return sum;
    }
    public static int oddSum(int[] odd){
        int sum = 0;
        for(int i = 0; i<odd.length; i++){
            if(odd[i]%2!=0){
                sum+=odd[i];
            }
        }
        return sum;
    }
    public static void getMultiplyOfEvenAndOdd(int[] num){
        int oddSum = oddSum(num);
        int evenSum = evenSum(num);
        System.out.println(oddSum*evenSum);
    }
}
