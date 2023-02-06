import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demonsNames = scanner.nextLine().split(",\\s*");

        for (int i = 0; i < demonsNames.length; i++) {
            String currentDemon = demonsNames[i].replaceAll("\\s+","");
            Pattern health = Pattern.compile("[^+\\-*%\\.\\d\\/]");
            Matcher healthM = health.matcher(currentDemon);

            StringBuilder healthSymbols = new StringBuilder();
            while(healthM.find()){
                healthSymbols.append(healthM.group());
            }
            int healthPoint =0;
            for (int j = 0; j < healthSymbols.length(); j++) {
                healthPoint+=healthSymbols.charAt(j);
            }

            Pattern damage = Pattern.compile("(?<operator>[-+]?)(?<digit>\\d+\\.?\\d*)");
            Matcher damageM = damage.matcher(currentDemon);
            double demonDamage = 0;
            while(damageM.find()){
                String current = damageM.group("operator");
                double num = Double.parseDouble(damageM.group("digit"));
                if(current.equals("-")){
                    demonDamage-=num;
                }else {
                    demonDamage+=num;
                }
            }

            Pattern multiplyDivide = Pattern.compile("[*\\/]");
            Matcher multiplyDivideM = multiplyDivide.matcher(currentDemon);
            while(multiplyDivideM.find()){
                String operator = multiplyDivideM.group();
                if(operator.equals("*")){
                    demonDamage*=2;
                } else if (operator.equals("/")) {
                    demonDamage/=2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n",currentDemon,healthPoint,demonDamage);

        }
    }
}
