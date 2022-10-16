public class Main {
    public static void main(String[] args) {
        int[] newNums = selectionSort(new int[] {8,12,6,10,4,2,6,0});
        for (int newNum: newNums) {
            System.out.println(newNum);
        }
        System.out.println("Hello world!");
    }

    public static int[] selectionSort(int[] nums) {
        for (int j=0;j<nums.length;j++) {
            int small = nums[j];
            int smallIndex = j;
            for (int i = j; i < nums.length; i++) {
                if (small > nums[i]) {
                    small = nums[i];
                    smallIndex = i;
                }
            }
            nums[smallIndex] = nums[j];
            nums[j] = small;
        }
        return nums;
    }
}