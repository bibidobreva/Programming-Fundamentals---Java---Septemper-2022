import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numberSnowballs = Long.parseLong(scanner.nextLine());
        double bestSnowball = Integer.MIN_VALUE;
        double snowballValue;

        String result = "";

        for (int snowball = 0; snowball < numberSnowballs; snowball++) {
            long snowballSnow = Long.parseLong(scanner.nextLine());
            long snowballTime = Long.parseLong(scanner.nextLine());
            long snowballQuality = Long.parseLong(scanner.nextLine());



            snowballValue = Math.pow((1.0*snowballSnow/snowballTime), snowballQuality);
            if (snowballValue > bestSnowball) {
                bestSnowball = snowballValue;


                    result = String.format("%d : %d = %.0f (%d)", snowballSnow, snowballTime, bestSnowball, snowballQuality);

            }

        }
        System.out.println(result);
    }
}
