public class Main {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1,4,2}));
    }

    public static int missingNumber(int[] nums) {
//        int sum = (nums.length*(nums.length+1))/2;
//        for(int i: nums) {
//            sum -= i;
//        }
//        return sum;

        int res = 0;
        int i;
        for(i=0;i<nums.length;i++) {
            res ^= i^nums[i];
        }
        return res^i;
    }
}