import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        String input;
        while(!(input=scanner.nextLine()).equals("end")){
            String command = input.split(" ")[0];
            
            if(command.equals("swap")){
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int number1 = numbers[index1];
                int number2 = numbers[index2];

                numbers[index1]=number2;
                numbers[index2]=number1;

                
            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int number1 = numbers[index1];
                int number2 = numbers[index2];
                numbers[index1]=number1*number2;
                
            } else if (command.equals("decrease")) {
                for(int i = 0;i<numbers.length;i++){
                    numbers[i]-=1;
                }
                
            }

        }
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\]]",""));
    }
}
