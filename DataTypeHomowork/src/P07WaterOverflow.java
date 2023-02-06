import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int literInTank=0;

        for (int i = 0; i <n ; i++) {
            int litersWater = Integer.parseInt(scanner.nextLine());
            literInTank+=litersWater;
            if(literInTank>255){
                System.out.println("Insufficient capacity!");
                literInTank-=litersWater;
            }

        }
        System.out.printf("%d",literInTank);
    }
}
