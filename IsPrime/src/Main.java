public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int count = 0;
//        for(int i = 1, count =0; i <= 100 && count < 3; i++) {
//            if(isPrime(i)) {
//                System.out.println(i + " is prime");
//                count++;
//            }
//        }
        for(int i = 1; i <= 1000; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime");
                count++;
                System.out.println(count);
            }
            if(count==3)
                break;
        }
    }
    public static boolean isPrime(int num) {
        if(num<=1){
            return false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}