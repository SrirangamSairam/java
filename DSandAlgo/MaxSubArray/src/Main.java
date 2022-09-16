public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int maxSoFar= Integer.MIN_VALUE;
        int maxEndingHere=0;
        for(int num : nums) {
            maxEndingHere += num;
            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}