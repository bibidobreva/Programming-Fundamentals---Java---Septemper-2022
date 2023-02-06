import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] house = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        int houseIndex = 0;
        String input;
        while (!(input = scanner.nextLine()).equals("Love!")) {
            int jumpLength = Integer.parseInt(input.split(" ")[1]);
            houseIndex +=jumpLength;

            if(houseIndex>house.length-1){
                houseIndex=0;
            }

            if(house[houseIndex]>0){
                house[houseIndex]-=2;
                if(house[houseIndex]==0){
                    System.out.println("Place "+ houseIndex+" has Valentine's day.");
                }
            } else if (house[houseIndex]==0) {
                System.out.println("Place "+houseIndex+" already had Valentine's day.");
            }

        }
        System.out.println("Cupid's last position was " +houseIndex+".");
        int failed = 0;
        for(int item:house){
            if(item>0){
                failed++;
            }
        }

        if(failed>0){
            System.out.println("Cupid has failed "+ failed+" places.");
        }else {
            System.out.println("Mission was successful.");
        }
    }
}
