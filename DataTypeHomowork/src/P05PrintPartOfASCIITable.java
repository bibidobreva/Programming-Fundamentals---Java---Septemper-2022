import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = firstSymbol; i<=lastSymbol; i++){
            char currentSymbol =(char)i;
            System.out.print(currentSymbol+" ");
        }
    }
}
