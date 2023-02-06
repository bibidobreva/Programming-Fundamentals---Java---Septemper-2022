import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 'a'; i<('a'+n);i++){
            for(int j='a'; j<('a'+n);j++){
                for(int k='a'; k<('a'+n);k++){
                    char firstSymbol = (char)i;
                    char secondSymbol = (char)j;
                    char thirdSymbol = (char)k;
                    System.out.printf("%c%c%c%n",firstSymbol,secondSymbol,thirdSymbol);
                }
            }
        }
    }
}
