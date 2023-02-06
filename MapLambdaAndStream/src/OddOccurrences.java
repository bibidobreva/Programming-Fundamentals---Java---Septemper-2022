import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word: inputArr) {
            word = word.toLowerCase();

            wordsMap.putIfAbsent(word,0);
            wordsMap.put(word,wordsMap.get(word)+1);

        }
        List<String> newWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            int value = entry.getValue();
            if(value%2!=0){
                newWords.add(entry.getKey());
            }

        }
        System.out.printf("%s%n",String.join(", ",newWords));

    }
}
