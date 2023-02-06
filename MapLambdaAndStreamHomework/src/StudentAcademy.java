import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!students.containsKey(name)){
                students.put(name,new ArrayList<>());
            }
            students.get(name).add(grade);

        }

        for (Map.Entry<String, List<Double>> entry: students.entrySet()) {
           double average =  entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
           if(average>=4.50){
               System.out.printf("%s -> %.2f%n",entry.getKey(),average);
           }
        }

    }
}
