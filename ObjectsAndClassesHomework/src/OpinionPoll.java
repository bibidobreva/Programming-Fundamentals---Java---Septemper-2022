import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
        public String toString(){
            String result = String.format("%s - %d",this.name, this.age);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> listPerson = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person current = new Person(name,age);
            listPerson.add(current);
        }

        for(Person result: listPerson){
            if(result.getAge()>30){
                System.out.println(result.toString());
            }
        }
    }
}
