import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchQueryCounter counter = new SearchQueryCounter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите поисковый запрос (или \"exit\" для выхода):");
        while (true) {
            String query = scanner.nextLine();
            if (query.equalsIgnoreCase("exit")) {
                break;
            }
            int count = counter.search(query);
            System.out.printf("Запрос \"%s\" был выполнен %d раз(а)%n", query, count);
        }

        String testQuery = "тест";
        for (int i = 0; i < 105; i++) {
            int count = counter.search(testQuery);
            System.out.printf("Запрос \"%s\" был выполнен %d раз(а)%n", testQuery, count);
        }


    }
}
