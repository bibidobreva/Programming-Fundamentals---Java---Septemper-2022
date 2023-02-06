import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitPerDay = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int competitionAmount = Integer.parseInt(scanner.nextLine());
        double allBiscuit = 0;


        for (int i = 1; i <= 30; i++) {
            int dayAmount = workersCount * biscuitPerDay;
            if (i % 3 == 0) {
                double dayThree = Math.floor((dayAmount * 0.75));
                allBiscuit += dayThree;
            } else {
                allBiscuit += dayAmount;
            }

        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", allBiscuit);
        if (competitionAmount > allBiscuit) {
            double difference = competitionAmount - allBiscuit;
            double percent = difference / competitionAmount * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percent);

        } else {
            double difference = allBiscuit - competitionAmount;
            double percent = difference / competitionAmount * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        }
    }
}
