import java.awt.geom.Arc2D;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            double current = numbers.get(i);
            double next = numbers.get(i + 1);
            if (current == next) {
                numbers.set(i, current + next);
                numbers.remove(i + 1);
                i=-1;
            }

        }
        for (double item : numbers) {
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.print(df.format(item) + " ");


        }

    }


}
