import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = 1;


        LinkedHashMap<String, Integer> items = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> trash = new LinkedHashMap<>();
        String winName = "";
        while (count <= 1) {
            int countOdd = 1;
            int countEven = 0;
            String input = scanner.nextLine().toLowerCase();
            String[] inputArr = input.split("\\s++");
            for (int i = 0; i < inputArr.length / 2; i++) {

                int quantity = Integer.parseInt(inputArr[countEven]);
                String material = inputArr[countOdd];


                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (!items.containsKey(material)) {
                        items.put(material, quantity);
                    } else {
                        items.put(material, items.get(material) + quantity);
                    }
                    if (items.get(material) >= 250) {


                        if (count == 1) {
                            switch (material) {
                                case "shards":
                                    winName = "Shadowmourne";
                                    break;
                                case "fragments":
                                    winName = "Valanyr";
                                    break;
                                case "motes":
                                    winName = "Dragonwrath";
                                    break;
                            }
                            items.put(material, items.get(material) - 250);


                            count++;
                            break;

                        }
                    }
                } else {
                    if (!trash.containsKey(material)) {
                        trash.put(material, quantity);
                    } else {
                        trash.put(material, trash.get(material) + quantity);
                    }
                }


                countEven += 2;
                countOdd += 2;
            }
        }

            System.out.println(winName + " obtained!");
        items.putIfAbsent("shards",0);
        items.putIfAbsent("motes",0);
        items.putIfAbsent("fragments",0);

        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n",items.get("shards"),items.get("fragments"),items.get("motes"));
        trash.forEach((key, value) ->
                System.out.printf("%s: %d%n", key, value));

    }
}
