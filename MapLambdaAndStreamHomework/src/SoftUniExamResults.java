import java.util.LinkedHashMap;

import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> studentsPoints = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageSub = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("exam finished")) {
            if (input.contains("banned")) {
                String banned = input.split("-")[0];
                studentsPoints.remove(banned);
            } else {
                String name = input.split("-")[0];
                String language = input.split("-")[1];
                Integer points = Integer.parseInt(input.split("-")[2]);
                studentsPoints.putIfAbsent(name, points);
                if(studentsPoints.containsKey(name)){
                    if(points>studentsPoints.get(name)){
                        studentsPoints.put(name,points);
                    }
                }

                if (!languageSub.containsKey(language)) {
                    languageSub.put(language, 1);
                } else {
                    languageSub.put(language, languageSub.get(language) + 1);
                }


            }

        }
        System.out.println("Results:");
        studentsPoints.forEach((key, value) ->
                System.out.printf("%s | %d%n", key, value));
        System.out.println("Submissions:");
        languageSub.forEach((key, value) ->
                System.out.printf("%s - %d%n", key, value));

    }
}
