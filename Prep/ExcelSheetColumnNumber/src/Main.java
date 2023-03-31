public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println('C'-'A');
        System.out.println(titleToNumber("ABC"));
    }

    public static int titleToNumber(String columnTitle) {
        int sum;
        int result = 0;
        for(int i=0;i<columnTitle.length();i++) {
            sum = columnTitle.charAt(i) - 64;
            result = (result * 26) + sum;
        }
        return result;
    }
}