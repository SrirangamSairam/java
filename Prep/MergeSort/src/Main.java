public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i: mergeSort(new int[]{1,4,5,2,6,3,8,1})) {
            System.out.println(i);
        }
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 0) return arr;
        sort(arr, 0, arr.length-1);
        return arr;
    }

    private static void sort(int[] arr, int start, int end) {
        if(start<end) {
            int mid = (start + end) / 2;
            sort(arr, 0, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for(int i=0;i<n1;i++) {
            leftArray[i] = arr[start + i];
        }
        for(int j=0;j<n2;j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i=0,j=0;
        int k = start;
        while (i<n1 && j<n2) {
            if(leftArray[i]<rightArray[j]) {
                arr[k++] = leftArray[i++];
            }
            else
                arr[k++] = rightArray[j++];
        }
        while (i<n1) {
            arr[k++] = leftArray[i++];
        }
        while (j<n2) {
            arr[k++] = rightArray[j++];
        }
    }
}