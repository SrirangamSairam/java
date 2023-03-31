public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(singleNumber(new int[]{2,2,1}));
    }

//    public static int singleNumber(int[] nums) {
//        if(nums.length == 1) return nums[0];
//        boolean flag = false;
//        for(int i=0;i<nums.length;i++) {
//            flag = false;
//            for(int j=0;j<nums.length;j++) {
//                if(i!=j) {
//                    if (nums[i] == nums[j]) {
//                        flag = true;
//                        break;
//                    }
//                }
//            }
//            if(!flag) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i: nums) {
            result ^= i;
        }
        return result;
    }
}