public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int days = getDaysInMonth(2,2000);
        System.out.println(days);
    }
    public static boolean isLeapYear(int year) {
        if(year>=1 && year<=9999) {
            if(year%4==0) {
                if(year%100==0) {
                    return year % 400 == 0;
                }
                return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if((month<1||month>12)||(year<1||year>9999)) {
            return -1;
        }
        else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
//            switch(month) {
//                case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
//                case 2: return isLeapYear(year)? 29: 28;
//                case 4: case 6: case 9: case 11: return 30;
//                default: return -1;
//            }
        }
    }
}