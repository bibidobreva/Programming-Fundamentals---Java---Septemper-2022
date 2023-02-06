import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passenger = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        String input;
        while(!(input=scanner.nextLine()).equals("end")){
            String[] command = input.split(" ");

            if(command.length>1){
                int newPassengers = Integer.parseInt(command[1]);
                passenger.add(newPassengers);
            }else {
                int addPassenger = Integer.parseInt(command[0]);
                for(int i = 0; i<passenger.size();i++){
                    if(capacity-passenger.get(i)>=addPassenger){
                        passenger.set(i,passenger.get(i)+addPassenger);
                        break;
                    }
                }
            }
        }
        for(int wagon:passenger){
            System.out.print(wagon+" ");
        }
    }
}
