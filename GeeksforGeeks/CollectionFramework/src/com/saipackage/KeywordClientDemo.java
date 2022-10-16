package com.saipackage;

public class KeywordClientDemo {
    public static void main(String[] args) {
//        KeywordAnalyzer keywordAnalyzer = new KeywordAnalyzerImplementation();
//        KeywordAnalyzer keywordAnalyzer = new UniqueKeywordAnalyzerImplementation();
        KeywordAnalyzer keywordAnalyzer = new KeywordCountAnalyzer();
        keywordAnalyzer.recordKeyword("phone");
        keywordAnalyzer.recordKeyword("tablet");
        keywordAnalyzer.recordKeyword("tablet");
        keywordAnalyzer.recordKeyword("laptop");
        keywordAnalyzer.recordKeyword("laptop");
        keywordAnalyzer.recordKeyword("laptop");
        keywordAnalyzer.recordKeyword("laptop");
        keywordAnalyzer.recordKeyword("laptop");
        keywordAnalyzer.recordKeyword("phone");
        keywordAnalyzer.recordKeyword("phone");
        keywordAnalyzer.recordKeyword("phone");
        for(String keyword: keywordAnalyzer.getAllKeywords()) {
            System.out.println(keyword);
        }
        for (KeywordCount keywordCount: keywordAnalyzer.getKeywordsWithCount()) {
            System.out.println(keywordCount);
        }
        System.out.println("______________________________________________");
        for(KeywordCount keywordCount: keywordAnalyzer.topTenSearches()) {
            System.out.println(keywordCount);
        }
    }
}
