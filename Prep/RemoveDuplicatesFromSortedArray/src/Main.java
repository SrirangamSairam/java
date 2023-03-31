public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = new int[]{-1,-1,0,0,1,2,2,3,4,4,4,5,6,6,7,7,7,7,10,10,11};
//        for(int i: removeDuplicates(arr)) {
//            System.out.print(i);
//        }
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
//        int count = 1;
//        for(int i=0;i<nums.length;i++) {
//            for (int j=i+1;j<nums.length;j++) {
//                if(nums[i]<nums[j]) {
//                    int temp = nums[i+1];
//                    nums[i+1]=nums[j];
//                    nums[j]=temp;
//                    break;
//                }
//            }
//        }
//        for(int i=0;i<nums.length-1;i++) {
//            if(nums[i]<nums[i+1]) {
//                count++;
//            } else {
//                break;
//            }
//        }
//        System.out.println("count "  + count);
//        return nums;
        int i = nums.length>0 ? 1 : 0;
        for (int n : nums)
            if(n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}