import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());

       double result =  calculate(firstNum,operator,secondNum);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));



    }
    private static double calculate(double a, String op, double b){
        double result = 0.0;
        switch (op){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
        }
        return result;
    }
}
