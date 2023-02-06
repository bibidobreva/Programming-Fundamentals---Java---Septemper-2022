import java.util.Scanner;

public class BalancedBracketsME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean balance = true;
        int count = 0;
        int closed=0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            if(line.equals("(")){
                count++;
            } else if (line.equals(")")) {
                closed++;
            }

            if(line.equals(")")&&count<1){
                balance=false;
            }
            if(count==closed){
                count=0;
                closed=0;
            }
            if(count>1||closed>1)
            {
                balance=false;
            }


        }
        if (balance) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
