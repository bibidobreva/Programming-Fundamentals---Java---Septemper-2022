import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol,secondSymbol));
                break;
            case "string":
                String fistText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(fistText,secondText));
                break;
        }

    }
    public static int getMax(int fistNum, int secondNum){
        if(fistNum>secondNum){
            return fistNum;
        }else {
            return secondNum;
        }
    }
    public static char getMax(char fistSymbol, char secondSymbol){
        if(fistSymbol>secondSymbol){
            return fistSymbol;
        }else {
            return secondSymbol;
        }
    }
    public static String getMax(String fistText, String secondText){
        if(fistText.compareTo(secondText)>0){
            return fistText;
        }else {
            return secondText;
        }
    }
}
