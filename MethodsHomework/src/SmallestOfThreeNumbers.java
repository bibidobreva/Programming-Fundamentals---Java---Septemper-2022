import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int smallest = smallestNumber(a,b,c);
        System.out.println(smallest);

    }
    public static int smallestNumber(int a, int b, int c){
        int small;
        if(a<b&&a<c){
            small=a;
        } else if (b<a&& b<c) {
            small=b;
        }else {
            small=c;
        }
        return small;
    }
}
