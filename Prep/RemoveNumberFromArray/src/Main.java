public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i: removeElement(new int[]{0,1,2,2,3,0,4,2},2)) {
            System.out.print(i);
        }
    }

    public static int[] removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==val) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        return nums;
    }
}