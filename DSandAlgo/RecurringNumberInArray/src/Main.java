import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(recurringNumber2(new int[] {1,2,2}));
    }

    public static int recurringNumber1(int[] arr) {
        HashSet<Integer> arrSet = new HashSet<>();
        for(int num: arr) {
            if(arrSet.contains(num)) return num;
            arrSet.add(num);
        }
        return -1;
    }
    public static int recurringNumber2(int[] nums) {
        for(int i = 0 ; i < nums.length ;) {
            if(nums[i]>0) {
                nums[nums[i]] = -1 * nums[nums[i]];
                i = -1 * nums[Math.abs(nums[i])];
                if(i<0) {
                    i = -1 * i;
                    return nums[i];
                }
            } else {
                return i;
            }
        }
        return -1;
    }
}