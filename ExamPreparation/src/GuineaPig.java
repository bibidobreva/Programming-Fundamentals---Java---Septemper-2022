import java.util.Scanner;
import java.util.SortedMap;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double guineaWeightKg = Double.parseDouble(scanner.nextLine());
        boolean isValid = true;
        int dayCount = 1;

        double foodGram = foodKg * 1000;
        double hayGram = hayKg * 1000;
        double coverGram = coverKg * 1000;
        double guineaGram = guineaWeightKg * 1000;

        while (dayCount <= 30) {

            foodGram -= 300;
            if (foodGram <= 0) {
                isValid = false;
                break;
            }
            if (dayCount % 2 == 0) {
                hayGram -= foodGram * 0.05;
                if (hayGram <= 0) {
                    isValid = false;
                    break;
                }
            }
            if (dayCount % 3 == 0) {
                coverGram -= guineaGram *(1.0/ 3);
                if (coverGram <= 0) {
                    isValid = false;
                    break;
                }
            }


            dayCount++;
        }
        foodGram = foodGram / 1000;
        hayGram=hayGram/1000;
        coverGram=coverGram/1000;
        if (isValid) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGram, hayGram, coverGram);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
