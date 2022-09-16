public class Main {
    public static void main(String[] args) {
        int[] newNums = bubbleSort(new int[] {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0});
        for (int newNum : newNums) {
            System.out.println(newNum);
        }
        System.out.println("Hello world!");
    }

    public static int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length-1;j++) {
                if(nums[j]>nums[j+1]) {
                    nums[j+1] = nums[j+1] + nums[j];
                    nums[j] = nums[j+1] - nums[j];
                    nums[j+1] = nums[j+1] - nums[j];
                }
            }
        }
        return nums;
    }
}