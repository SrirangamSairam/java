public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number) {
        if(number<=1) {
            return -1;
        }
        else {
            boolean flag = false;
            int prime = 2;
            for(int i=number;i>2;i--) {
                if(number%i==0) {
                    flag = false;
                    for(int j=2;j<=Math.sqrt(i);j++) {
                        if(i%j==0) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        prime = i;
                        break;
                    }
                }
            }
            return prime;
        }
    }
}