public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(1/26);
//        System.out.println(1%26);
//        char a = (char)66;
//        System.out.println(a);
        System.out.println(convertToTitle(731));
    }


    public static String convertToTitle(int columnNumber) {
        return columnNumber == 0 ? "" : convertToTitle(--columnNumber / 26) + (char)('A' + (columnNumber % 26));
    }
}