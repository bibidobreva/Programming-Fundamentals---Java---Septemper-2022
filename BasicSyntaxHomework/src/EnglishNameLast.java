import java.util.Scanner;

public class EnglishNameLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int n = number.length();
        int m = n-1;
        char name = number.charAt(m);

        switch (name)
        {
            case '1':
                System.out.println("one");
                break;
            case '2':
                System.out.println("two");
                break;
            case '3':
                System.out.println("three");
                break;
            case '4':
                System.out.println("four");
                break;
            case '5':
                System.out.println("five");
                break;
            case '6':
                System.out.println("six");
                break;
            case  '7':
                System.out.println("seven");
                break;
            case '8':
                System.out.println("eight");
                break;
            case '9':
                System.out.println("nine");
                break;
            case '0':
                System.out.println("zero");
                break;
        }
    }
}
