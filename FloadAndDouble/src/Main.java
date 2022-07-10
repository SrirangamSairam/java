public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        float myFLoatMinValue = Float.MIN_VALUE;
        float myFLoatMaxValue = Float.MAX_VALUE;
        System.out.println("Min FLoat = " + myFLoatMinValue);
        System.out.println("Max FLoat = " + myFLoatMaxValue);
        
        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Min Double = " + myDoubleMinValue);
        System.out.println("Max Double = " + myDoubleMaxValue);

        int a = 5;
        float b = (float) 5;
        double c = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}