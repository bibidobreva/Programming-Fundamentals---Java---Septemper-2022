import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> message = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input;
        while (!(input = scanner.nextLine()).equals("3:1")) {
            String[] command = input.split(" ");
            if (command[0].equals("merge")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                for (int i = startIndex; i < endIndex; i++) {
                    if (startIndex == message.size() - 1) {
                        break;
                    }
                    message.set(startIndex, message.get(startIndex) + message.get(startIndex + 1));
                    message.remove(startIndex + 1);
                }

            } else if (command[0].equals("divide")) {
                int index = Integer.parseInt(command[1]);
                int partitions = Integer.parseInt(command[2]);

                int parted = message.get(index).length();
                if (parted % partitions == 0) {
                    String text = message.get(index);
                    message.remove(index);
                    int numChar = parted / partitions;
                    int count = 1;
                    for (int i = 1; i <= partitions; i++) {
                        String newText = "";
                        for (int k = count; k < count * i; k++)
                        {

                            newText += text.charAt(k);

                        }
                        message.add(index, newText);
                        if (count == 1) {
                            count = 0;
                        }
                        count += 3;
                    }


                } else if (parted%partitions!=0) {
                    String text = message.get(index);
                    message.remove(index);
                    int numChar = parted / partitions;
                    int count = 1;
                    for (int i = 1; i <= partitions; i++) {
                        String newText = "";
                        for (int k = count; k < count * i; k++)
                        {

                            newText += text.charAt(k);

                            if(k== text.length()-1){
                                message.add(index,newText);
                                newText="";
                                for (int j = text.length()-1-k; j<text.length();j++){
                                    newText+=text.charAt(j);
                                }

                            }

                        }
                        message.add(index, newText);
                        if (count == 1) {
                            count = 0;
                        }
                        count += 3;
                    }
                }


            }

        }
    }
}
