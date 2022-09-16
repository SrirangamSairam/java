public class Main {
    public static void main(String[] args) {
        int[] newNums = moveZeroes(new int[] {1,0,0,3,12});
        for(int num : newNums) {
            System.out.print(num);
            System.out.print(" ");
        }
    }
    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=0) {
                nums[count++] = nums[i];
            }
        }
        while (count<nums.length) {
            nums[count++] = 0;
        }
        return nums;
    }
}