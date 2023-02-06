import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = 1.00*sum/(numbers.size());

        List<Integer> newNumbers = new ArrayList<>();
        for(int num:numbers){
            if(num>average){
                newNumbers.add(num);
            }
        }

        Collections.sort(newNumbers);
        Collections.reverse(newNumbers);

        if(newNumbers.size()==0){
            System.out.println("No");
        } else if (newNumbers.size()>=5) {
            for(int i = 0; i<5; i++){
                System.out.print(newNumbers.get(i)+" ");
            }
        } else if (newNumbers.size()<5) {
            for(int i=0; i<newNumbers.size();i++){
                System.out.print(newNumbers.get(i)+" ");
            }
        }

    }
}
