public class Main {
    public static final String ERROR_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        for(int i = 0; i <= 12; i++) {
            numberToWords(i);
            System.out.println();
        }
    }
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println(ERROR_MESSAGE);
        }else {
            int count = getDigitCount(number);
            number = reverse(number);
            while(number!=0) {
                switch (number % 10) {
                    case 0 -> System.out.print("Zero ");
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                }
                number /= 10;
                count--;
            }
            while(count!=0) {
                System.out.print("Zero ");
                count--;
            }
        }
    }
    public static int reverse(int number) {
        int reverse = 0;
        while(number!=0) {
            reverse = reverse * 10 + number%10;
            number /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if(number<0) {
            return -1;
        }else if(number == 0) {
            return 1;
        }else {
            int count = 0;
            while(number!=0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }
}