public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(mySqrt(5));
    }
//    public static int mySqrt(int x) {
//        if(x == 0||x == 1) return x;
//        if(x == 2||x == 3) return 1;
//        int[] diff = new int[2];
//        diff[0] = x;
//        for(int i=1;i<=x/2+1;i++) {
//            diff[1] = x-(i*i);
//            if(diff[1]>diff[0] || diff[1]==0) {
//                return i;
//            } else if (diff[1]<=0) {
//                return i-1;
//            } else
//                diff[0] = diff[1];
//        }
//        return -1;
//    }
    public static int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
}

// 290 = 2,5,10,29,58,145