public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));//holl
    }

    public static String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        char[] chars = s.toCharArray();
        int len = s.length();
        for(int i=0,j=len-1;i<len && j>=0;i++) {
            if(s.toLowerCase().charAt(i)=='a'||s.toLowerCase().charAt(i)=='e'||s.toLowerCase().charAt(i)=='i'||s.toLowerCase().charAt(i)=='o'||s.toLowerCase().charAt(i)=='u') {
                if(s.toLowerCase().charAt(j)=='a'||s.toLowerCase().charAt(j)=='e'||s.toLowerCase().charAt(j)=='i'||s.toLowerCase().charAt(j)=='o'||s.toLowerCase().charAt(j)=='u') {

                }
                j--;
            }
        }
        return String.valueOf(result);
    }
}