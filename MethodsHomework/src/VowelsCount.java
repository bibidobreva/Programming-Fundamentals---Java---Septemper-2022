import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int vowelsCount = vowelCount(text);
        System.out.println(vowelsCount);
    }
    public static int vowelCount(String text){
        int count = 0;
        text=text.toLowerCase(Locale.ROOT);
        for(int i = 0; i<text.length();i++){
            if(text.charAt(i)=='a'||text.charAt(i)=='o'||text.charAt(i)=='i'||text.charAt(i)=='e'||text.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
