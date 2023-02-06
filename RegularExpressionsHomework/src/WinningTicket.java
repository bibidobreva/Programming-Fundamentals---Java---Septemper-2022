import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] tickets = scanner.nextLine().split("\\s*,\\s*");
        for (String ticket:tickets) {
            if(ticket.length()!=10){
                continue;
            }

        }
    }
}
