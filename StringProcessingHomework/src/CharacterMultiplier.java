import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");
        String first = words[0];
        String second = words[1];

        System.out.println(multiplyByCharacter(first,second));

    }
    public static int multiplyByCharacter(String a, String b){
        int lengthDiff = Math.abs(a.length()-b.length());
        int length;
        if(a.length()>b.length()){
            length = a.length();
        }else {
            length=b.length();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if(i<length-lengthDiff){
                sum+=a.charAt(i)*b.charAt(i);
            }else {
                if(a.length()>b.length()){
                    sum+=a.charAt(i);
                }
                else {
                    sum+=b.charAt(i);
                }
            }

        }

       return  sum;
    }
}
