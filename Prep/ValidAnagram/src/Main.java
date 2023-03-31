public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("+-","-+"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] chars = new int[26];
        for(int i=0;i<s.length();i++) {
            chars[s.charAt(i)-'A']++;
        }
        for(int i=0;i<t.length();i++) {
            chars[t.charAt(i)-'A']--;
        }
        for(int i: chars) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }

//    public static boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length()) return false;
//        List<Character> list = new ArrayList<>();
//        for(int i=0;i<s.length();i++) {
//            list.add(s.charAt(i));
//        }
//        for(int i=0;i<t.length();i++) {
//            list.remove(Character.valueOf(t.charAt(i)));
//        }
//        return list.size()==0;
//    }
}