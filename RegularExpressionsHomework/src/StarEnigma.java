import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attack = new ArrayList<>();
        List<String> destroy = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            //s,t,a,r
            //sum as ascii
            //remove value from every
            String input = scanner.nextLine();
            Pattern star = Pattern.compile("[s]|[t]|[a]|[r]|[S]|[T]|[A]|[R]");
            Matcher countStar = star.matcher(input);
            String allChar = "";
            while(countStar.find()){

                allChar+=countStar.group();
            }
            int count = allChar.length();
            StringBuilder message = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                int current = input.charAt(j)-count;
                message.append((char)current);
            }

            Pattern extract = Pattern.compile("@(?<planetName>[A-Za-z]*)[^@:!\\->]?:(?<population>\\d+)[^@:!\\->]*?!(?<attackDefend>A|D)![^@:!\\->]*?->(?<soldures>\\d+)");
            Matcher matcher = extract.matcher(message);

            if(matcher.find()){
                String planetName = matcher.group("planetName");
                String attackOrDestroy = matcher.group("attackDefend");


                if(attackOrDestroy.equals("A")){
                    attack.add(planetName);
                } else if (attackOrDestroy.equals("D")) {
                    destroy.add(planetName);
                }
            }

        }
        int attackPlanets = attack.size();
        int destroyedPlanets = destroy.size();

        System.out.printf("Attacked planets: %d%n",attackPlanets);
        Collections.sort(attack);
        Collections.sort(destroy);
        for(String item: attack){
            System.out.printf("-> %s%n",item);
        }
        System.out.printf("Destroyed planets: %d%n",destroyedPlanets);
        for (String item:destroy){
            System.out.printf("-> %s%n",item);
        }


    }
}
