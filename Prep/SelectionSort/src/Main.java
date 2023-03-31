public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i: selectionSort(new int[]{1,4,5,2,6,3,8,1})) {
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int[] arr) {
        if (arr.length == 0) return arr;
        for(int i=0;i<arr.length;i++) {
            int min = i;
            int small = arr[i];
            for (int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            arr[i] = arr[min];
            arr[min] = small;
        }
        return arr;
    }
}