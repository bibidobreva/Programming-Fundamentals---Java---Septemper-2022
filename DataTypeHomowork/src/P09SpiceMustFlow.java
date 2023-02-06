import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long spice = Long.parseLong(scanner.nextLine());
        long spiceHarvested = 0;
        int days = 0;


        while (spice > 0) {
            if (spice < 100) {
                if (spiceHarvested > 26) {
                    spiceHarvested -= 26;
                    break;
                } else {
                    break;
                }
            }


            spiceHarvested += spice - 26;
            spice -= 10;
            days++;

        }
            System.out.println(days);
            System.out.println(spiceHarvested);

    }
}
