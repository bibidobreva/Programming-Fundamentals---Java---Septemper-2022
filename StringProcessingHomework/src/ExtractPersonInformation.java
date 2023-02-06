import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            int startNameIndex = input.indexOf("@")+1;
            int endNameIndex = input.indexOf("|");
            int startAgeIndex = input.indexOf("#")+1;
            int endAgeIndex = input.indexOf("*");

            String name = input.substring(startNameIndex,endNameIndex);
            String age = input.substring(startAgeIndex,endAgeIndex);
            System.out.printf("%s is %s years old.%n",name,age);

        }
    }

}
