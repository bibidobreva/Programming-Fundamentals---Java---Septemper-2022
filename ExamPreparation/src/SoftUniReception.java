import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());


        int allEmployeeHour = employeeOne + employeeTwo + employeeThree;
        int hours = 0;

        while (!(studentCount <= 0)) {
            hours++;
            if (hours % 4 != 0) {
                studentCount -= allEmployeeHour;
            }
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
