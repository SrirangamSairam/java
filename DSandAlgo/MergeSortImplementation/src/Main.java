public class Main {
    public static void main(String[] args) {
        int[] newNums = new int[] {10,234,56,2,6,4,23,76,0,8,1,3,7};
//        int[] sortedNums = mergeSort(newNums,0, newNums.length-1);
//        for(int num: sortedNums) {
//            System.out.println(num);
//        }
        System.out.println("Hello world!");
    }

    public static void mergeSort(int[] nums, int left, int right) {
        if(left<right) {
            int middle = left + (right - 1) / 2;
            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);
            merge(nums,left,middle,right);
        }
    }
    public static void merge(int[] nums, int left, int middle, int right) {

    }
}