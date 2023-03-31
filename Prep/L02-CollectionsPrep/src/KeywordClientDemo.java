public class KeywordClientDemo {
    public static void main(String[] args) {
//        KeywordAnalyser keywordAnalyser = new KeywordAnalyserImpl();
//        KeywordAnalyser keywordAnalyser = new UniqueKeywordAnalyser();
        KeywordAnalyser keywordAnalyser = new KeywordCountAnalyser();
        keywordAnalyser.recordKeyword("Mobile");
        keywordAnalyser.recordKeyword("IPad");
        keywordAnalyser.recordKeyword("Laptop");
        keywordAnalyser.recordKeyword("Mobile");
        keywordAnalyser.recordKeyword("IPad");
        keywordAnalyser.recordKeyword("Laptop");
        keywordAnalyser.recordKeyword("Laptop");
        keywordAnalyser.recordKeyword("Laptop");
        keywordAnalyser.recordKeyword("Mobile");
        keywordAnalyser.recordKeyword("Mouse");
        keywordAnalyser.recordKeyword("Mouse");
        keywordAnalyser.recordKeyword("Mouse");
        keywordAnalyser.recordKeyword("Mouse");
        for(String keyword: keywordAnalyser.getAllKeywords()) {
            System.out.println(keyword);
        }
        for(KeywordCount keywordCount: keywordAnalyser.getKeywordsWithCount()) {
            System.out.println(keywordCount);
        }

        for(String keyword: keywordAnalyser.topNSearches(2)) {
            System.out.println(keyword);
        }
    }

}
