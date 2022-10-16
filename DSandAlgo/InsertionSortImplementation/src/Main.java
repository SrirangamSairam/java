public class Main {
    public static void main(String[] args) {
        int[] newNums = insertionSort(new int[] {8,12,6,10,4,2,6,0});
        for (int newNum: newNums) {
            System.out.println(newNum);
        }
        System.out.println("Hello world!");
    }

    private static int[] insertionSort(int[] nums) {
        for(int i=1;i<nums.length;i++) {
           int key = nums[i];
           int j = i-1;
           while (j>=0 && nums[j]>key) {
               nums[j+1] = nums[j];
               nums[j] = key;
               j--;
           }
        }
        return nums;
    }

}