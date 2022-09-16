import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num: nums) {
            if(numsSet.contains(num)) {
                return true;
            } else {
                numsSet.add(num);
            }
        }
        return false;
    }
}