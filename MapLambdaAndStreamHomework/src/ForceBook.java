import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        LinkedHashMap<String, List<String>> usersMap = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String user = input.split("\\s+\\|\\s+")[1];
                String side = input.split("\\s+\\|\\s+")[0];

                if (!usersMap.containsKey(side)) {
                    usersMap.put(side, new ArrayList<>());
                }
                boolean exist = false;
                for (List<String> users : usersMap.values()) {
                    if (users.contains(user)) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {
                    usersMap.get(side).add(user);
                }


            } else if (input.contains("->")) {
                String user = input.split("\\s+->\\s+")[0];
                String side = input.split("\\s+->\\s+")[1];
                boolean exist = false;

                for (List<String> users : usersMap.values()) {
                    if (users.contains(user)) {
                        exist = true;
                        users.remove(user);
                    }
                }
                if (!usersMap.containsKey(side)) {
                    usersMap.put(side,new ArrayList<>());


                }

                if (exist) {
                    usersMap.get(side).add(user);
                } else {
                    usersMap.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,side);

            }


        }


        for (Map.Entry<String, List<String>> entry : usersMap.entrySet()) {
            if(entry.getValue().size()>0){
                System.out.printf("Side: %s, Members: %s%n",entry.getKey(),entry.getValue().size());
                for(String userList: entry.getValue()){
                    System.out.println("! "+userList);
                }
            }
        }

    }
}
