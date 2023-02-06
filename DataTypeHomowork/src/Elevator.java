import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleTraveling = Integer.parseInt(scanner.nextLine());
        int peopleCapacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(1.0*peopleTraveling/peopleCapacity);
        System.out.printf("%.0f",courses);

    }
}
