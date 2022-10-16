import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstRepeated(new int[] {1,2,3,2,3,4},6));
        System.out.println("Hello world!");
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) {
            if(map.containsKey(i)){
                map.put(i,(map.get(i)+1));
            } else
                map.put(i,1);
        }
        for(int i=0;i<n;i++) {
            if(map.get(arr[i])>1) {
                return i+1;
            }
        }
        return -1;
    }
}