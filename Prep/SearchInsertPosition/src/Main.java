public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
    }
//    public static int searchInsert(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++) {
//            if(nums[i]==target || nums[i]>target) {
//                return i;
//            }
//        }
//        return nums.length;
//    }
    //above solution is O(n)
    public static int searchInsert(int[] nums, int target) {
       int left = 0;
       int right = nums.length-1;
       int mid = 0;
       while (left<=right) {
           if(target<nums[left]) return left;
           if(target>nums[right]) return right+1;

           mid = (left+right)/2;

           if(target == nums[mid]) return mid;
           else if (target>nums[mid]) {
               left = mid+1;
           } else {
               right = mid - 1;
           }
       }
       return -1;
    }
}