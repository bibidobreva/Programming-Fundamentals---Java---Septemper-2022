import java.util.Scanner;

public class PadwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightstabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());


        double lightS = Math.ceil(students*0.1) +students;
        int belts =students- (students/6);

        double all = (priceBelts*belts)+(lightS*priceLightstabers)+(priceRobes*students);

        if(all<=money){
            System.out.printf("The money is enough - it would cost %.2flv.",all);
        }else {
            double need = all-money;
            System.out.printf("George Lucas will need %.2flv more.",need);
        }
    }
}
