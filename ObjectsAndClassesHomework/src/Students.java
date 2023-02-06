import java.util.*;

public class Students {

    static class Student{
        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }
        @Override
        public String toString(){
            return String.format("%s %s: %.2f", this.firstName, this.lastName,this.grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String first = input[0];
            String second = input[1];
            double grade = Double.parseDouble(input[2]);
            Student current = new Student(first,second,grade);
            studentList.add(current);
        }
        studentList.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for(Student output: studentList){
            System.out.println(output.toString());
        }
    }
}
