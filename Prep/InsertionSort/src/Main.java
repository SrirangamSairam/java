public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i: insertionSort(new int[]{1,4,5,2,6,3,8,1})) {
            System.out.println(i);
        }
    }

    private static int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}