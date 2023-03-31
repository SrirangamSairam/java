public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(lengthOfLastWord("Hello World "));
    }
    public static int lengthOfLastWord(String s) {
//        String[] arr = s.split(" ");
//        return arr[arr.length-1].length();
        s = s.trim();
        System.out.println(s.lastIndexOf(" "));
        return s.length()-s.lastIndexOf(" ")-1;
    }
}