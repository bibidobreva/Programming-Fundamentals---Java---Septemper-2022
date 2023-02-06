import java.util.Scanner;

public class FromLeftToRightME {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            long firstNumber = Long.parseLong(scanner.next());
            long secondNumber = Long.parseLong(scanner.next());
            long sum=0;

            if(firstNumber>secondNumber){
                while(firstNumber!=0){
                sum = Math.abs(sum + firstNumber%10);
                firstNumber = Math.abs(firstNumber/10);
                }
                System.out.println(sum);
            }else {
                while (secondNumber>0){
                    sum=Math.abs(sum+secondNumber%10);
                    secondNumber=Math.abs(secondNumber/10);
                }
                System.out.println(sum);
            }

        }
    }
}
