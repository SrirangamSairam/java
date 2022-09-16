public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString1("Hello world! "));
        System.out.println(reverseString2("Hello world! "));
//        String test = "Hell";
//        System.out.println(test.charAt(1));
    }
    public static String reverseString1(String givenString) {
        char[] reverseArray = new char[givenString.length()];
        for(int i=0;i<reverseArray.length;i++) {
            reverseArray[reverseArray.length-i-1] = givenString.charAt(i);
        }
        return new String(reverseArray);
    }
    public static String reverseString2(String givenString) {
        StringBuffer rstr = new StringBuffer(givenString);
        //or
        //StringBuilder rstr = new StringBuilder(givenString);
        //stringbuffer for multi threaded system as it is synchronized and thread safe
        //stringbuilder for single threaded system as it is not synchronized and is not thread safe
        return rstr.reverse().toString();
    }
}