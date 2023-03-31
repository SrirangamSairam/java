public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int n: countBits(64)) {
            System.out.print(n+" ");
        }
    }

    public static int[] countBits(int n) {
        int[] nums = new int[n+1];
        int number = n;
        for(int i=nums.length-1;i>=0;i--) {
            int rem;
            int bin = 0;
            int j=1;
            int count = 0;
            while (n>0) {
                rem = n%2;
                if(rem == 1) count++;
                bin += rem*j;
                j *= 10;
                n /= 2;
            }
            nums[i] = count;
            number--;
            n = number;
        }
        return nums;
    }
}