import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printNumberSign(num);


    }

    public static void printNumberSign(int number){
        if(number<0){
            System.out.printf("The number %d is negative.",number);
        } else if (number==0) {
            System.out.printf("The number %d is zero.",number);
        } else  {
            System.out.printf("The number %d is positive.",number);
        }
    }
}
