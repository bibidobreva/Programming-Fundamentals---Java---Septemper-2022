import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courseList = new LinkedHashMap<>();
        String input;
       while (!(input=scanner.nextLine()).equals("end")){
           String course = input.split(" : ")[0];
           String name = input.split(" : ")[1];

           if(!courseList.containsKey(course)){
               courseList.put(course,new ArrayList<>());
           }
           courseList.get(course).add(name);


       }
        for (Map.Entry<String, List<String>> entry : courseList.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for(String item: entry.getValue()){
                System.out.printf("-- %s%n",item);
            }
        }

    }
}
