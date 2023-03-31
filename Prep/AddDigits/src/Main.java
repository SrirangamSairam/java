public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
//        if(num<10) return num;
//        int sum = 0;
//        while (num>0) {
//            sum+=num%10;
//            num /= 10;
//            if(num==0&&sum>9) {
//                num = sum;
//                sum = 0;
//            }
//        }
//        return sum;
        if(num==0) return 0;
        return num%9==0?9:num%9;
    }
}