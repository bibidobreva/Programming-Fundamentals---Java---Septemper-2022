import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());

        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        if(point(x1,y1)>point(x2,y2)){
            System.out.printf("(%d, %d)",x2,y2);
        }
        else {
            System.out.printf("(%d, %d)",x1,y1);
        }
    }
    public static int point(int a, int b){
        return (a*a)+(b*b);
    }

}
