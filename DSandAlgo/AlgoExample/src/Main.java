import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5,44,33,22,11};
        int[] arr2 = Arrays.stream(arr1).sorted().toArray();
        System.out.println(Arrays.toString(arr2));
    }
}