import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String biggestKeg = "";

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            long height = Long.parseLong(scanner.nextLine());

            double volume = Math.PI*(radius*radius)*height;

            if(volume>max){
                max = volume;
                biggestKeg=name;
            }



        }
        System.out.println(biggestKeg);
    }
}
