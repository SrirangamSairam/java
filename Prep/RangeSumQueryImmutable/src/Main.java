public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class NumArray {

    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++) {
            sum += this.nums[i];
        }
        return sum;
    }
}