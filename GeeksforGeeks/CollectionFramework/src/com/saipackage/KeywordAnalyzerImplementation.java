package com.saipackage;

import java.util.ArrayList;
import java.util.List;

public class KeywordAnalyzerImplementation implements KeywordAnalyzer{

    private List<String> keywords;

    public KeywordAnalyzerImplementation() {
        this.keywords = new ArrayList<>();
    }

    @Override
    public void recordKeyword(String keyword) {
        this.keywords.add(keyword);
    }

    @Override
    public List<String> getAllKeywords() {
        return this.keywords;
    }
}
