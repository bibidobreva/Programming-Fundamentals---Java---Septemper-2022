import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> character = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current==' '){
                continue;
            }else {
                character.putIfAbsent(current,0);
                character.put(current,character.get(current)+1);
            }
        }


        for (Map.Entry<Character, Integer> entry : character.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
