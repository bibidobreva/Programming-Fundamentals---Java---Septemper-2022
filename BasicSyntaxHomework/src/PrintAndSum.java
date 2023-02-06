import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        int sum=0;

        for(int i = first; i<=last ;i++)
        {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
