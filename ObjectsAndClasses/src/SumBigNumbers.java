import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondsNum = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNum.add(secondsNum);
        System.out.println(sum);
    }
}
