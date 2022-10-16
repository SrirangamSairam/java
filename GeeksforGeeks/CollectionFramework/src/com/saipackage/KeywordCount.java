package com.saipackage;

public class KeywordCount {
    private int count;
    private String keyword;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    public String toString() {
        return "KeywordCount{" +
                "keyword='" + keyword + '\'' +
                ", count=" + count +
                '}';
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public KeywordCount(String keyword, int count) {
        this.count = count;
        this.keyword = keyword;
    }
}
