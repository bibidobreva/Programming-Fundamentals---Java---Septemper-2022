import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int num = Integer.parseInt(scanner.nextLine());
                num = printing(num);
                System.out.println(num);
                break;
            case "real":
                double number = Double.parseDouble(scanner.nextLine());
                number=printing(number);
                System.out.printf("%.2f",number);
                break;
            case"string":
                String input = scanner.nextLine();
                input=printing(input);
                System.out.println(input);
                break;
        }


    }
    public static int printing(int a){
        return a*2;
    }
    public static double printing(double a){
        return a*1.5;
    }
    public static String printing(String a){
        return "$"+a+"$";
    }
}
