import java.util.Scanner;

public class DecryptingMessageME {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String secretMessage="";

        for(int i = 0; i<lines;i++){
            char hiddenCharacter =scanner.nextLine().charAt(0);
            char character = (char)(hiddenCharacter+key);
            secretMessage+=character;

        }
        System.out.println(secretMessage);
    }
}
