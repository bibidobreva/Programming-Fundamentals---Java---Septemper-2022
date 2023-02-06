import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String keyWord = scanner.nextLine();
            String valueSynonym = scanner.nextLine();

            if(!words.containsKey(keyWord)){
                words.put(keyWord,new ArrayList<>());
            }
            words.get(keyWord).add(valueSynonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }

    }
}
