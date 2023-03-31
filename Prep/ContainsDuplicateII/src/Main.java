import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++) {
            if(i>k) {
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) return true;
        }
        return false;


//        for(int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length&&j<=i+k;j++) {
//               if(nums[i]==nums[j]) {
//                   return true;
//               }
//            }
//        }
//        return false;
    }
}