import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        for(int number: kLargest(new int[]{8,2,3,4,5},5,2)) {
            System.out.println(number);
        }
    }

    public static int[] kLargest(int[] arr, int n, int k) {
        Queue<Integer> numbers = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i: arr) {
            numbers.add(i);
        }
        int[] result = new int[k];
        for (int i=0;i<k;i++) {
            result[i] = numbers.poll();
        }
        return result;
    }
}