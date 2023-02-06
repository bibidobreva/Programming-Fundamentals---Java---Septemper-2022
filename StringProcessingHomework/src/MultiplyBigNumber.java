import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String big = scanner.nextLine();
        int small = Integer.parseInt(scanner.nextLine());
        StringBuilder outputNumber = new StringBuilder();

        if (big.charAt(0) == '0') {
            System.out.println(0);
        } else if (big.isEmpty()) {
            System.out.println(0);

        } else if (small > 0) {
            int count = 0;
            for (int i = big.length() - 1; i >= 0; i--) {
                String bigNumChar = big.charAt(i) + "";
                int bigNum = Integer.parseInt(bigNumChar);
                int multiply = bigNum * small + count;
                String result = multiply + "";
                if (result.length() == 2) {
                    String counting = result.charAt(0) + "";
                    count = Integer.parseInt(counting);
                } else {
                    count = 0;
                }
                String numToAdd = "";
                if (result.length() > 1) {
                    numToAdd = result.charAt(1) + "";
                } else {
                    numToAdd = result.charAt(0) + "";
                }

                outputNumber.append(numToAdd);

                if (i == 0 && count > 0) {
                    outputNumber.append(count);
                }
            }
            outputNumber.reverse();
            System.out.println(outputNumber);
        } else if (small < 0) {
            small = Math.abs(small);
            int count = 0;
            for (int i = big.length() - 1; i >= 0; i--) {
                String bigNumChar = big.charAt(i) + "";
                int bigNum = Integer.parseInt(bigNumChar);
                int multiply = bigNum * small + count;
                String result = multiply + "";
                if (result.length() == 2) {
                    String counting = result.charAt(0) + "";
                    count = Integer.parseInt(counting);
                } else {
                    count = 0;
                }
                String numToAdd = "";
                if (result.length() > 1) {
                    numToAdd = result.charAt(1) + "";
                } else {
                    numToAdd = result.charAt(0) + "";
                }

                outputNumber.append(numToAdd);

                if (i == 0 && count > 0) {
                    outputNumber.append(count);
                }
            }
            outputNumber.append("-");
            outputNumber.reverse();
            System.out.println(outputNumber);
        } else {
            System.out.println("0");
        }

    }
}
