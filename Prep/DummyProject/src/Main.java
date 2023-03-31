import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(maxDist(new int[]{1,2,3,2,5,1,1,2,6,2,7,8,6}));
    }

    public static int maxDist(int[] arr) {
        int dist = 0;
        int secondDist = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                dist = Math.max(dist, i - map.get(arr[i]));
                if(secondDist<i - map.get(arr[i]) && secondDist<dist) {
                    secondDist = i - map.get(arr[i]);
                }
                map.put(arr[i],dist);

            } else
                map.put(arr[i],i);
        }
        return secondDist;
    }

    public static int index(int[] arr, int ele) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==ele) return i;
        }
        return -1;
    }


}