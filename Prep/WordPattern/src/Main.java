import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(wordPattern("abba","dog cat cat fish"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(pattern.length()!=strArr.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(strArr[i])) return false;
            }
            else {
                if(map.containsValue(strArr[i])) return false;
                map.put(pattern.charAt(i),strArr[i]);
            }
        }
        return true;
    }
}