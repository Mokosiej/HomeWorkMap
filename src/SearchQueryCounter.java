import java.util.HashMap;
import java.util.Map;

public class SearchQueryCounter {
    private static final int MAX_COUNT = 100;
    private Map<String, Integer> searchCounts;

    public SearchQueryCounter() {
        searchCounts = new HashMap<>();
    }

    public int search(String query) {
        searchCounts.putIfAbsent(query, 0);

        int currentCount = searchCounts.get(query);
        if (currentCount < MAX_COUNT) {
            searchCounts.put(query, currentCount + 1);
        }

        return searchCounts.get(query);
    }
}
