public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i: bubbleSort(new int[]{1,4,5,2,6,3,8,1})) {
            System.out.println(i);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        return arr;
    }
}