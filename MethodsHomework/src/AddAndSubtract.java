import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int result = subtract(sum(a,b),c);
        System.out.println(result);
    }
    public static int sum(int fist, int second){
        return fist+second;
    }
    public static int subtract(int first, int second){
        return first-second;
    }
}
