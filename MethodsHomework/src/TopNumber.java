import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i<=n; i++){
            isTopNumber(i);
        }

    }

    public static boolean sumDivisibleByEight(int a) {
        String num = a + "";
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int current = Integer.parseInt("" + num.charAt(i));
            sum += current;
        }
        if (sum % 8 == 0) {
            return true;
        } else return false;
    }


    public static boolean holdsOddDigit(int a){
        String num = a+"";
        int count=0;
        for (int i = num.length()-1;i>=0;i--){
            int current = Integer.parseInt(""+num.charAt(i));
            if(current%2!=0){
                count++;
            }
        }
        if(count>=1){
            return true;
        }else return false;
    }

    public static void isTopNumber(int a){
        if(holdsOddDigit(a)&&sumDivisibleByEight(a)){
            System.out.println(a);
        }
    }
}
