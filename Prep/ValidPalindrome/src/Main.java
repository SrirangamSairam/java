public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome("sa @i"));
    }

//    public static boolean isPalindrome(String s) {
//        String s1="";
//        for(int i=0;i<s.length();i++) {
//            if(s.codePointAt(i)<=90 && s.codePointAt(i)>=65 || s.codePointAt(i)<=122 && s.codePointAt(i)>=97 || s.codePointAt(i)<=57 && s.codePointAt(i)>=48) {
//              s1 = s1 + s.charAt(i);
//            }
//        }
//        s1 = s1.toLowerCase();
//        for(int i=0;i<s1.length();i++) {
//            if(!(s1.charAt(i)==s1.charAt(s1.length()-i-1))) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=0;i<s.length();i++) {
            if(!(s.charAt(i)==s.charAt(s.length()-i-1))) {
                return false;
            }
        }
        return true;
    }
}