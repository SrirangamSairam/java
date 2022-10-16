package com.saipackage;

import java.util.List;

public interface KeywordAnalyzer {
    void recordKeyword(String keyword);
    List<String> getAllKeywords();

    default List<KeywordCount> getKeywordsWithCount() {
        return null;
    }

    default List<KeywordCount> topTenSearches() {return null;}
}
