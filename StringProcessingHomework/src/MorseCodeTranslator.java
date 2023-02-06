import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morseMessage = scanner.nextLine().split("\\s+\\|\\s+");
        List<String> message = new ArrayList<>();

        for (int i = 0; i < morseMessage.length; i++) {
            message.add(morseDecode(morseMessage[i]));
        }

        for (String item : message) {
            System.out.print(item + " ");
        }

    }

    static String morseDecode(String input) {
        String[] letters = input.split("\\s+");
        String word = "";
        for (int i = 0; i < letters.length; i++) {
            String morseLetter = letters[i];
            word += morseLetter(morseLetter);
        }
        return word;
    }

    static char morseLetter(String letter) {
        char returnChar = '0';
        switch (letter) {
            case ".-":
                returnChar = 'A';
            break;
            case "-...":
                returnChar = 'B';
            break;
            case "-.-.":
                returnChar = 'C';
            break;
            case "-..":
                returnChar = 'D';
            break;
            case ".":
                returnChar = 'E';
            break;
            case "..-.":
                returnChar = 'F';
            break;
            case "--.":
                returnChar = 'G';
            break;
            case "....":
                returnChar = 'H';
            break;
            case "..":
                returnChar = 'I';
            break;
            case ".---":
                returnChar = 'J';
            break;
            case "-.-":
                returnChar = 'K';
            break;
            case ".-..":
                returnChar = 'L';
            break;
            case "--":
                returnChar = 'M';
            break;
            case "-.":
                returnChar = 'N';
            break;
            case "---":
                returnChar = 'O';
            break;
            case ".--.":
                returnChar = 'P';
            break;
            case "--.-":
                returnChar = 'Q';
            break;
            case ".-.":
                returnChar = 'R';
            break;
            case "...":
                returnChar = 'S';
            break;
            case "-":
                returnChar = 'T';
            break;
            case "..-":
                returnChar = 'U';
            break;
            case "...-":
                returnChar = 'V';
            break;
            case ".--":
                returnChar = 'W';
            break;
            case "-..-":
                returnChar = 'X';
            break;
            case "-.--":
                returnChar = 'Y';
            break;
            case "--..":
                returnChar = 'Z';
            break;
        }
        return  returnChar;
    }
}
