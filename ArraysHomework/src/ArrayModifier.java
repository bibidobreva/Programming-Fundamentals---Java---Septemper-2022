import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

        String input;
        while (!(input = scanner.nextLine()).equals("end")) {
            String[] command = input.split(" ");
            if (command.length == 1) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            } else {
                if (command[0].equals("swap")) {
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    long oldNum = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = oldNum;


                } else if (command[0].equals("multiply")) {
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);

                    numbers[index1] = numbers[index1] * numbers[index2];

                }
            }

        }
        for(int i = 0; i<numbers.length-1;i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length-1]);
    }
}
