public class Main {
    public static void main(String[] args) {
        reverseRec("Hello world!");
    }

    public static void reverseRec(String text) {
        if(text.length()<=1) {
            System.out.print(text);
        }
        else {
            System.out.print(text.charAt(text.length()-1));
            reverseRec(text.substring(0,text.length()-1));
        }
    }
}