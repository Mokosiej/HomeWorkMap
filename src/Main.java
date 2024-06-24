import java.util.Scanner;

public static void main(String[] args) {
    SearchQueryCounter counter = new SearchQueryCounter();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите поисковый запрос (или \"exit\" для выхода):");
    while (true) {
        String query = scanner.nextLine();
        if (query.equalsIgnoreCase("exit")) {
            break;
        }
        counter.search(query);
    }


    String testQuery = "тест";
    for (int i = 0; i < 105; i++) {
        counter.search(testQuery);
    }
}
