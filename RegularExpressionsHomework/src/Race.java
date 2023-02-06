import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> participatePoints = new LinkedHashMap<>();
        for (String participant : participants) {
            participatePoints.put(participant, 0);
        }

        String input;
        while(!(input=scanner.nextLine()).equals("end of race")){
            Pattern name = Pattern.compile("[A-Z]*[a-z]*");
            Pattern points = Pattern.compile("\\d");
            Matcher nameM = name.matcher(input);
            Matcher pointsM = points.matcher(input);
            String endName = "";
            while(nameM.find()){
                endName+= nameM.group();
            }
            int sumPoints = 0;
            while(pointsM.find()){
                sumPoints+=Integer.parseInt(pointsM.group());
            }
            if(participatePoints.containsKey(endName)){
                participatePoints.put(endName,participatePoints.get(endName)+sumPoints);
            }

        }
        List<String> nameLast = new LinkedList<>();
        participatePoints.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).forEach(p -> nameLast.add(p.getKey()));

        System.out.printf("1st place: %s%n2nd place: %s%n3rd place: %s%n",nameLast.get(0),nameLast.get(1),nameLast.get(2));
    }
}
