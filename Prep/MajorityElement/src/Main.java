public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(majorityElement(new int[]{1,2,3,2,2,2,2}));
    }

    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
        int count = 1;
        int curr = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(count == 0) {
                curr = nums[i];
                count++;
            } else if (curr == nums[i]) {
                count++;
            }else
                count--;
        }
        return curr;
    }
}