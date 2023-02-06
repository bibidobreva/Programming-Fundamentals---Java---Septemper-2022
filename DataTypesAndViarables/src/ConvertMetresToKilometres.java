import java.util.Scanner;

public class ConvertMetresToKilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short metres = Short.parseShort(scanner.nextLine());
        double km = metres/1000.0;
        System.out.printf("%.2f",km);


    }
}
