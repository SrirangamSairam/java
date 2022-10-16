package com.saipackage;

import java.util.*;

public class UniqueKeywordAnalyzerImplementation implements KeywordAnalyzer{

    private Set<String> keywordsSet;

    public UniqueKeywordAnalyzerImplementation() {
        this.keywordsSet = new LinkedHashSet<>();
    }

    @Override
    public void recordKeyword(String keyword) {
        keywordsSet.add(keyword);
    }

    @Override
    public List<String> getAllKeywords() {
        return new ArrayList<>(keywordsSet);
    }
}
