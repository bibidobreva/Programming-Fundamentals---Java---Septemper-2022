import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        int n = Integer.parseInt(scanner.nextLine());


        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int phraseIndex = random.nextInt(phrases.length - 1);
            int eventIndex = random.nextInt(events.length - 1);
            int authorIndex = random.nextInt(authors.length - 1);
            int cityIndex = random.nextInt(cities.length - 1);

            String phrase = phrases[phraseIndex];
            String event = events[eventIndex];
            String author = authors[authorIndex];
            String city = cities[cityIndex];
            System.out.println(phrase+" "+event+" "+author+" - "+city+" ");

        }
    }
}
