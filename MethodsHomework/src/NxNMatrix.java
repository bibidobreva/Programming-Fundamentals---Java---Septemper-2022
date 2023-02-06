import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        matrix(n);

    }
    public static void line(int num){
        for(int i = 0; i<num; i++){
            System.out.print(num+" ");
        }
        System.out.println("");
    }
    public static void matrix(int number){
        for(int i = 0; i<number; i++){
            line(number);
        }
    }
}
