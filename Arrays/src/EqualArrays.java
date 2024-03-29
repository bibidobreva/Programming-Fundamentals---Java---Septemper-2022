import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstArr[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int secondArr[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isTrue = true;
        int index = 0;

        for(int i = 0; i<firstArr.length;i++){
            sum += firstArr[i];

            if(firstArr[i]!=secondArr[i]){
                isTrue=false;
                index = i;
                break;
            }

        }

        if(isTrue){
            System.out.println("Arrays are identical. Sum: "+sum);
        }else {
            System.out.println("Arrays are not identical. Found difference at "+index+" index.");
        }

    }
}
