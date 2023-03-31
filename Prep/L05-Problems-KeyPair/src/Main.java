import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println(hasArrayTwoCandidates(new int[]{2,2,3,4,5},5,9));
        for (int number: returnTwoCandidates(new int[]{2,2,3,4,5},5,6)) {
            System.out.println(number);
        }
    }
    public static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        Set<Integer> set = new HashSet<>(); //using hashset since index of elements is not required
        for(int i : arr) {
            if(set.contains(i)) {
                return true;
            } else {
                set.add(x-i);
            }
        }
        return false;
    }

    public static int[] returnTwoCandidates(int[] arr, int n, int x) {
        Map<Integer, Integer> map = new HashMap<>(); //using hashmap when index of elements is not required
        int[] result = new int[2];
        for (int i=0;i<n;i++) {
            if(map.containsKey(arr[i])) {
                result[1] = i+1;
                result[0] = map.get(arr[i])+1;
            } else {
                map.put(x-arr[i],i);
            }
        }
        return result;
    }
}