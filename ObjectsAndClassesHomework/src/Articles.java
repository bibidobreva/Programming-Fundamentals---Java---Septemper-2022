import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {

    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String toString(){
            String result = String.format("%s - %s: %s", this.title, this.content, this.author);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        Article newArticle = new Article(input[0],input[1],input[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input1 = scanner.nextLine().split(": ");
            String command = input1[0];
            if(command.equals("Edit")){
                newArticle.setContent(input1[1]);
            } else if (command.equals("ChangeAuthor")) {
                newArticle.setAuthor(input1[1]);
            } else if (command.equals("Rename")) {
                newArticle.setTitle(input1[1]);
            }

        }
        System.out.println(newArticle.toString());

    }
}
