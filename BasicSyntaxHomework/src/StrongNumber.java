import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum=0;

        String number = num+"";
        int length = number.length();
        for(int i = 0; i<length; i++){

            int n = Integer.parseInt(""+number.charAt(i));
            int factorial=1;
            for(int x=n; x>=1; x--){
                factorial*=x;
            }
            sum+=factorial;
        }
        if(sum==num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
