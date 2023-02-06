import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> plantsRare = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> plantsRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantAndRarity = scanner.nextLine().split("<->");
            String plant = plantAndRarity[0];
            int rarity = Integer.parseInt(plantAndRarity[1]);
            if (!plantsRare.containsKey(plant)) {
                plantsRare.put(plant, rarity);
                plantsRating.put(plant,new ArrayList<>());
            } else {
                plantsRare.replace(plant, rarity);
            }

        }

        String commands;

        while (!(commands = scanner.nextLine()).equals("Exhibition")) {
            String secondPart = commands.split(":\\s*")[1];
            String command = commands.split(":")[0];
            String plantName = secondPart.split("\\s*-\\s*")[0];
            if (!plantsRare.containsKey(plantName)) {
                System.out.println("error");
            } else {

                if (command.equals("Rate")) {
                    String plant = secondPart.split("\\s*-\\s*")[0];
                    double rating = Double.parseDouble(secondPart.split("\\s*-\\s*")[1]);
                    plantsRating.putIfAbsent(plant, new ArrayList<>());
                    plantsRating.get(plant).add(rating);

                } else if (command.equals("Update")) {
                    String plant = secondPart.split("\\s*-\\s*")[0];
                    int rarity = Integer.parseInt(secondPart.split("\\s*-\\s*")[1]);
                    plantsRare.replace(plant, rarity);


                } else if (command.equals("Reset")) {

                    String plant = secondPart.split("\\s*-\\s*")[0];
                    plantsRating.replace(plant, new ArrayList<>());
                }
            }
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsRare.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = 0;
            if (plantsRating.get(plant).size() > 1) {
                averageRating = plantsRating.get(plant).stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            } else if (plantsRating.get(plant).size()==1) {
                averageRating=plantsRating.get(plant).get(0);
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant, rarity, averageRating);
        }

    }
}
