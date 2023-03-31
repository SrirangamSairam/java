public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i: quickSort(new int[]{1,4,5,2,6,3,8,1}, 0, 7)) {
            System.out.println(i);
        }
    }
    private static int[] quickSort(int[] arr, int start, int end) {
        if(start<end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotPos = end;
        for(int j=start;j<end-1;j++) {
            if(arr[j]>pivot) {
                arr[pivotPos] = arr[j];
                arr[j] = arr[pivotPos-1];
                arr[pivotPos-1] = pivot;
                pivotPos--;
            }
        }
    }
}