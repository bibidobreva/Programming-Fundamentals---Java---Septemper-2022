import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int removeCount = 0;


        while (distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < distance.size()) {

                int removed = distance.get(index);
                distance.remove(index);
                removeCount+=removed;
                for (int i = 0; i < distance.size(); i++) {
                    if (distance.get(i) <= removed) {
                        distance.set(i, distance.get(i) + removed);
                    } else {
                        distance.set(i, distance.get(i) - removed);
                    }

                }


            } else if (index < 0) {
                int removed = distance.get(0);
                distance.remove(0);
                removeCount+=removed;
                int lastElement = distance.get(distance.size() - 1);
                distance.add(lastElement);
                for (int i = 0; i < distance.size(); i++) {
                    if (distance.get(i) <= removed) {
                        distance.set(i, distance.get(i) + removed);
                    } else {
                        distance.set(i, distance.get(i) - removed);
                    }

                }


            } else if (index >= distance.size()) {
                int removed = distance.get(distance.size() - 1);
                distance.remove(distance.size() - 1);
                removeCount+=removed;
                int firstElement = distance.get(0);
                distance.add(firstElement);

                for (int i = 0; i < distance.size(); i++) {
                    if (distance.get(i) <= removed) {
                        distance.set(i, distance.get(i) + removed);
                    } else {
                        distance.set(i, distance.get(i) - removed);
                    }

                }


            }

        }

        System.out.println(removeCount);

    }
}
