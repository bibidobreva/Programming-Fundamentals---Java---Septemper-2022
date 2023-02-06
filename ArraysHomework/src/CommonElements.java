import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for(int i = 0; i<secondArr.length; i++){
            for(int k = 0; k<firstArr.length; k++){
                if(firstArr[k].equals(secondArr[i])){
                    System.out.print(firstArr[k]+" ");
                }
            }
        }

    }
}
