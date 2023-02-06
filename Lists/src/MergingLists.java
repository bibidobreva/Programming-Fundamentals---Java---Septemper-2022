import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int size = Math.min(first.size(), second.size());
        for (int i = 0; i < size; i++) {
            int firstList = first.get(i);
            int secondList = second.get(i);

            result.add(firstList);
            result.add(secondList);

        }
        if(first.size()>second.size()){
            result.addAll(first.subList(size,first.size()));

        }else if(second.size()>first.size()){
            result.addAll(second.subList(size,second.size()));
        }

        for(int item:result){
            System.out.print(item+" ");
        }


}

}
