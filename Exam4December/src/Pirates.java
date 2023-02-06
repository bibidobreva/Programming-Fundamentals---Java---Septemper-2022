import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> townPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> townGold = new LinkedHashMap<>();

        String village;
        while (!(village = scanner.nextLine()).equals("Sail")) {
            String[] villageStats = village.split("\\|\\|");
            String town = villageStats[0];
            int population = Integer.parseInt(villageStats[1]);
            int gold = Integer.parseInt(villageStats[2]);

            if (!townPopulation.containsKey(town)) {
                townPopulation.put(town, population);
            } else {
                townPopulation.put(town, population + townPopulation.get(town));
            }

            if (!townGold.containsKey(town)) {
                townGold.put(town, gold);
            }else {
                townGold.put(town,townGold.get(town)+gold);
            }
        }


        String commands;
        while(!(commands=scanner.nextLine()).equals("End")){
            String command = commands.split("=>")[0];
            String town = commands.split("=>")[1];

            if(command.equals("Plunder")){
                int people = Integer.parseInt(commands.split("=>")[2]);
                int gold = Integer.parseInt(commands.split("=>")[3]);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                townPopulation.replace(town, townPopulation.get(town)-people);
                townGold.replace(town,townGold.get(town)-gold);
                if(townPopulation.get(town)==0||townGold.get(town)==0){
                    System.out.printf("%s has been wiped off the map!%n",town);
                    townGold.remove(town);
                    townPopulation.remove(town);
                }

            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(commands.split("=>")[2]);
                if(gold<0){
                    System.out.println("Gold added cannot be a negative number!");
                }else {
                    townGold.replace(town,townGold.get(town)+gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,town,townGold.get(town));
                }
            }
        }

        if(townPopulation.size()==0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",townPopulation.size());

            for (Map.Entry<String, Integer> entry : townPopulation.entrySet()) {
                String town = entry.getKey();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),entry.getValue(),townGold.get(town));
            }


        }
    }
}
