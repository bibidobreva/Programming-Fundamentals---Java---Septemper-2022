import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i<=n; i++)
        {
            for(int x = 1; x<=i; x++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
