import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] fileArr = input.split("\\\\");
        String file = fileArr[fileArr.length-1];

        int fileIndex = input.lastIndexOf('.')+1;
        String fileType = input.substring(fileIndex);
        int nameIndex = file.indexOf('.');
        String fileName = file.substring(0,nameIndex);

        System.out.printf("File name: %s%nFile extension: %s%n",fileName,fileType);
    }
}
