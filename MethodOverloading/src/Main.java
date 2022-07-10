public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double centimeters = calcFeetAndInchesToCentimeters(5.0,7.0);
        double centimetersTwo = calcFeetAndInchesToCentimeters(10.0,5.0);
        double centimetersTwo1 = calcFeetAndInchesToCentimeters(-10,5.0);
        double centimetersTwo2 = calcFeetAndInchesToCentimeters(1.0,13.0);
        System.out.println(centimeters);
        System.out.println(centimetersTwo);
        System.out.println(centimetersTwo1);
        System.out.println(centimetersTwo2);
        double centimetersOne = calcFeetAndInchesToCentimeters(125);
        System.out.println(centimetersOne);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet>=0 && (inches>=0 && inches<=12)) {
            return (feet * 12 + inches) * 2.54;
        }else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches>=0) {
            return calcFeetAndInchesToCentimeters((int)(inches/12),inches%12);
        }else {
            return -1;
        }
    }
}