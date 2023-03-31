import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstRepeated(new int[]{10,2,9,6,1,3,4,8,5}, 9));
    }

//    public static int firstRepeated(int[] arr, int n) {
//        for(int i=0;i<n;i++) {
//            for(int j=i+1;j<n;j++) {
//                if(arr[i]==arr[j]) {
//                    return i+1;
//                }
//            }
//        }
//        return -1;
//    }
    public static int firstRepeated(int[] arr, int n) {
//        Set<Integer> numbers = new HashSet<>(); //if asked to return 1st duplicate number
        Map<Integer,Integer> numbers = new HashMap<>(); //if asked to return occurrence of 1st duplicate
        for(int i=0;i<n;i++) {
            if(numbers.containsKey(arr[i])) {
                numbers.put(arr[i], numbers.get(arr[i])+1);
            } else {
                numbers.put(arr[i],1);
            }
//            numbers.put(arr[i], numbers.getOrDefault(arr[i], i) + 1);
        }
        for (int i=0;i<n;i++) {
            if(numbers.get(arr[i])>1) {
                return i+1;
            }
        }
        return -1;
    }
}