package com.saipackage;

import java.util.*;

public class KeywordCountAnalyzer implements KeywordAnalyzer{

    private Map<String, Integer> keywordCountMap;

    public KeywordCountAnalyzer() {
        this.keywordCountMap = new HashMap<>();
    }

    @Override
    public void recordKeyword(String keyword) {
        if(keywordCountMap.containsKey(keyword)) {
            keywordCountMap.put(keyword,keywordCountMap.get(keyword)+1);
        } else {
            keywordCountMap.put(keyword,1);
        }
    }

    @Override
    public List<String> getAllKeywords() {
        return new ArrayList<>(keywordCountMap.keySet());
    }

    @Override
    public List<KeywordCount> getKeywordsWithCount() {
        List<KeywordCount> list = new ArrayList<>();
        for(String keyword: keywordCountMap.keySet()) {
            list.add(new KeywordCount(keyword, keywordCountMap.get(keyword)));
        }
        return list;
    }

    @Override
//    public List<KeywordCount> topTenSearches() {
//        List<KeywordCount> list = new ArrayList<>();
//        for(String keyword: keywordCountMap.keySet()) {
//            list.add(new KeywordCount(keyword, keywordCountMap.get(keyword)));
//        }
//        list.sort(new Comparator<KeywordCount>() {
//            @Override
//            public int compare(KeywordCount keywordCount1, KeywordCount keywordCount2) {
//                return keywordCount2.getCount() - keywordCount1.getCount();
//            }
//        });
//        return list.subList(0,3);
//    }

    // in above function we are sorting the keywordCount list based on count variable
    // in below function we will use min heap on the keywordCountMap to get top n searches

    public List<KeywordCount> topTenSearches() {
        PriorityQueue<KeywordCount> minHeap = new PriorityQueue<>((keywordCount1, keywordCount2) -> keywordCount1.getCount() - keywordCount2.getCount());
        int i=0;
        for(String keyword: keywordCountMap.keySet()) {
            if(i < 2) {
                minHeap.add(new KeywordCount(keyword,keywordCountMap.get(keyword)));
            } else {
                KeywordCount top = minHeap.peek();
                if (top != null && top.getCount() < keywordCountMap.get(keyword)) {
                    minHeap.poll();
                    minHeap.add(new KeywordCount(keyword, keywordCountMap.get(keyword)));
                }
            }
            i++;
        }
        return new ArrayList<>(minHeap);
    }
}
