public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        System.out.println(maxValue);
        int newVal =  (minValue * 3 / 2);
        System.out.println(newVal);
        System.out.println(maxValue + 2);
        /* Cannot assign a value greater than max value to the data type,
           below expression throws an error "integer number too large"
           int newValue = 2222222222;
         */

        byte newByte1 = 125;
        short newShort1 = 12500;
        int newInt1 = 2147433647;
        long newLong1 = 50000L + (10L * (newByte1 + newShort1 + newInt1));
        System.out.println(newLong1);
    }
}