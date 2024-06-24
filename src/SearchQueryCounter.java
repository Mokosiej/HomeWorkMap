import java.util.HashMap;
import java.util.Map;


public class SearchQueryCounter {
    private static final int MAX_COUNT = 100;
    private Map<String, Integer> searchCounts;

    public SearchQueryCounter() {
        searchCounts = new HashMap<>();
    }

    public void search(String query) {
        if (!searchCounts.containsKey(query)) {
            searchCounts.put(query, 0);
        }

        int currentCount = searchCounts.get(query);
        if (currentCount < MAX_COUNT) {
            searchCounts.put(query, currentCount + 1);
        }

        System.out.printf("Запрос \"%s\" был выполнен %d раз(а)%n", query, searchCounts.get(query));
    }
}
