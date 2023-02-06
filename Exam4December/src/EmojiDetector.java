import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern emoji = Pattern.compile("(::[A-Z][a-z]{2,}::)|(\\*\\*[A-Z][a-z]{2,}\\*\\*)");
        Matcher emojiMatcher = emoji.matcher(text);

        List<String> emojis = new ArrayList<>();
        while (emojiMatcher.find()) {
            emojis.add(emojiMatcher.group());
        }

        Pattern numbers = Pattern.compile("[0-9]");
        Matcher numberMatcher = numbers.matcher(text);
        long coolness = 1;
        while (numberMatcher.find()) {
            int current = Integer.parseInt(numberMatcher.group());
            coolness *= current;
        }
        BigInteger number = BigInteger.valueOf(coolness);
        System.out.println("Cool threshold: " + number);

        if (emojis.size() > 0) {
            System.out.println(emojis.size() + " emojis found in the text. The cool ones are: ");

            for (String item : emojis) {
                String current = item.replaceAll("\\*|:", "");
                long cool = 0;
                for (int i = 0; i < current.length(); i++) {

                    cool += current.charAt(i);
                }
                if (cool >= coolness) {
                    System.out.println(item);
                }
            }
        }

    }
}
