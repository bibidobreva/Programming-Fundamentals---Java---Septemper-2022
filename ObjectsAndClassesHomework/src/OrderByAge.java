import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person {
        private String name;
        private int ID;
        private int age;

        public Person(String name, int ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getID() {
            return this.ID;
        }

        public int getAge() {
            return this.age;
        }

        public String toString(){
            return String.format("%s with ID: %d is %d years old.", this.name, this.ID, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String name = input.split(" ")[0];
            int ID = Integer.parseInt(input.split(" ")[1]);
            int age = Integer.parseInt(input.split(" ")[2]);
            Person current = new Person(name, ID, age);
            people.add(current);

        }



        people.sort(Comparator.comparingInt(Person::getAge));
        for(Person item:people ){
            System.out.println(item.toString());
        }

    }
}
