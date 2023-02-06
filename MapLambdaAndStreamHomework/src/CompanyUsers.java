import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> companyList = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            if (!companyList.containsKey(company)) {
                companyList.put(company, new ArrayList<>());
            }

            if (!companyList.get(company).contains(id)) {
                companyList.get(company).add(id);
            }
        }

        for (Map.Entry<String, List<String>> entry : companyList.entrySet()) {
            System.out.println(entry.getKey());
            for(String item: entry.getValue()){
                System.out.println("-- "+item);
            }
        }

    }
}
