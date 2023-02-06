import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> classes = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String input;
        while (!(input = scanner.nextLine()).equals("course start")) {
            String[] inputString = input.split(":");
            String command = inputString[0];
            String lesson = inputString[1];

            if (command.equals("Add")) {
                if (!classes.contains(lesson)) {
                    classes.add(lesson);
                }
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(inputString[2]);
                if (!classes.contains(lesson)) {
                    classes.add(index, lesson);
                }

            } else if (command.equals("Remove")) {
                if(classes.contains(lesson)){
                    classes.remove(lesson);
                    int indexLesson = classes.indexOf(lesson);
                    if(classes.get(indexLesson+1).equals(lesson+"-Exercise")){
                        classes.remove(indexLesson+1);
                    }
                }
            } else if (command.equals("Swap")) {
                String lessonTwo = inputString[2];

                if(classes.contains(lesson)&&classes.contains(lessonTwo)){
                    int indexOne = classes.indexOf(lesson);
                    int indexTwo = classes.indexOf(lessonTwo);

                    classes.set(indexOne,lessonTwo);
                    classes.set(indexTwo,lesson);


                    String exerciseOne = lesson+"-Exercise";
                    String exerciseTwo = lessonTwo+"-Exercise";

                    if (classes.contains(exerciseOne)) {
                        classes.remove(exerciseOne);
                        classes.add(indexTwo+1,exerciseOne);
                    }

                    if(classes.contains(exerciseTwo)){
                        classes.remove(exerciseTwo);
                        classes.add(indexOne+1,exerciseTwo);
                    }
                }
            } else if (command.equals("Exercise")) {
                int indexLesson = classes.indexOf(lesson);
                String exercise = lesson+"-Exercise";

                if(classes.contains(lesson)){
                    if(indexLesson==classes.size()-1){
                        classes.add(exercise);
                    } else if (!classes.get(indexLesson+1).equals(exercise)) {
                        classes.add(indexLesson+1,exercise);
                    }
                }else {
                    classes.add(lesson);
                    classes.add(exercise);
                }

            }
        }


        for(int i = 0; i<classes.size();i++){
            System.out.printf("%d.%s%n",i+1,classes.get(i));
        }
    }
}
