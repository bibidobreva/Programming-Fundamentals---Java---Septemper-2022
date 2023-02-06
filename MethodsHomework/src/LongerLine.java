import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());

        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());


        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());

        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());


        int firstLine = line(x1, x2, y1, y2);
        int secondLine = line(x3, x4, y3, y4);

        String longest = longestLine(firstLine, secondLine);


        if (longest.equals("first")) {
            if (point(x1, y1) > point(x2, y2)) {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            }
        } else if (longest.equals("second")) {
            if (point(x3, y3) < point(x4, y4)) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            }else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }
        }

        //(x1-x2)^2 + (y1-y2)^2
    }

    public static int line(int x1, int x2, int y1, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    public static String longestLine(int a, int b) {
        if (a > b) {
            return "first";
        } else if (a == b) {
            return "first";

        } else return "second";
    }

    public static int point(int a, int b) {
        return (a * a) + (b * b);
    }
}
