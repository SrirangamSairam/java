public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char[] s = new char[]{'a','b','c','d','e'};
        reverseString(s);
        for(char ch: s) {
            System.out.print(ch + " ");
        }
    }

    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++) {
            s[i] = (char) (s[s.length-1-i] + s[i]);
            s[s.length-1-i] = (char) (s[i] - s[s.length-1-i]);
            s[i] = (char) (s[i] - s[s.length-1-i]);
        }
    }
}