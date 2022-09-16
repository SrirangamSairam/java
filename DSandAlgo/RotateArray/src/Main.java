public class Main {
    public static void main(String[] args) {
//        int[] newNums = rotate(new int[] {1,2,3,4,5,6,7},3);
        int[] newNums = rotate1(new int[] {1,2,3,4,5,6,7},3);
        for(int num: newNums) {
            System.out.println(num);
        }
    }
    public static int[] rotate(int[] nums, int k) {
        while(k>0) {
            int lastNum = nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = lastNum;
            k--;
        }
        return nums;
    }

    public static int[] rotate1(int[] nums, int k) {
        //call reverse function with whole array which reverses the array
        //then call reverse function with only array[0 to k-1] - this will reverse first k elements
        //then call reverse function with only array[k to nums.length-1] - this will reverse rest all elements
        //now k elements of the array are rotated.
        k=k%nums.length; // if k > n
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start<end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}