import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                                        .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> countMap = new TreeMap<>();

        for (double num:numbersArray) {
            if(!countMap.containsKey(num)){
                countMap.put(num,1);
            }else {
                countMap.put(num,countMap.get(num)+1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            double key = entry.getKey();
            int value = entry.getValue();
            DecimalFormat df = new DecimalFormat("#.####");
            System.out.printf("%S -> %d%n",df.format(key),value);
        }


    }
}
