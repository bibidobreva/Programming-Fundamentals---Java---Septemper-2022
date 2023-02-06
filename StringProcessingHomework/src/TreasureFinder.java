import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input;
        StringBuilder hiddenMessage = new StringBuilder();
        int count = 0;

        while(!(input = scanner.nextLine()).equals("find")){
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                int currentInt = numbers[count];
                count++;
                if(count>=numbers.length){
                    count=0;
                }
                int newChar = current-currentInt;
                char charToAdd =(char) newChar;
                hiddenMessage.append(charToAdd);



            }
            int fistTypeIndex = hiddenMessage.indexOf("&")+1;
            int lastTypeIndex = hiddenMessage.lastIndexOf("&");
            int firstCorIndex = hiddenMessage.indexOf("<")+1;
            int lastCorIndex = hiddenMessage.indexOf(">");

            String type = hiddenMessage.substring(fistTypeIndex,lastTypeIndex);
            String coordinate = hiddenMessage.substring(firstCorIndex,lastCorIndex);
            System.out.printf("Found %s at %s%n",type,coordinate);
            count=0;
            hiddenMessage=new StringBuilder();

        }

    }
}
