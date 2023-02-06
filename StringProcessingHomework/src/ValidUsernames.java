import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usersName = scanner.nextLine().split(", ");

        for (int i = 0; i < usersName.length; i++) {

            if(isValid(usersName[i])){
                System.out.println(usersName[i]);
            }

        }
    }
    public static boolean isValid (String input){
        boolean valid = true;
        if(input.length()<3||input.length()>16){
            valid=false;
        }
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(!Character.isLetter(current)&&!Character.isDigit(current) && current!='-'&&current!='_'){
                valid=false;
            }
        }
        return valid;
    }
}
