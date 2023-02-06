import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble(scanner.nextLine());
        double heightInput = Double.parseDouble(scanner.nextLine());
        double result = calculateArea(widthInput,heightInput);
        System.out.printf("%.0f",result);
    }
    public static double calculateArea(double width, double height){
        return width*height;
    }

}
