import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotation; i++) {
            int firstNum = numbersArr[0];

            for (int j = 0; j < numbersArr.length-1; j++) {
                int oldNum = numbersArr[j+1];
                numbersArr[j]=oldNum;

            }
            numbersArr[numbersArr.length-1]=firstNum;

        }
        for(int item: numbersArr){
            System.out.print(item+" ");
        }
    }
}
