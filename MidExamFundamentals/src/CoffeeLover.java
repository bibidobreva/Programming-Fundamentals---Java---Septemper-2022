import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffee = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i <n; i++){
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            if(command.equals("Include")){
                String item = input[1];
                coffee.add(item);
                
            } else if (command.equals("Remove")) {
                String ForL = input[1];
                int numberOfCoffee = Integer.parseInt(input[2]);
                if(ForL.equals("first")){
                    if(numberOfCoffee<coffee.size()){
                        for(int k = 0; k<numberOfCoffee; k++){
                            coffee.remove(0);
                        }
                    }

                } else if (ForL.equals("last")) {
                    if(numberOfCoffee<coffee.size()){
                        for(int j = 0; j<numberOfCoffee;j++){
                            coffee.remove(coffee.size()-1);
                        }
                    }
                }

            } else if (command.equals("Prefer")) {
                int indexOne = Integer.parseInt(input[1]);
                int indexTwo = Integer.parseInt(input[2]);
                if(indexOne>=0 && indexOne<coffee.size() && indexTwo>=0 && indexTwo<coffee.size()){
                    String one = coffee.get(indexOne);
                    String two = coffee.get(indexTwo);
                    coffee.set(indexOne,two);
                    coffee.set(indexTwo,one);
                }

                
            } else if (command.equals("Reverse")) {
                Collections.reverse(coffee);
            }

        }
        System.out.println("Coffees:");
        for(String item:coffee){
            System.out.print(item+" ");
        }

    }
}
