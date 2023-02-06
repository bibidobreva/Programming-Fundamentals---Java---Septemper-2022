import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        Random rndGenerator = new Random();
        for(int i = 0; i<words.length-1;i++){

            int index = rndGenerator.nextInt(words.length);
            int indexY = rndGenerator.nextInt(words.length);

            String oldWord = words[index];
            words[index]=words[indexY];
            words[indexY]=oldWord;

        }
        System.out.println(String.join(System.lineSeparator(),words));
    }

}
