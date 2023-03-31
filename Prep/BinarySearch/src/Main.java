public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(binarySearch(new int[]{11,14,17,19,22,25,43},0,7,23));
    }

    public static int binarySearch(int[] arr, int start, int end, int num) {
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(arr[mid] == num) return mid + 1;
        if(num>arr[mid]) {
            return binarySearch(arr, mid+1, end, num);
        }else {
            return binarySearch(arr, start, mid-1, num);
        }
    }
}