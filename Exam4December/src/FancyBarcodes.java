import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Pattern pattern = Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+");
            Matcher matcher = pattern.matcher(barcode);

            if(matcher.find()){
                Pattern group = Pattern.compile("[0-9]+");
                Matcher matchGroup = group.matcher(barcode);
                String groupProduct="";
                if(matchGroup.find()){
                    groupProduct+=matchGroup.group();
                    while (matchGroup.find()){
                        groupProduct+=matchGroup.group();
                    }
                    System.out.printf("Product group: %s%n",groupProduct);
                }else {
                    System.out.println("Product group: 00");
                }
            }else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
