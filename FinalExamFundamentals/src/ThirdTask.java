import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> followerComments = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> followerLikes = new LinkedHashMap<>();

        String input;
        while (!(input=scanner.nextLine()).equals("Log out")){
            String command = input.split(":\\s+")[0];

            if(command.equals("New follower")){
                String follower = input.split(":\\s+")[1].trim();
                if(!followerComments.containsKey(follower)){
                    followerComments.put(follower,0);
                    followerLikes.put(follower,0);
                }

            } else if (command.equals("Like")) {
                String follower = input.split(":\\s+")[1].trim();
                int count = Integer.parseInt(input.split(":\\s+")[2].trim());

                if(!followerLikes.containsKey(follower)){
                    followerLikes.put(follower,count);
                    followerComments.put(follower,0);
                }else {
                    followerLikes.put(follower,followerLikes.get(follower)+count);
                }

            } else if (command.equals("Comment")) {
                String follower = input.split(":\\s+")[1].trim();
                if(!followerComments.containsKey(follower)){
                    followerComments.put(follower,1);
                    followerLikes.put(follower,0);
                }else {
                    followerComments.put(follower,followerComments.get(follower)+1);
                }

            } else if (command.equals("Blocked")) {
                String follower = input.split(":\\s+")[1].trim();
                if(!followerComments.containsKey(follower)){
                    System.out.printf("%s doesn't exist.%n",follower);
                }else {
                    followerComments.remove(follower);
                    followerLikes.remove(follower);
                }

            }

        }
        int count = followerComments.size();
        System.out.printf("%d followers%n",count);

        for (Map.Entry<String, Integer> entry : followerComments.entrySet()) {
            String username = entry.getKey();
            int likesComments = entry.getValue()+followerLikes.get(username);
            System.out.printf("%s: %d%n",username,likesComments);
        }


    }
}
