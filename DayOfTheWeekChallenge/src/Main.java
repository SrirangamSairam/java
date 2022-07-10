public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int day = 90;
        printDayOfTheWeek(day);
        printNumberInWord(day);
    }
    public static void printNumberInWord(int number) {
        switch(number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Enter correct day in the week");
        }
        if(day == 0)
            System.out.println("Sunday");
        else if (day ==1)
            System.out.println("Monday");
        else if (day ==2)
            System.out.println("Monday");
        else if (day ==3)
            System.out.println("Monday");
        else if (day ==4)
            System.out.println("Monday");
        else if (day ==5)
            System.out.println("Monday");
        else if (day ==6)
            System.out.println("Monday");
        else
            System.out.println("when day");
//        switch (day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Enter correct day in the week");
//                break;
//        }
    }
}