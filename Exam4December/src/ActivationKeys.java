import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();

        String input;
        while (!(input = scanner.nextLine()).equals("Generate")) {
            String[] commands = input.split(">>>");
            String command = commands[0];
            if (command.equals("Contains")) {
                String substring = commands[1];
                if(rawKey.contains(substring)){
                    System.out.printf("%s contains %s%n",rawKey,substring);
                }else {
                    System.out.println("Substring not found!");
                }
            } else if (command.equals("Flip")) {
                String upperLower = commands[1];
                int startIndex = Integer.parseInt(commands[2]);
                int endIndex = Integer.parseInt(commands[3]);

                if(upperLower.equals("Upper")){
                    String substring=rawKey.substring(startIndex,endIndex).toUpperCase();
                    String start = rawKey.substring(0,startIndex);
                    String end = rawKey.substring(endIndex);
                    rawKey=start+substring+end;
                    System.out.println(rawKey);
                } else if (upperLower.equals("Lower")) {
                    String substring = rawKey.substring(startIndex,endIndex).toLowerCase();
                    String start = rawKey.substring(0,startIndex);
                    String end = rawKey.substring(endIndex);
                    rawKey=start+substring+end;
                    System.out.println(rawKey);
                }

            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);
                String start = rawKey.substring(0,startIndex);
                String end = rawKey.substring(endIndex);
                rawKey=start+end;
                System.out.println(rawKey);

            }

        }
        System.out.printf("Your activation key is: %s",rawKey);
    }
}
