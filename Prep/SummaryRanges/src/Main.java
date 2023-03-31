import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int count=0;
        for (int i=0;i<nums.length;i++) {
            if(i<nums.length-1 && (nums[i+1]-nums[i]==1)) {
                count++;
            }
            else {
                if(count==0) {
                    list.add(nums[i]+"");
                } else {
                    list.add(nums[i-count]+"->"+nums[i]);
                    count=0;
                }
            }
        }
        return list;
    }
}