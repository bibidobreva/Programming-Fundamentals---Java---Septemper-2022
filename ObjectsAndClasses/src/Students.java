import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;

        }
        public int getAge(){
            return this.age;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        String inputLine = scanner.nextLine();


        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");
            String firstname = arrStudentData[0];
            String lastName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String town = arrStudentData[3];

            Student currentStudent = new Student(firstname,lastName,age,town);
            studentsList.add(currentStudent);


            inputLine = scanner.nextLine();
        }
        String hometown = scanner.nextLine();

        for(Student item: studentsList){
            if(item.getTown().equals(hometown)){
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
