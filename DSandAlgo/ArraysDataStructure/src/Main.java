import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[10];
        arr2[0] = 10;
        arr2[1] = 100;
        arr2[2] = 1000;
        arr2[3] = 10000;
        arr2[4] = 100000;
        arr2[5] = 1000000;
        arr2[6] = 10000000;
        arr2[7] = 100000000;
        arr2[8] = 10000000;
        arr2[9] = 100000;
        char[] arr3 = new char[4];
        char[] arr4 = {'a','b','c'};
        System.out.println(Arrays.stream(arr1).max());
        System.out.println(Arrays.stream(arr2).max().getAsInt());
        int[] clone = arr1.clone();
        arr1[1] = 10;
        System.out.println(arr1[1]);
        System.out.println(clone[1]);
    }
}