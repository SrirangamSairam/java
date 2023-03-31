import java.util.List;

public interface KeywordAnalyser {

    void recordKeyword(String keyword);

    List<String> getAllKeywords();

    default List<KeywordCount> getKeywordsWithCount() {
        return null;
    }

    default List<String> topNSearches(int n) {
        return null;
    }
}
