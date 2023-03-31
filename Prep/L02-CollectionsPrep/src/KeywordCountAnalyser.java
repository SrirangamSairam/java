import java.util.*;

public class KeywordCountAnalyser implements KeywordAnalyser{

    private Map<String, Integer> keywordsWithCount;

    public KeywordCountAnalyser() {
        keywordsWithCount = new HashMap<>();
    }

    @Override
    public void recordKeyword(String keyword) {
        if(keywordsWithCount.containsKey(keyword)) {
            keywordsWithCount.put(keyword, keywordsWithCount.get(keyword)+1);
        } else
            keywordsWithCount.put(keyword,1);
    }

    @Override
    public List<String> getAllKeywords() {
        return new ArrayList<>(keywordsWithCount.keySet());
    }

    @Override
    public List<KeywordCount> getKeywordsWithCount() {
        List<KeywordCount> list = new ArrayList<>();
        for(String keyword : keywordsWithCount.keySet()) {
            list.add(new KeywordCount(keyword, keywordsWithCount.get(keyword)));
        }
        return list;
    }

    @Override
    public List<String> topNSearches(int n) {
        List<KeywordCount> list = new ArrayList<>();
        for (String keyword: keywordsWithCount.keySet()) {
            list.add(new KeywordCount(keyword, keywordsWithCount.get(keyword)));
        }
        list.sort(new Comparator<KeywordCount>() {
            @Override
            public int compare(KeywordCount k1, KeywordCount k2) {
                return k2.getCount() - k1.getCount();
            }
        });
        List<String> newList = new ArrayList<>();
        for(KeywordCount keywordCount: list) {
            newList.add(keywordCount.getKeyword());
        }
//        int count = 0;
//        for(KeywordCount keywordCount: list) {
//            newList.add(keywordCount.getKeyword());
//            count++;
//            if(count>=n)
//                break;
//        }
//        return newList;
        // better approach below
        return newList.subList(0,n);
    }
}
